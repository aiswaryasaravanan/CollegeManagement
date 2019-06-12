import java.util.*;
public class Student {
	
	protected String rollNo;
	protected String name;
	protected String dept;
	protected int year;
	protected long phoneNo;
	protected String email;
	protected Address address;
	//subjectsEnrolled->subjectId
	private HashSet<String> subjectsEnrolled=new HashSet<String>();
	//feeDetails->semester,feeAmount
	private HashMap<String,Integer> feeDetails=new HashMap<String,Integer>();
	//markScored->SubjectId,mark
	private HashMap<String,Integer> markScored=new HashMap<String,Integer>();
	
	public Student(){}
	
	public Student(String rollNo,String name,String dept,int year,Address address){
		this.rollNo=rollNo;
		this.name=name;
		this.dept=dept;
		this.year=year;
		this.address=address;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	public void enrollSubjects(String subId) {
		subjectsEnrolled.add(subId);
	}
	public void leaveSubject(String subId) {
		subjectsEnrolled.remove(subId);
	}
	public void payFee(String semester,Integer amount) {
		feeDetails.put(semester,amount);
	}
	public void addMark(String subId,Integer mark) {
		markScored.put(subId,mark);
	}
}
