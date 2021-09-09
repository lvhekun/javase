package com.itheima.mBasic;

/**
 * @Auther: lhk
 * @Date: 2021/9/4 12:25
 * @Description:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，
 * 它的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class T5 {
    public static void main(String[] args) {
        double i = 0.2;
        int count = 1 ;
        while (i < 8844430){
            i *= 2;
            count++;
        }
        System.out.println(count);
    }
}
