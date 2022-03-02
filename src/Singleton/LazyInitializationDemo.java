package Singleton;

class Employee extends Thread
{
  private int id;
  private String name;
  
  private Employee() {}
  private Employee(int id,String name)
  {
	this.id=id;
	this.name=name;
  }
  
  private static Employee emp=null;
  public static Employee getInstance()
  {  System.out.println("Thread is created"+currentThread().getName());
	 if(emp==null)
	 {
	   emp=new Employee(101,"Ram");	 
	 }
	 return emp;
  }
}
public class LazyInitializationDemo {
   public static void main(String[] args) {
	Thread emp1=Employee.getInstance();
	Thread emp2=Employee.getInstance();
	
	System.out.println(emp1.hashCode()+" "+emp2.hashCode());
}
}
