package cn.madeai.decorator.beverage;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 19:23
 */
public class SurgeDecorator extends CondimentDecorator{
    Beverage beverage;
    public SurgeDecorator(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"+surge";
    }

    @Override
    public double cost() {
        return beverage.cost()+.2;
    }
}
