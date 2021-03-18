package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 17:02
 */
public class SimpleRemoteControl {
    private ICommand commandSlot;
    public void setCommand(ICommand command){
        this.commandSlot=command;
    }
    public void buttonPressed(){
        commandSlot.execute();
    }
}
