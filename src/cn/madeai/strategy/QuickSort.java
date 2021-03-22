package cn.madeai.strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/22 16:09
 */
public class QuickSort extends SortStrategy{
    @Override
    public void sort(List<Integer> list) {
//        TODO: implement quick sort function
        Collections.sort(list);
    }
}
