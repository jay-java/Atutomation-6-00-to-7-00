package core;

import java.sql.Time;
import java.time.LocalDateTime;

class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadByRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class P022_Thread {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		long start = System.currentTimeMillis();
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Thread1 t1 = new Thread1();
		t1.run();
		ThreadByRunnable t2=  new ThreadByRunnable();
		t2.run();
		
		long end = System.currentTimeMillis();
		System.out.println("total time taken for exexcute : "+(end-start));
	}
}
