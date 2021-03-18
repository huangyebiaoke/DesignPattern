package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 16:59
 */
public class LightOnCommand implements ICommand{
    private Light light;

    public LightOnCommand(Light light) {
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
