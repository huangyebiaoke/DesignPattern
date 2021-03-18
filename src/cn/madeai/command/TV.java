package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 17:14
 */
public class TV {
    private String name;

    public TV(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name+" TV turn on.");
    }
    public void off(){
        System.out.println(name+" TV turn off.");
    }
}
