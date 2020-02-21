package com.nick.thread;

/**
 * 继承Thread
 */
public class TestThread {
    public static void main(String[] args){
        new TThread().start();
        new TThread().start();

    }
}

class TThread extends Thread{
  /*  private String name;

    public TThread(String name){
        this.name = name;
    }
*/    @Override
    public void run() {
        for (int i=0; i<10; i++)
            System.out.println(Thread.currentThread().getName() + " i的值为： "+  + i);
    }
}
