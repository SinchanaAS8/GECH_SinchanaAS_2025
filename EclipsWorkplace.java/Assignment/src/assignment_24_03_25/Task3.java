package assignment_24_03_25;

//Abstract base class
abstract class Employee {
 protected String name;

 // Constructor
 public Employee(String name) {
     this.name = name;
 }

 // Abstract method (to be implemented by subclasses)
 public abstract double calculateSalary();

 // Method to display details
 public void displayDetails() {
     System.out.println("Employee Name: " + name);
     System.out.println("Salary: $" + calculateSalary());
 }
}

//Subclass for Full-Time Employees
class FullTimeEmployee extends Employee {
 private double monthlySalary;

 // Constructor
 public FullTimeEmployee(String name, double monthlySalary) {
     super(name);
     this.monthlySalary = monthlySalary;
 }

 // Implementing the abstract method
 @Override
 public double calculateSalary() {
     return monthlySalary;
 }
}

//Subclass for Part-Time Employees
class PartTimeEmployee extends Employee {
 private int hoursWorked;
 private double hourlyRate;

 // Constructor
 public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
     super(name);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 // Implementing the abstract method
 @Override
 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }
}




public class Task3 {

	public static void main(String[] args) {
		  // Creating a Full-Time Employee object
	     Employee fullTimeEmp = new FullTimeEmployee("Alice", 5000);
	     System.out.println("Full-Time Employee Details:");
	     fullTimeEmp.displayDetails();

	     System.out.println();

	     // Creating a Part-Time Employee object
	     Employee partTimeEmp = new PartTimeEmployee("Bob", 80, 20);
	     System.out.println("Part-Time Employee Details:");
	     partTimeEmp.displayDetails();

	}

}
