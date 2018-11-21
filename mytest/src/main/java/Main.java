import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import pojo.FXNewsProvider;

/**
 * Description
 *
 * @author: Administrator
 * @date: 2018/11/17 0017
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        FXNewsProvider newsProvider = (FXNewsProvider) container.getBean("djNewsProvider");
        newsProvider.getAndPersistNews();

        /*ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        FXNewsProvider newsProvider = (FXNewsProvider) container.getBean("djNewsProvider");
        newsProvider.getAndPersistNews();*/
    }
}
