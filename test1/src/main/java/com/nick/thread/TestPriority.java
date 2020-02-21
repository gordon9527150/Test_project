package com.nick.thread;

/**
 * 测试线程优先级
 */

class PriorityT implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " 线程运行 " + i);
        }
    }
}

public class TestPriority {
    public static void main(String[] args){
            Thread t1 = new Thread(new PriorityT(),"线程A");
            Thread t2 = new Thread(new PriorityT(),"线程B");
            Thread t3 = new Thread(new PriorityT(),"线程C");

            t1.setPriority(10);t1.start();
            t2.setPriority(1);t2.start();
            t3.setPriority(Thread.NORM_PRIORITY);t3.start();
    }

}
