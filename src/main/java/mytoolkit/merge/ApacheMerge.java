package mytoolkit.merge;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * User: john
 * Date: 2010-8-11
 * Time: 20:48:48
 */
public class ApacheMerge {
    public static void main(String[] args) {
        List<Item> items = Item.allItems();
        makeOrderIds1(items);
        makeOrderIds2(items);
        String idString = StringUtils.join(ListUtils.transformedList(items, new Transformer() {
            public Object transform(Object input) {
                return ((Item)input).getOrderId();
            }
        }),",");
//        String idString = makeOrderIds3(items);

        Map<Integer,Order> orderMap = new HashMap<Integer, Order>();
        for(Order order: Order.findOrders(idString)){
            orderMap.put(order.getId(),order);
        }

        for(Item item: items){
            item.setOrder(orderMap.get(item.getOrderId()));
        }

        for(Item item: items){
            System.out.println(item.getOrder());
        }
        System.out.println(orderMap.size());
    }

    private static void makeOrderIds1(List<Item> items) {
        List orderIds = ListUtils.transformedList(items, new Transformer() {
            public Object transform(Object input) {
                return ((Item)input).getOrderId();
            }
        });

        System.out.println(orderIds.iterator().next());
    }

    private static void makeOrderIds2(List<Item> items) {
        List orderIds = ListUtils.transformedList(new ArrayList(), new Transformer() {
            public Object transform(Object input) {
                return ((Item)input).getOrderId();
            }
        });
        orderIds.addAll(items);

        System.out.println(orderIds.iterator().next());
    }

    private static String makeOrderIds3(List<Item> items) {
        Set orderIds = SetUtils.transformedSet(new HashSet(), new Transformer() {
            public Object transform(Object input) {
                return ((Item)input).getOrderId();
            }
        });
        orderIds.addAll(items);

        return StringUtils.join(orderIds,",");
    }

}
