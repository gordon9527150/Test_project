package com.nick.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 测试字节输出流
 *  写入数据到指定文件
 */
public class TestOutputStream {
    public static void main(String[] args){
        BufferedOutputStream bos = null;
        try{
            // 创建流对象，建立通道
            bos = new BufferedOutputStream(new FileOutputStream("D://test//b.txt"));
            String s = "我是测试数据abcasdfasd！";

            // 调用输出方法，字符串转换成字节数组
            byte[] b = s.getBytes();;
            bos.write(b);
            bos.flush();

            // 显示结果
            System.out.println("写入成功!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
