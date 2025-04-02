package assignment_24_03_25;


class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public boolean hasPassed() {
        return marks >= 40;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + (hasPassed() ? "Passed" : "Failed"));
    }
}

public class Task6 {
		    public static void main(String[] args) {
		        
		        Student student1 = new Student("Siddartha", 101, 85);
		        Student student2 = new Student("Gowthama", 102, 35);

		        student1.displayStudentDetails();
		        System.out.println();
		        student2.displayStudentDetails();
		    }
	}


