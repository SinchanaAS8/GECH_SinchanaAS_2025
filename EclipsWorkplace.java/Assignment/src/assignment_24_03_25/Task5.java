package assignment_24_03_25;

class Shape {
 // Method to calculate area (to be overridden)
 public void calculateArea() {
     System.out.println("Area calculation is not defined for a generic shape.");
 }
}

//Circle subclass
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Overriding calculateArea method
 @Override
 public void calculateArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Circle Area: " + area);
 }
}

//Rectangle subclass
class Rectangle extends Shape {
 private double length, width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Overriding calculateArea method
 @Override
 public void calculateArea() {
     double area = length * width;
     System.out.println("Rectangle Area: " + area);
 }
}

public class Task5 {

	public static void main(String[] args) {
		Shape myCircle = new Circle(2);
	     Shape myRectangle = new Rectangle(2, 6);

	     myCircle.calculateArea(); 
	     myRectangle.calculateArea();

	}

}
