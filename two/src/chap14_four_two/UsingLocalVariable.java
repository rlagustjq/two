package chap14_four_two;

public class UsingLocalVariable {
	void method(int arg) {


		int localVar = 40;
		
		//arg = 31;
		//localVar = 41;
		
		MyFunctionInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
			return localVar;
			
		};
		
		fi.method();

	}

}
        