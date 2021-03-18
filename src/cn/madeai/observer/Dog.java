package cn.madeai.observer;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 13:14
 */
public class Dog implements Observer{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Dog="+name+":汪汪汪,don't cry");
    }
}
