package chap12.thread.state.join;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("1~100 합: " +sumThread.getSum());

	}

}
