package com.nick.thread;

/**
 * 测试interrupt()方法，打断线程
 */
class InT extends Thread{
    @Override
    public void run() {
        System.out.println("我是Thread子线程，执行run方法！"); // 表示该方法执行啦
        try{
            Thread.sleep(10000); // 睡十秒钟
            System.out.println("我是醒来的方法！");
        } catch (Exception e){
            System.out.println("线程被打断，无法醒过来。"); // 线程被打断，则捕获，抛出指定语句
        }
    }
}

public class TestInterrupt {
    public static void main(String[] args){
        InT t1 = new InT();
        t1.start();
        System.out.println("主线程执行！");

        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("主线程休眠结束！");
        }
        t1.interrupt();
    }
}
