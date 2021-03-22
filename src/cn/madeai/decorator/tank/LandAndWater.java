package cn.madeai.decorator.tank;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/22 15:55
 */
public class LandAndWater extends Feature{
    Tank tank;
    public LandAndWater(Tank tank) {
        this.tank = tank;
    }
    @Override
    public String getDesc() {
        return tank+" with LandAndWater feature";
    }
}
