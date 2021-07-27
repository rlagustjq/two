package chap14.five.two;

import java.util.function.IntSupplier;

public class supplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 :" + num);

	}

}
