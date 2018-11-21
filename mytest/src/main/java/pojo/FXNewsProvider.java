package pojo;

/**
 * Description
 *
 * @author: Administrator
 * @date: 2018/11/17 0017
 */
public class FXNewsProvider {

    public IFXNewsListener getNewsListener() {
        return newsListener;
    }

    public void setNewsListener(IFXNewsListener newsListener) {
        this.newsListener = newsListener;
    }

    public IFXNewsPersister getNewsPersister() {
        return newsPersister;
    }

    public void setNewsPersister(IFXNewsPersister newsPersister) {
        this.newsPersister = newsPersister;
    }

    private IFXNewsListener newsListener;
    private IFXNewsPersister newsPersister;

    public FXNewsProvider(IFXNewsListener listener, IFXNewsPersister persister) {
        this.newsListener = listener;
        this.newsPersister = persister;
    }

    public void getAndPersistNews() {
        String news = newsListener.getNews();
        newsPersister.persistNews(news);
    }
}
