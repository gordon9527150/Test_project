package com.nick.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 测试Writer
 *  将数据写入到文本文件中
 */
public class TestWriter {
    public static void main(String[] args){
        // 创建流对象 建立通道
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("D://test//c.txt")));

            // 调用输出方法
            String s = "我是测试文本数据，asdfadf";
            bw.write(s);
            bw.flush();

            // 输出结果
            System.out.println("写入成功！");
        } catch (Exception e){
            e.printStackTrace();
        }



    }
}
