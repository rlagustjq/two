package chap18.three;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력>");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		
		System.out.print("정수 입력>");
		int inputint = scanner.nextInt();
		System.out.println(inputint);
		System.out.println();
		
		System.out.print("실수 입력>");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
	
		
		
		


	}

}
