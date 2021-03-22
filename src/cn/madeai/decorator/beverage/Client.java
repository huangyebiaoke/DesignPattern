package cn.madeai.decorator.beverage;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 19:25
 */
public class Client {
    public static void main(String[] args) {
        Beverage beverage1=new Coffee();
        beverage1=new MilkDecorator(beverage1);
        beverage1=new MilkDecorator(beverage1);
        beverage1=new SurgeDecorator(beverage1);
        System.out.println(beverage1.getDescription()+" cost $"+beverage1.cost());
    }
}
