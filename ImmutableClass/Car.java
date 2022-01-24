package ImmutableClass;

public class Car {
	String name;
	
	 Car(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public static void main(String[] args) {
		Car car1 = new Car("Ford");
		System.out.println("Ten xe o to la: "+ car1.getName());
	}
}
