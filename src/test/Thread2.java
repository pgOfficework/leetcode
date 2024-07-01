package test;

public class Thread2 implements Runnable {
    public void run() {
        System.out.println("in thread 2");
    }

    public static void main(String[] args) {
        Thread2 thread = new Thread2();
        Thread th = new Thread(thread);
        th.start();

    }

}
