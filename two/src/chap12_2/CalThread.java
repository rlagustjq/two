package chap12_2;

public class CalThread extends Thread {
	public CalThread(String name) {
		setName(name);
	}
	public void run() {
		for(int i=0; i<2000000000; i++) {

}
	System.out.println(getName());
}
}