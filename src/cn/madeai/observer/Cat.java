package cn.madeai.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 13:13
 */
public class Cat implements Object{
    private String name;
    private List<Observer> observerList=new ArrayList<>();
    public Cat(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println("cat="+name+":喵喵喵...");
        notifyObserver();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observerList) {
            observer.update();
        }

    }
}
