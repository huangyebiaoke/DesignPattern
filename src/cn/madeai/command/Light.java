package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 16:55
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }
    public void on(){
        System.out.println(name+" light turn on.");
    }
    public void off(){
        System.out.println(name+" light turn off.");
    }
}
