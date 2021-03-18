package cn.madeai.decorator;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 19:03
 */
public class Coffee extends Beverage {
    public Coffee() {
        this.description="Coffee";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
