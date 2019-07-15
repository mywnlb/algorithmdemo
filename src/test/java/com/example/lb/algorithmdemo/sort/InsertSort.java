package com.example.lb.algorithmdemo.sort;

/**
 * describe:插入排序
 *
 * @author lb
 * @date 2019/07/10
 */
public class InsertSort extends Example {
    public static void sort(Comparable[] a){
        int N = a.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }

    }
}
