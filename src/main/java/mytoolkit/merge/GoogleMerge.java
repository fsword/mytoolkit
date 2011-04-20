package mytoolkit.merge;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;

import java.util.Collection;
import java.util.List;

/**
 * User: john
 * Date: 2010-8-12
 * Time: 11:05:34
 */
public class GoogleMerge {
    public static void main(String[] args) {
        List<Item> items = Item.allItems();
        makeOrderIds1(items);
    }

    private static void makeOrderIds1(List<Item> items) {
        Collection<Integer> orderIds = Collections2.transform(items, new Function<Item, Integer>() {
            public Integer apply(Item item) {
                return item.getOrderId();
            }
        });

        for(Integer orderId: orderIds){
            System.out.println(orderId);
        }
    }
}
