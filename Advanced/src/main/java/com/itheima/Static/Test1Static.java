package com.itheima.Static;

public class   Test1Static {
    /*
        1. 被static修饰的成员, 会被该类的所有对象所[共享]
        2. 被static修饰的成员, 会随着类的加载而加载, 优先于对象存在
        3. 多了一种调用方式, 可以通过类名.进行调用
     */
    public static void main(String[] args) {
        Student.school = "传智专修学院";
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;
        //stu1.school = "传智专修学院";
        stu1.show();

        Student stu2 = new Student();
        stu2.show();

        method();
    }

    public static void method(){

    }
}
