package com.itheima.Interface.test2;

public class TestInterface {
    /*
        成员变量: 只能是常量 系统会默认加入三个关键字
                    public static final

        构造方法: 没有

        成员方法: 只能是抽象方法, 系统会默认加入两个关键字
                    public abstract
     */
    public static void main(String[] args) {
        System.out.println(Inter.NUM);
    }
}

class InterImpl  implements Inter{

    public InterImpl(){
        super();
    }

    public void method(){
        // NUM = 20;
        System.out.println(NUM);
    }

    public void show(){

    }
}



