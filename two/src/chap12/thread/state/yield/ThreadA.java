package chap12.thread.state.yield;

public class ThreadA extends Thread {
	public boolean stop = false; //종료플레그
	public boolean work = true; //작업 진행 여부플레그
	
	public void run() {
		while(!stop) {
			if (work) {
				System.out.println("ThreadA 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreaA 종료");
	}
	

}
