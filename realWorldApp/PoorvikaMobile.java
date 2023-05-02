package realWorldApp;

public class PoorvikaMobile {
	
	private String brand;
	private String model;
	private int price;
	private int ram;
	private int storage;
	
	PoorvikaMobile(String brand,String model,int price,int ram,int storage)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.ram=ram;
		this.storage=storage;
		
	}
	
	
	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	public int getStorage() {
		return storage;
	}



	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	
	
	@Override
	public String toString() {
		return "Brand:"+brand +"\n" +"Model:"+model+"\n" +"Price:"+price +"Rs\n" +"Ram:"+ram +"GB\n" +"Memory:"+storage +"GB";
	}


	static void maxPrice(PoorvikaMobile arr[])
	{
		int max=arr[0].getPrice();
		for(int i=1;i<arr.length;i++) {
			if(arr[i].getPrice()>max) {
				max=arr[i].getPrice();
			}
			
		}
		System.out.println("The maximum price is:"+max);
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].getPrice()==max) {
				System.out.println(arr[i].getBrand()+"\n" +arr[i].getModel());
			}
				
		}
	}
	
	static void minPrice(PoorvikaMobile arr[])
	{
		int min=arr[0].getPrice();
		for(int i=1;i<arr.length;i++) {
			if(arr[i].getPrice()<min) {
				min=arr[i].getPrice();
			}
			
		}
		System.out.println("The minimum price is:"+min);
		
		
			for(int i=0;i<arr.length;i++) {
				
		if(arr[i].getPrice()==min) {
			System.out.println(arr[i].getBrand()+"\n" +arr[i].getModel());
		}
			
	}

	}
	
	static void priceLess30000(PoorvikaMobile arr[],PoorvikaMobile list[])
	{
		int j=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i].getPrice()<=30000) {
			
			list[j]=arr[i];
			//System.out.println(arr[i].toString() +"\n");
			j++;
		}
		
		//System.out.println(list[0]);
	}
		
		for(int k=0;k<j;k++) {
			System.out.println(list[k].toString());
		}
	}

	public static void main(String[] args) {
		PoorvikaMobile[] list=new PoorvikaMobile[10];
		
		PoorvikaMobile sam1=new PoorvikaMobile("Samsung","S4",20000,4,32);
		PoorvikaMobile sam2=new PoorvikaMobile("Samsung","S5",15000,2,32);
		PoorvikaMobile sam3=new PoorvikaMobile("Samsung","S6",25000,6,32);
		PoorvikaMobile sam4=new PoorvikaMobile("Samsung","S7",30000,6,64);
		PoorvikaMobile sam5=new PoorvikaMobile("Samsung","Note 10",50000,6,128);
		PoorvikaMobile sam6=new PoorvikaMobile("Samsung","S10 Edge",45000,6,64);
		
		PoorvikaMobile arr[]= {sam1,sam2,sam3,sam4,sam4,sam5,sam6};
		
		maxPrice(arr);
		minPrice(arr);
		 priceLess30000(arr,list);
		
		
		//System.out.println(arr[0].);

	}

}
