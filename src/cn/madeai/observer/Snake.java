package cn.madeai.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 15:54
 */
public class Snake implements Object{
    private String name;
    private List<Mouse> mouseList=new ArrayList<>();

    public Snake(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        mouseList.add((Mouse) observer);
    }

    @Override
    public void detach(Observer observer) {
        mouseList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Snake="+name+":I want eat mouse");
        for (Mouse mouse:mouseList) {
            mouse.update();
        }
    }
}
