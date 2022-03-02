package Singleton;

class A
{
  private static A a;
  
  private A() {}
  
  static {
	  a=new A();
  }
  public static A getInstance()
  {
	return a;  
  }
}
public class StaticBlockInitializationDemo {
  public static void main(String[] args) {
	  A a1=A.getInstance();
	  A a2=A.getInstance();
	  System.out.println(a1.hashCode()+" "+a2.hashCode());
}
	
  
  
}
