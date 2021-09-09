package com.itheima.mBasic;

import javax.sound.midi.Soundbank;

public class T1 {
    public static void main(String[] args) {
        //byte类型参与算术运算会自动提示为int，int赋值给byte可能损失精度
        byte i = 10;
        byte n = 20;
        System.out.println(i);
        System.out.println(n);
        byte s = (byte) (i + n);

    }
}
