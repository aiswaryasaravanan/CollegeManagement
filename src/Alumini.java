
public class Alumini extends Student{
	
	private int yearPassed;
	private Address workingAddress; 
	
	public Alumini(String rollNo,String name,String dept,int yearPassed,Address address){
		super(rollNo,name,dept,0,address);
	}
	public void setYearPassed(int yearPassed) {
		this.yearPassed=yearPassed;
	}
	public void setWorkingAddress(Address workingAddress) {
		this.workingAddress=workingAddress;
	}

}
