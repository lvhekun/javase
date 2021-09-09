package com.itheima.Interface.test3;

public class TestInterface {
    public static void main(String[] args) {
        InterAImpl ia = new InterAImpl();
        ia.show();
    }
}

class InterAImpl implements InterA, InterB {

    @Override
    public void show() {

    }
}
