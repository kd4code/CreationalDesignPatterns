package BillPughSingleton;

public class Voter {
	private Voter()  //private Constructor
	{
		
	}
	
	public static class VoterInner
	{
	  private static Voter v1=new Voter();  //static instance 
	}
	
	public static Voter getVoter()  //static method to get instance 
	{
	  return VoterInner.v1;	
	}
}
