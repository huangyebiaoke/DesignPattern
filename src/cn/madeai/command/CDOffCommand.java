package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 17:57
 */
public class CDOffCommand implements ICommand{
    private CD cd;
    public CDOffCommand(CD cd) {
        this.cd=cd;
    }
    @Override
    public void execute() {
        cd.off();
    }
}
