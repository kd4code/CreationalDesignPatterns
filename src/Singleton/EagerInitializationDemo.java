package Singleton;

class Student
{
  private int id;
  private String name;
  
  private static Student s1=new Student(101,"Ram");//private static instance
  
  private Student() {};
  
  private Student(int id,String name) //private Constructor
  {
	this.id=id;
	this.name=name;
  }
  
  public static Student getInstance()
  {
	  return s1;
  }
  
}
public class EagerInitializationDemo {
  public static void main(String[] args) {
	Student s2=Student.getInstance();
	Student s3=Student.getInstance();
	
	System.out.println(s2.hashCode()+" "+s3.hashCode());
   
  }
}
