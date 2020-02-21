package com.nick.thread;

/**
 * 测试sleep方法,让线程休眠
 */
class SleepT extends Thread{
    @Override
    public void run() {
        for (int i=0; i<20; i++){
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 线程运行： " + i);
        }
    }
}

public class TestSleep {
    public static void main(String[] args){
               new SleepT().start();
    }
}
