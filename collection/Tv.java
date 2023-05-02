package collection;

public class Tv {
	private String brand;
	private int price;
  
	Tv(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	
	

	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}

	


	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", price=" + price + "]";
	}


}
