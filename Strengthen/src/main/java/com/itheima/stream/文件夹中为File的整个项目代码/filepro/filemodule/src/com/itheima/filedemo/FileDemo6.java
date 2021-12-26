package com.itheima.stream.文件夹中为File的整个项目代码.filepro.filemodule.src.com.itheima.filedemo;


import java.io.File;

public class FileDemo6 {

    public static void main(String[] args) {

       File file = new File("D:\\aaa");
        File[] files = file.listFiles();//返回值是一个File类型的数组
        System.out.println(files.length);
        for (File path : files) {
            System.out.println(path);
        }

        //进入文件夹,获取这个文件夹里面所有的文件和文件夹的File对象,并把这些File对象都放在一个数组中返回.
        //包括隐藏文件和隐藏文件夹都可以获取.

        //注意事项:
            //1.当调用者是一个文件时
            //2,当调用者是一个空文件夹时
            //3.当调用者是一个有内容的文件夹时
            //4.当调用者是一个有权限才能进入的文件夹时

    }
}
