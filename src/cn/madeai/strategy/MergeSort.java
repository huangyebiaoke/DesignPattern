package cn.madeai.strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/22 16:06
 */
public class MergeSort extends SortStrategy{
    @Override
    public void sort(List<Integer> list) {
//        TODO: implement merge sort function
        Collections.sort(list);
    }
}
