package com.itheima.Interface.test7;

public interface InterB {
    public abstract void showB();

    public default void method(){
        System.out.println("InterB...method方法");
    }
}
