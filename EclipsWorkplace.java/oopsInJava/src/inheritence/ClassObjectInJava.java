package inheritence;

class Student{
	//states
	public int age = 19;
	public String name = "Priya";
	public double marks = 230.2;
	 
	//action
	public void isPlaying() {
		System.out.println(this.name+" is playing"); // this keyb word to acces the current obj
	}
	public void isSleeping() {
		System.out.println("Is Sleeping");
	}
}

public class ClassObjectInJava {

	public static void main(String[] args) {
		// 
		/* Class :
		 *        Class will represent the state and behaviour of an object 
		 *  tate -> property
		 *  behaviour-> action
		 *  
		 *  Object:
		 *  =========
		 *     Object is a implementaion class (state and behaviour)
		 *     
		 * example:
		 *  Student 
		 *  
		 * property:
		 * usn
		 * name
		 * 
		 * action:
		 * isplaing()
		 * issleeping()
		 * 
		 * how to declare class and object
		 * -==============================
		 * class Class_name{
		 *      state
		 *      action
		 *      }
		 *   
		 * example:
		 * class Student{
		 *        property:
		 *        public int age = 22;
		 *        
		 *        action:
		 *        public void isplaying(){
		 *        syso("The student is playing ");
		 *      }
		 * }
		 * Student std1 = new Student();
		 *      
		 */
		Student std1 = new Student();
         System.out.println(std1.name);
         System.out.println(std1.age);
         System.out.println(std1.marks);
         std1.isPlaying();
         std1.isSleeping();
	}

}
