package Singleton;

class Customer extends Thread
{
  private static Customer c=null;
 
  private Customer() {}
  
  public synchronized static Customer getInstance()
  {   
	  System.out.println("New Thread with new instance is created");  
	  if(c==null)
	  {
		//System.out.println("New Thread with new instance is created");  
		c=new Customer();  
	  }
	  return c;
  }
  
  public void run()
  {
	System.out.println("Inside Run, Thread:"+Thread.currentThread().getName());
	getInstance();
  }

}
public class ThreadSafeSingletonDemo {
   
	public static void main(String[] args) {
      Thread t1=Customer.getInstance();
	  Thread t2=Customer.getInstance();
	  System.out.println(t1.hashCode()+" "+t2.hashCode());
	  t1.setName("T1");
	  t2.setName("T2");
	  t1.start();
	  t2.start();
		
	}
}
