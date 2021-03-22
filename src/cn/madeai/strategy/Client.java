package cn.madeai.strategy;

import java.util.Random;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/22 16:17
 */
public class Client {
    public static void main(String[] args) {
        SortContext list=new SortContext();
        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }
        list.display();
        list.setSortStrategy(new MergeSort());
        list.sort();
        list.display();
    }
}
