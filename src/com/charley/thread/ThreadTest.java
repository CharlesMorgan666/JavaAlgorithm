package com.charley.thread;

import java.util.concurrent.TimeUnit;

/**使用Thread的interrupt方法终止线程
 * @author 莫昌廉
 */
public class ThreadTest {
    private static int i=0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            while(!Thread.currentThread().isInterrupted())
            {
                i++;
            }
            System.out.println("I="+i);
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}
