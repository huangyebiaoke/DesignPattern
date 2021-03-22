package cn.madeai.decorator.tank;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/22 15:44
 */
public class Location extends Feature{
    Tank tank;
    public Location(Tank tank) {
        this.tank = tank;
    }
    @Override
    public String getDesc() {
        return tank.getDesc()+" with Location feature";
    }
}
