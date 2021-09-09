package com.itheima.Lambda.test1;

public class TestSwimming {
    public static void main(String[] args) {
        goSwimming(() -> System.out.println("铁汁, 我们去游泳吧"));

        /*
            理解: 对于Lambda表达式, 对匿名内部类进行了优化
         */
        goSwimming(() -> System.out.println("铁汁, 我们去游泳吧"));
    }

    /**
     * 使用接口的方法
     */
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}

/*
    游泳接口
 */
interface Swimming {
    void swim();
}
