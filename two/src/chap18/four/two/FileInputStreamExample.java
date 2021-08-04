package chap18.four.two;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream(
					"D:/khs_data/java_data/two/src/chap18/four/two/FileInputStreamExample.java");
			        
			         int data;
			         while ( (data = fis.read() ) != -1 ) {
			        	 System.out.println(data);
			         }
			         
			         fis.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

