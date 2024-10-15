package com.company;

class Thread1 extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Good Morning");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread2 extends Thread{
    /*
    @Override
    public void run() {
        while(true){
            System.out.println("Welcome");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
     */
}

public class PracticeSet_Ch13 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.println(t2.getState());
        //t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());/*currentThread returns the thread object for the
        current thread(The one that has started)*/
        //t1.setPriority(7);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        /*
        * MAX_PRIORITY
        * NORM_PRIORITY
        * MIN_PRIORITY
        * */
    }
}
