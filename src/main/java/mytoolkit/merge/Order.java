package mytoolkit.merge;

import java.util.ArrayList;
import java.util.List;

/**
 * User: john
 * Date: 2010-8-11
 * Time: 20:49:36
 */
public class Order {
    private Integer id;
    private String name;

    public Order(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 根据传入的字符串进行切割（分隔符为,号），将切割后的结果解析为整型id，获得一组order对象
     * @param idstring
     * @return
     */
    static List<Order> findOrders(String idstring) {
        String[] ids = idstring.split(",");

        List<Order> orders = new ArrayList<Order>();

        for(int i = 0; i < ids.length; i++){
            if(ids[i].matches("\\d")){
                orders.add(new Order("order 0"+(i+1),Integer.parseInt(ids[i])));
            }
        }
        return orders;
    }

}
