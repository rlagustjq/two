package chap12.thread.state;

public class TargetThread extends Thread {
      public void run() {
    	  for(long i=0; i<1000000000; i++) {}
    	  
    	  
    	  try {
			// 1.5초간 정지
    		  Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	  for(long i=0; i<1000000000;i ++) {}
      }
}
