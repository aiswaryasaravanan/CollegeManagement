import java.util.*;

public class Subject {
	
	private String id;
	private String name;
	private HashSet<String> staffConcerned=new HashSet<String>();
	private HashSet<String> relatedDept=new HashSet<String>();
	private boolean isTheory;
	//studentsOpted->StudentId
	private HashSet<String> studentsOpted=new HashSet<String>();
	
	public Subject(String id,String name,boolean isTheory){
		this.id=id;
		this.name=name;
		this.isTheory=isTheory;
	}
	
	public void addStaffConcerned(String staffId) {
		staffConcerned.add(staffId);
	}
	public void removeStaffConcerned(String staffId) {
		staffConcerned.remove(staffId);
	}
	public void addRelatedDept(String dept) {
		relatedDept.add(dept);
	}
	public void removeRelateddepartment(String dept) {
		relatedDept.remove(dept);
	}
	public void addStudentsOpted(String studentId) {
		studentsOpted.add(studentId);
	}
	public void removeStudentsOpted(String studentId) {
		studentsOpted.remove(studentId);
	}
}
