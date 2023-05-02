package practice;

public class Student {
	
	private String name;
	private int rollNo;
	private int mark;
	
	Student(String n,int rollNo,int mark) {
		name=n;
		this.rollNo=rollNo;
		this.mark=mark;
	}
	
	
	

	public Student() {
		// TODO Auto-generated constructor stub
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getRollNo() {
		return rollNo;
	}




	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}




	public int getMark() {
		return mark;
	}




	public void setMark(int mark) {
		this.mark = mark;
	}

	public void display() {
		System.out.println("Name of student:"+name);
		System.out.println("roll no of student:"+rollNo);
		System.out.println("Mark of student:"+mark);
	}



	public static void main(String[] args) {
		Student ram=new Student();
		Student ramesh=new Student("ramesh",02,98);
		Student kumar=new Student("kumar",03,92);
		Student siva=new Student("siva",04,88);
		Student raj=new Student("raj",05,90);
		
	
		
		ram.setMark(100);
		ram.setName("Ram");
		ram.setRollNo(001);
		
		System.out.println("Name of student:"+ram.getName());
		int r=ram.getRollNo();
		System.out.println("Roll No:"+r);
		int m=ram.getMark();
		System.out.println("Mark:"+m);
		
		//ram.display();
		

	}

}
