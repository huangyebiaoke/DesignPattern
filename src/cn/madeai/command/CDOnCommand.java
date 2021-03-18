package cn.madeai.command;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 17:54
 */
public class CDOnCommand implements ICommand{
    private CD cd;
    public CDOnCommand(CD cd) {
        this.cd=cd;
    }

    @Override
    public void execute() {
        cd.on();
        cd.setCDName("ParkDance");
        cd.setVolume(11);
    }
}
