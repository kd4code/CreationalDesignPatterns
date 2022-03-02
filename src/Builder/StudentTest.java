package Builder;

public class StudentTest {
   public static void main(String[] args) {
	
	Student s1=new Student.StudentBuilder(101,"Ram").setCity("Pune").build();
	Student s2=new Student.StudentBuilder(102,"Sham").setStd(5).build();
	System.out.println(s1);
	System.out.println(s2);
}
}
