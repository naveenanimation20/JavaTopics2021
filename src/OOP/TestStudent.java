package OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author naveenautomationlabs
 *
 */
public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("Tom", 1, 90, 15);
		Student s2 = new Student("Peter", 2, 80, 16);
		Student s3 = new Student("Lisa", 3, 95, 17);
		Student s4 = new Student("Robby", 4, 100, 15);
		Student s5 = new Student("Naveen", 5, 50, 14);

		// add all the student objects to the ArrayList:
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);

		System.out.println("total students: " + studentList.size());

		for (Student s : studentList) {
			System.out.println(s);
		}

		studentList.stream().forEach(e -> System.out.println(e));

		// name where marks>80
		studentList.stream().filter(e -> e.getMarks() > 80)
				.forEach(e -> System.out.println(e.getName() + " : " + e.getMarks()));

		// name who got the highest marks:
		int hm = studentList.stream().map(e -> e.getMarks()).max(Integer::compare).get();
		System.out.println("highest marks: " + hm);

		studentList.stream().filter(e -> e.getMarks() == hm).forEach(e -> System.out.println(e));

	}

}
