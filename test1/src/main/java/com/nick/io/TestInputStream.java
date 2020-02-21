package com.nick.io;

import java.io.*;

/**
 * 测试字节输入流
 *  将数据输入到文件中
 */
public class TestInputStream {
    public static void main(String[] args){
        BufferedInputStream bis = null;
        try{
            // 创建流对象，建立通道
            bis = new BufferedInputStream(
                    new FileInputStream("D:\\test\\a.txt"));

            // 调用方法读取数据，
            byte[] b = new byte[1024];
            int leng = 0;

            // 遍历，
            while ((leng = bis.read(b)) != -1){
                // 字节数组转换成字符串
                System.out.println(new String(b,0,leng));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (bis != null){
                try{
                    bis.close();
                } catch (Exception e){
                    bis = null;
                }
            }
        }
    }

}
