package realWorldApp;

import java.util.ArrayList;

public class ListInterface {
	
	static void AverageAge(ArrayList stud) {
		int sum=0;
		int count=0;
		for(int i=0;i<stud.size();i++) {
			sum=sum+((Student)stud.get(i)).getAge();
			count++;
		}
		int avg=sum/count;
		System.out.println(avg);
	}
	
	static void maxPrice(ArrayList mob) {
		int max=((PoorvikaMobile)mob.get(0)).getPrice();
		for(int i=0;i<mob.size();i++) {
			if(((PoorvikaMobile)mob.get(i)).getPrice()>max) {
				max=((PoorvikaMobile)mob.get(i)).getPrice();
			}
			
		}
		System.out.println("Maximum mobile price:"+max);
	}

	public static void main(String[] args) {
		
		ArrayList li=new ArrayList();
		li.add(new Student("Siva",12,90));
		li.add(new Student("Raj",13,99));
		li.add(new Student("Kumar",12,80));
		
		li.add(new Car("bmw","G8",5000000));
		li.add(new Car("maruti","swift",200000));
		li.add(new Car("Honda","civic",3000000));
		//System.out.println(li);
		
		li.add(new PoorvikaMobile("sony","l3",15000,2,16) );
		li.add(new PoorvikaMobile("sony","m2",16000,2,32));
		li.add(new PoorvikaMobile("sony","z3",30000,4,32));
		
		ArrayList car=new ArrayList();
		ArrayList stud=new ArrayList();
		ArrayList mob=new ArrayList();

		
	//	System.out.println(Car.class); Very important
	
		for(Object o:li) {
		//	System.out.println(o.getClass()); Very important
		if(o.getClass().equals(Car.class)) {
			car.add(o);
		}
		else if(o.getClass().equals(Student.class)) {
			stud.add(o);
		}
		else if(o.getClass().equals(PoorvikaMobile.class)) {
			mob.add(o);
		}
			
		
		}
		
	//	System.out.println(mob);
		//System.out.println(stud);
		//System.out.println(car);
			
		AverageAge(stud);	
		maxPrice(mob);	
			
		
}

}
