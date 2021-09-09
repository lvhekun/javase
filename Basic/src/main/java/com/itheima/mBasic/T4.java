package com.itheima.mBasic;

/**
 * @Auther: lhk
 * @Date: 2021/9/4 12:12
 * @Description:每行打印两个水仙花数
 */
public class T4 {
    public static void main(String[] args) {
        int b;
        int s;
        int g;
        int n = 0;
        System.out.println(1);
        for (int i = 100; i <1000 ; i++) {
            b = i / 100;
            s = i /10 % 10;
            g = i % 10;

            if (i == b * b * b + s *  s * s + g * g * g){
                System.out.print(i+" ");
                n++;
                if (n >= 2){
                    n=0;
                    System.out.println();
                }
            }
        }
    }
}
