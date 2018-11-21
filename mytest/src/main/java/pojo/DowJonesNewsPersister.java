package pojo;

/**
 * Description
 *
 * @author: Administrator
 * @date: 2018/11/17 0017
 */
public class DowJonesNewsPersister implements IFXNewsPersister {

    @Override
    public void persistNews(String news) {
        System.out.println(news);
    }
}
