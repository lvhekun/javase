package com.itheima.mBasic;

/**
 * @Auther: lhk
 * @Date: 2021/9/4 12:25
 * @Description:�������ɽ�������������(8844.43��=8844430����)����������һ���㹻���ֽ��
 * ���ĺ����0.1���ס����ʣ����۵����ٴΣ������۳����������ĸ߶�?
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
