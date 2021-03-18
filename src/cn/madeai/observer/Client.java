package cn.madeai.observer;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 13:16
 */
public class Client {
    public static void main(String[] args) {
        Cat c1=new Cat("Tom1");
        Cat c2=new Cat("Tom2");
        Mouse m1=new Mouse("Jary1");
        Mouse m2=new Mouse("Jary2");
        Dog d1=new Dog("Dog1");
        Dog d2=new Dog("Dog2");

        c1.attach(m1);
        c1.attach(m2);
        c1.attach(d1);
        c1.attach(d2);

        c2.attach(m2);

        c1.cry();
        c2.cry();

        c1.detach(m1);
        c1.detach(d1);
        c1.cry();
    }
}
