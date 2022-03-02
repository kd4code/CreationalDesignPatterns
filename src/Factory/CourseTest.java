package Factory;

import java.util.Scanner;

public class CourseTest {

	public static void main(String[] args) {
		Course c = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Course name for Details..");
		String s = sc.nextLine();
		if (s != null) {
			c = CourseFactory.getCourse(s);
			if (c != null) {
				System.out.println("*******COURSE DETAILS*******");
				System.out.println("Name: " + c.getName());
				System.out.println("Duration: " + c.getDuration());
				System.out.println("Fees: " + c.getFees());
			} else
				System.out.println("Please Enter a valid Course");
		}

		else
			System.out.println("Please Enter a valid Course");

	}
}
