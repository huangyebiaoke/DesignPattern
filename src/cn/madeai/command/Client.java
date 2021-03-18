package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 17:05
 */
public class Client {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
        Light light=new Light("Living room");

        LightOnCommand lightOnCommand=new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonPressed();

        LightOffCommand lightOffCommand=new LightOffCommand(light);
        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonPressed();
    }
}
