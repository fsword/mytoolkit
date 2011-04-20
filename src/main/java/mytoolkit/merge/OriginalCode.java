package mytoolkit.merge;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: john
 * Date: 2010-8-14
 * Time: 14:34:12
 */
public class OriginalCode {
    public static void main(String[] args) {

        List<Item> items = Item.allItems();

        String orderIds = StringUtils.join(ListUtils.transformedList(items, new Transformer() {
            public Object transform(Object input) {
                return ((Item)input).getOrderId();
            }
        }),",");

        System.out.println(orderIds);

        Map<Integer,Order> orderMap = new HashMap<Integer, Order>();
        for(Order order: Order.findOrders(orderIds)){
            orderMap.put(order.getId(),order);
        }

        for(Item item: items){
            item.setOrder(orderMap.get(item.getOrderId()));
        }
        //now, I should get items,but ...
        for(Item item: items){
            System.out.println(item.getOrder());
        }
        System.out.println(orderMap.size());
    }
}












