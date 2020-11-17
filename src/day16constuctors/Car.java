package day16constuctors;

public class Car {
	
	int price;
	int year;
	String make;
	String model;
	String color;
	boolean isDiesel;
	double km;
	
	
	public Car(int price, int year, String make, boolean isDiesel) {
		this.price = price;
		this.year = year;
		this.make = make;
		this.isDiesel = isDiesel;
		
	}
	
	public Car(int price, int year, String make, String model, String color, boolean isDiesel, double km) {
		this.price = price;
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.isDiesel = isDiesel;
		this.km = km;
	}
	
	
	
	public static void main(String[] args) {
		
			Car car1 = new Car(5000, 2018, "Toyota", true);
			
			System.out.println(car1.price);//5000
			System.out.println(car1.year);//2018
			System.out.println(car1.make);//Toyota
			System.out.println(car1.isDiesel);//true
			
			
			Car car2 = new Car(80000, 2020, "Audi", false);
			
			System.out.println(car2.price);//80000
			System.out.println(car2.year);//2020
			System.out.println(car2.make);//Audi
			System.out.println(car2.isDiesel);//false
			
			Car car3 = new Car(30000, 2017, "BMW", "3.35i", "Red", false, 50000); {
				System.out.println(car3.price);//30000
				System.out.println(car3.year);//2017
				System.out.println(car3.make);//"BMW"
				System.out.println(car3.model);//3.35i
				System.out.println(car3.color);//Red
				System.out.println(car3.isDiesel);//false
				System.out.println(car3.km);//50000
			}
	}

}
