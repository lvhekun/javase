package com.itheima.mBasic;

import java.util.Scanner;

/**
 * @Auther: lhk
 * @Date: 2021/9/4 11:25
 * @Description:ÊýÖµ²ð·Ö
 */
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int len = i+"".length();
        int qian = i / 1000;
        int bai2 = i / 100 % 10;
        int shi = i / 10 % 10;
        int ge = i % 10;
        System.out.println(i);
        System.out.println(qian);
        System.out.println(bai2);
        System.out.println(shi);
        System.out.println(ge);

    }
}
