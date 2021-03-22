package cn.madeai.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/22 16:10
 */
public class SortContext {
    private List<Integer> list=new ArrayList<>();
    private SortStrategy sortStrategy;
    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy=sortStrategy;
    }
    public void sort(){
        sortStrategy.sort(list);
    }
    public void add(Integer integer){
        list.add(integer);
    }
    public void display(){
        for (Integer i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
