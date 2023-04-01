package comparable;

public class Car implements Comparable<Car>
{
	int price;

	public Car(int price) {
		super();
		this.price=price;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}
	public static void main(String[] args) {
		
	}

	@Override
	public int compareTo(Car c) {
		
		return this.price-c.price;
	}
	

}
