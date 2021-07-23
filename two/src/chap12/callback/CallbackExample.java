package chap12.callback;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	private ExecutorService executorService;

  public CallbackExample() {
	  executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
       CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

		@Override
		public void completed(Integer result, Void attachment) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			// TODO Auto-generated method stub
			
		}
    	   
    	   
	};

	}

  
}
