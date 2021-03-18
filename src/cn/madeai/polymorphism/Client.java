package cn.madeai.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 12:39
 * List Set Map
 */
public class Client {
    public static void main(String[] args) {
        List<Person> people= new ArrayList<>();
        Person p1=new Person("ZhangSan","male");
        people.add(p1);
        people.add(new Person("LiSi","male"));
        people.add(new Student("XiaoMing","male",202071540,"CS1class"));
        people.add(new Teacher("XiaoHong","female","CS","professional"));
        for(Person p:people){
            System.out.println(p.toString());
        }
        people.remove(p1);
        for (Person p:people){
            System.out.println(p.toString());
        }
    }
}
