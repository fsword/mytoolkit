package mytoolkit.delegate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: john
 * Date: 11-9-9
 * Time: 下午3:38
 */
public class DelegateFactory extends DefaultListableBeanFactory implements BeanFactoryPostProcessor {

    private ApplicationContext context;
    private ConfigurableListableBeanFactory beanFactory;

    public DelegateFactory() {
        context = new ClassPathXmlApplicationContext("/mytoolkit/delegate/delegate.xml");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void add(String name){
        beanFactory.registerSingleton(name,context.getBean(name));
    }
}
