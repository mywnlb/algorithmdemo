package com.example.lb.algorithmdemo.sort;

/**
 * describe:选择排序
 *需要二分之N的平方比较和N次替换
 * @author lb
 * @date 2019/07/10
 */
public class SelectSort extends Example{

    public static void sort(Comparable[] a ){
        int N = a.length;

        for(int i = 0;i < N; i++){
            int min = i;
            for(int j = i+1;j<N;j++){
                if(less(a[i],a[min])) min = j;
            }
            exch(a,i,min);
        }
    }
}
