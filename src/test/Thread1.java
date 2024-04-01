package test;

public class Thread1 extends Thread {
//	public void run() {
//		System.out.println("in thread 1");
//	}

	public static void main(String[] args) {
		Thread1 thread=new Thread1();
		thread.start();

	}

}
