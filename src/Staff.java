import java.util.*;

public class Staff {
	private String id;
	private String name;
	private String dept;
	private String email;
	private long phoneNo;
	//subjectsUndertaken->subjectId
	private HashSet<String> subjectsUnderTaken=new HashSet<String>();
	//areaOfInterest->subjectId
	private HashSet<String> areaOfInterest=new HashSet<String>();
	
	public Staff(String id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	public void addSubjectsUnderTaken(String subId) {
		subjectsUnderTaken.add(subId);
	}
	public void removeSubjectsUnderTaken(String subId) {
		subjectsUnderTaken.remove(subId);
	}
	public void addAreaOfInterest(String subId) {
		areaOfInterest.add(subId);
	}
	public void removeAreaOfInterest(String subId) {
		areaOfInterest.remove(subId);
	}

}
