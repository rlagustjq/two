package chap18.four.three;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String originalFileName = "C:/imgsource/dundundance.mp3";
		String targetFileName = "C:/imgterget/dundundance.mp3";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[ ]readBytes = new byte[100];
		while ( (readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fos.close();
		System.out.println("복사가 잘되었다");

	}

}
