package Prototype;

interface Prototype
{
  public Prototype getClone();
}

class Student implements Prototype
{
  private int id;
  private  String name;
  
  public Student() {
	  System.out.println("New Object Prototype is created ");
  }
  
  public Student(int id,String name)
  {
	this();
	this.id=id;
	this.name=name;
  }
  public Prototype getClone()
  {
	 return new Student(id,name);
  }
}
public class PrototypeDemo  {
	public static void main(String[] args) {
		Student s1=new Student(101,"Ram");
		Student s2=(Student) s1.getClone();
		System.out.println(s1.hashCode()+" "+s2.hashCode() );
	}
}
