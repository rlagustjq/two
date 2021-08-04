package chap18.five.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long start = 0;
		long end = 0;
		FileInputStream fis1 = new FileInputStream(
				"C:/Program Files/Internet Explorer/ko-KR/dundundance.mp3");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.out.printf("사용하지 않을 때 : " + (end-start) + "ms");
		fis1.close();
		

	}

}
