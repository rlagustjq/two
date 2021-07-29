package chap16.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = Arrays.asList(
		 "홍길동","신용권","김자바","람다식","박병렬");
		
		//순차처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		
		System.out.println();
		
		//병렬처리
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
		

	}
	
	public static void print(String str) {
		System.out.println(str+":" + Thread.currentThread().getName());
	}

}
