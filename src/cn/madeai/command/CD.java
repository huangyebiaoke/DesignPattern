package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 17:14
 */
public class CD {
    private String name;
    private String CDName;
    private int volume;

    public CD(String name) {
        this.name = name;
    }
    public void on(){
        System.out.println(name+" CD turn on.");
    }
    public void setCDName(String CDName){
        this.CDName=CDName;
        System.out.println(CDName+" inner "+name+" CD is playing.");
    }
    public void setVolume(int volume){
        this.volume=volume;
        System.out.println("CD's volume is "+volume);
    }
    public void off(){
        System.out.println(name+" CD turn off.");
    }
}
