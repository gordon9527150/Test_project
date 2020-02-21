package com.nick.thread;

/**
 * 测试Runnable创建接口
 */
public class TestRunnable {
    public static void main(String[] args){
        new Thread(new T01(),"线程A").start();
        new Thread(new T01(),"线程B").start();
    }
}

class T01 implements Runnable{

    @Override
    public void run(){
        for (int i=0; i<10; i++) System.out.println(Thread.currentThread().getName() + " 运行 " + i);
    }
}


