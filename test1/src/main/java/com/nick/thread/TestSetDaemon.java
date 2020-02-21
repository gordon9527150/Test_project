package com.nick.thread;

/**
 * 测试后台线程
 */
class  SetDaemonT implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + " 后台线程运行 ");
        }
    }
}

public class TestSetDaemon {
    public static void main(String[] args){
            SetDaemonT s1 = new SetDaemonT();
            Thread t1 = new Thread(s1);
            t1.setDaemon(true); // 设置线程为后台线程
            t1.start();     // jvm退出，则后台线程也会退出，而不会一直运行run方法中的死循环

    }
}
