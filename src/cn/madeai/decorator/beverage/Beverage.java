package cn.madeai.decorator.beverage;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 19:00
 */
public abstract class Beverage {
    protected String description="UnKnow Beverage";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
