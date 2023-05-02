package arraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Mobile {
	String model;
	int ram;
	int price;
	
	Mobile(String model,int ram,int price){
		this.model=model;
		this.ram=ram;
		this.price=price;
	}
	
	

	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	



	@Override
	public String toString() {
		return "Mobile [model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		
		Mobile samsung=new Mobile("M 2",2,8000);
		Mobile nokia=new Mobile("M 1210",1,5000);
		Mobile oppo=new Mobile("M 44",6,10000);
		
		Mobile[] mob= {samsung,nokia,oppo};
		
		Comparator comp=new Comparator1();
		
		
		Arrays.sort(mob, comp);
		
		for(Mobile m:mob) {
			System.out.println(m);
		}
		
		

	}

}
