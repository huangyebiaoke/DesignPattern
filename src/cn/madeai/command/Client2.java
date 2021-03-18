package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 18:09
 * TODO:simplify the RemoteControl to only 7 button rather than double 7
 */
public class Client2 {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();

        Light livingRoomLight=new Light("LivingRoom");
        LightOnCommand livingRoomLightOnCommand=new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand=new LightOffCommand(livingRoomLight);
        Light kitchenLight=new Light("Kitchen");
        LightOnCommand kitchenLightOnCommand=new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand=new LightOffCommand(kitchenLight);

        TV bedRoomTV=new TV("BedRoom");
        TVOnCommand bedRoomTVOnCommand=new TVOnCommand(bedRoomTV);
        TVOffCommand bedRoomTVOffCommand=new TVOffCommand(bedRoomTV);

        CD bedRoomCD=new CD("BedRoom");
        CDOnCommand bedRoomCDOnCommand=new CDOnCommand(bedRoomCD);
        CDOffCommand bedRoomCDOffCommand=new CDOffCommand(bedRoomCD);

        remoteControl.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenLightOnCommand,kitchenLightOffCommand);
        remoteControl.setCommand(2,bedRoomTVOnCommand,bedRoomTVOffCommand);
        remoteControl.setCommand(3,bedRoomCDOnCommand,bedRoomCDOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPressed(1);

    }
}
