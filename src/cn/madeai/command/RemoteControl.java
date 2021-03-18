package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 17:14
 */
public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;

    public RemoteControl() {
        onCommands =new ICommand[7];
        offCommands=new ICommand[7];
        NoCommand noCommand=new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }

    public void setCommand(int slot,ICommand onCommand,ICommand offCommand){
        this.onCommands[slot]=onCommand;
        this.offCommands[slot]=offCommand;
    }
    public void onButtonPressed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonPressed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n**************RemoteControl**************\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("slot["+i+"]:"+onCommands[i].getClass().getName()+" "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
