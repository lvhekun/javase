package com.itheima.stream.文件夹中为字节流整个项目代码.ioproject.bytestream.src.com.itheima.output;


import java.io.FileInputStream;
import java.io.IOException;

public class OutputDemo8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("bytestream\\a.txt");
        //1,文件中多个字节我怎么办?
        /*while(true){
            int i1 = fis.read();
            System.out.println(i1);
        }*/

        int b;
        while ((b = fis.read())!=-1){
            System.out.println((char) b);
        }
        fis.close();
    }
}
