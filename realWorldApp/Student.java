package realWorldApp;

public class Student {
	
	private String s;
	private int age;
	private int marks;
	
	Student(String s,int age,int marks)
	{
		this.s=s;
		this.age=age;
		this.marks=marks;
	}
	

	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

	

	@Override
	public String toString() {
		return "Student [s=" + s + ", age=" + age + ", marks=" + marks + "]";
	}


	

}
