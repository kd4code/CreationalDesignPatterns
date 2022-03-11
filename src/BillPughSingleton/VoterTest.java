package BillPughSingleton;

public class VoterTest {
  public static void main(String[] args) {
	  
	 Voter v1=Voter.getVoter();
	 Voter v2=Voter.getVoter();
	 
	 System.out.println(v1.hashCode()+" :" +v2.hashCode());
	 
	 
}
}
