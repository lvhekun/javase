package com.itheima.mBasic;



/**
 * @Auther: lhk
 * @Date: 2021/9/4 12:08
 * @Description:
 */
public class T3 {
    public static void main(String[] args) {
        switch (2){
            case 1:
                System.out.println(1);

            case 2:
                System.out.println(2);
        }
        int sum =0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 ==0){
                sum += i;
            }

        }
        System.out.println(sum);
    }
}
