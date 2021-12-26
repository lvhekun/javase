package com.itheima.stream.文件夹中为字节流整个项目代码.ioproject.bytestream.src.com.itheima.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo6 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //System.out.println(2/0);
            fos = new FileOutputStream("D:\\a.txt");
            fos.write(97);
        }catch(IOException e){
           e.printStackTrace();
        }finally {
            //finally语句里面的代码,一定会被执行.
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
