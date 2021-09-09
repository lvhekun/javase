package com.itheima;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Auther: lhk
 * @Date: 2021/9/7 00:44
 * @Description:
 */
public class T {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 7};
        toString(arr);
        Arrays.sort(arr);
        toString(arr);
        int i = Arrays.binarySearch(arr, 4);
        System.out.println(i);
    }

    public static String toString(int[] arr) {


        System.out.println(Arrays.toString(arr) + "q");
        return Arrays.toString(arr);
    }  // 返回指定数组的内容的字符串表示形式


}
