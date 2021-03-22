package cn.madeai.decorator.beverage;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 19:03
 */
public class Tea extends Beverage {
    public Tea() {
        this.description="Tea";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
