package mytoolkit.merge;

import java.util.ArrayList;
import java.util.List;

/**
 * User: john
 * Date: 2010-8-11
 * Time: 20:49:01
 */
public class Item {

    private String name;
    private Integer id;
    private Integer orderId;
    private Order order;

    public Item(String name, Integer id, Integer orderId) {
        this.name = name;
        this.id = id;
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    static List<Item> allItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("test 01",1,1));
        items.add(new Item("test 02",2,1));
        items.add(new Item("test 03",3,2));
        items.add(new Item("test 04",4,2));
        items.add(new Item("test 05",5,3));
        return items;
    }
}
