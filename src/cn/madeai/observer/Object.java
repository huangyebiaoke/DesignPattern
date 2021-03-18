package cn.madeai.observer;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 13:07
 * publish
 */
public interface Object {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
