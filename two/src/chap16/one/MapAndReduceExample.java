package chap16.one;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		double avg = studentList.stream()
				//중간처리(학생 개체를 점수로 매핑)
				.mapToInt(Student :: getScore)
				
				//최종처리 (평균점수)
				.average()
				.getAsDouble();
		System.out.println("평균점수: " +avg);

	}

}
