package com.nick.thread;

/**
 * 测试join()方法，强制执行线程。
 */

class T1 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<50; i++)
        System.out.println(Thread.currentThread().getName() + " 线程执行 " + i);
    }
}

public class TestJoin {
    public static void main(String[] args){
            T1 z1 = new T1(); //创建线程子类对象
            Thread t1 = new Thread(z1,"线程A");
            t1.start();
            for (int i=0; i<50; i++) {
                if (i > 10)
                    try {
                        t1.join();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                System.out.println("Main线程运行： " + i);
            }
    }
}
