package concrete_pojo;
class Personp{
    private String name;
    private int age;
    private String address;
    
    //all-args
	public Personp(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//no-args
	public Personp() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name" +this.name);
	}
    

}

public class Pojoclass {

	public static void main(String[] args) {

			/*
			 * POJO Class:
			 * ==========
			 *     Plain old java object(pojo)
			 *     
			 * Rules:
			 * ======
			 * 1. The class is should not extends or implements any class or interface
			 * 2. Every fields(state/properties) should be private 
			 * 3. All-args Constructor
			 * 4. No-args Constructor
			 * 5. toString()
			 * 6. Getter and setter public methods    
			 */
			Personp obj= new Personp("Sinchana",22,"Hassan");
			System.out.println(obj);

		}

}
