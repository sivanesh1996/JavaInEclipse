package realWorldApp;

public class Car {
	
	private	String brand;
	private String color;
	private long price;
	
	Car(String brand,String color,int price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
}

