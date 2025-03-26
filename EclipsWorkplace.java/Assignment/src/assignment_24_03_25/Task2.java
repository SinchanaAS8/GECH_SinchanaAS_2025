package assignment_24_03_25;

class Vehicle {
    protected String brand;
    protected int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
		super();
		this.brand = brand;
		this.speed = speed;
	}

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String brand, int speed, int numDoors) {
		super(brand, speed);
		this.numDoors = numDoors;
	}
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Doors: " + numDoors);
    }
}

public class Task2 {

	public static void main(String[] args) {
		
		Vehicle myVehicle = new Vehicle("Toyota", 120);
        System.out.println("Vehicle Details:");
        myVehicle.display();

        System.out.println();

        // Creating a Car object
        Car myCar = new Car("Honda", 150, 4);
        System.out.println("Car Details:");
        myCar.display();


	}

}
