import java.util.*;
public class College {
	HashMap<String,Student> student=new HashMap<String,Student>();
	HashMap<String,Alumini> alumini=new HashMap<String,Alumini>();
	HashMap<String,Staff> staff=new HashMap<String,Staff>();
	HashMap<String,Subject> subject=new HashMap<String,Subject>();

	{
		Address address1=new Address("1/2","KKNagar","Madurai");
		Address address2=new Address("6A","AnnaNagar","Madurai");
		Address address3=new Address("112B","KudalNagar","Theni");
		Address address4=new Address("113/85","Mattuthavani","Thrichy");
		Address address5=new Address("6A","Kalavasal","Chennai");
		Address address6=new Address("6A","Theppakulam","Chengalpattu");
		Address address7=new Address("6A","VasanthNagar","Madurai");
		Address address8=new Address("6A","Thiruparangundram","Madurai");
		Address address9=new Address("6A","Pudur","Tanjur");
		Address address10=new Address("6A","ThiruNagar","Madurai");
		
		Student stud1=new Student("16c001","Aishu","CSE",3,address1);addStudent("16c001",stud1);
		Student stud2=new Student("16c002","Abi","IT",1,address2);addStudent("16c002",stud2);
		Student stud3=new Student("16c003","Arun","EEE",2,address3);addStudent("16c003",stud3);
		Student stud4=new Student("16c004","Raji","EEE",4,address4);addStudent("16c004",stud4);
		Student stud5=new Student("16c005","Jeya","MECH",2,address5);addStudent("16c005",stud5);
		Student stud6=new Student("16c006","Keerthi","CSE",3,address6);addStudent("16c006",stud6);
		
		Alumini alumini1=new Alumini("13c001","Amrish","CSE",2018,address7);addAlumini("13c001",alumini1);
		Alumini alumini2=new Alumini("13c002","Shylaja","CSE",2018,address8);addAlumini("13c002",alumini2);
		Alumini alumini3=new Alumini("13c003","Preethi","CSE",2018,address9);addAlumini("13c003",alumini3);
		Alumini alumini4=new Alumini("13c004","Kanmani","CSE",2018,address10);addAlumini("13c004",alumini4);
		Alumini alumini5=new Alumini("13c005","Vignesh","CSE",2018,address2);addAlumini("13c005",alumini5);
		
		Staff staff1=new Staff("stf1","Kamal","CSE");addStaff("stf1",staff1);
		Staff staff2=new Staff("stf2","Raja","IT");addStaff("stf2",staff2);
		Staff staff3=new Staff("stf3","Raman","MECH");addStaff("stf3",staff3);
		Staff staff4=new Staff("stf4","Preethi","ECE");addStaff("stf4",staff4);
		
		Subject sub1=new Subject("s1","Networks",true);addSubject("s1",sub1);
		Subject sub2=new Subject("s2","Algorithm",false);addSubject("s2",sub2);
		Subject sub3=new Subject("s3","FluidMechanics",true);addSubject("s3",sub3);
		Subject sub4=new Subject("s4","DigitalCircuits",true);addSubject("s4",sub4);
		Subject sub5=new Subject("s5","Signals",true);addSubject("s5",sub5);
		Subject sub6=new Subject("s6","OOPS",false);addSubject("s6",sub6);
		
		Address workingaddress1=new Address("6A","ThiruNagar","Madurai");
		Address workingaddress2=new Address("123/1A","Thirumangalam","Trichy");
		Address workingaddress3=new Address("6AB23","Viraganur","Madurai");
		Address workingaddress4=new Address("PS3","Theppakulam","Madurai");
		Address workingaddress5=new Address("AA1","Theppakulam","Madurai");

	}

	private void addStudent(String studentId,Student s) {
		student.put(studentId,s);
	}
	private void removeStudent(String studentId,Student s) {
		student.remove(studentId);
	}
	private void addAlumini(String id,Alumini a) {
		alumini.put(id,a);
	}
//	private void removeAlumini(String id,Alumini a) {
//		alumini.remove(id);
//	}
	private void addStaff(String staffId,Staff s) {
		staff.put(staffId,s);
	}
	private void removeStaff(String staffId,Staff s) {
		staff.remove(staffId);
	}
	private void addSubject(String subjectId,Subject s) {
		subject.put(subjectId,s);
	}
	private void removeSubject(String subjectId,Subject s) {
		subject.remove(subjectId);
	}
	public static void main(String args[]) {
		College college=new College();
	}
	
}
