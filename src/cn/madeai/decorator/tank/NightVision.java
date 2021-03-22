package cn.madeai.decorator.tank;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/22 15:57
 */
public class NightVision extends Feature{
    Tank tank;
    public NightVision(Tank tank) {
        this.tank = tank;
    }

    @Override
    public String getDesc() {
        return tank.getDesc()+" with NightVision feature";
    }
}
