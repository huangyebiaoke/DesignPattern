package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 18:00
 */
public class TVOffCommand implements ICommand{
    private TV tv;
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.off();
    }
}
