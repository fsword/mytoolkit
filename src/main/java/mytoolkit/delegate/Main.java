package mytoolkit.delegate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: john
 * Date: 11-9-9
 * Time: 下午3:34
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/mytoolkit/delegate/spring.xml");
        System.out.println(context.getBean("hello").toString());
        try{
            System.out.println(context.getBean("hello2").toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        DelegateFactory delegate = (DelegateFactory) context.getBean("delegate");
        delegate.add("hello2");
        System.out.println(context.getBean("hello2").toString());
    }
}
