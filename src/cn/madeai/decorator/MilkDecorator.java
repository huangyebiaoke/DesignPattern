package cn.madeai.decorator;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 19:19
 */
public class MilkDecorator extends CondimentDecorator{
    Beverage beverage;
    public MilkDecorator(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"+milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+.5;
    }
}
