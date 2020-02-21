package com.nick.io;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

/**
 * 测试Reader读取数据
 *  @author Administrator nick
 */
public class TestReader {
    public static void main(String[] args){
        // 创建流对象，建立通道
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("D://test//c.txt")));

            // 调用对应方法
            String line;
            while ((line = br.readLine()) != null) {
                // 打印结果
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }


    }
}
