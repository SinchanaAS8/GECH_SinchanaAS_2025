package inheritence;

class gParentsClass{
	public void gParentMethod() {
		System.out.println("this is Grand parents method");
	}
}

class ParentsClass extends gParentsClass {
	public void ParentMethod() {
		System.out.println("this is  parents method");
	}
}

class ChildClass extends ParentsClass {
	public void childMethod() {
		System.out.println("this is child method");
	}
}


public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj = new ChildClass();
		obj.gParentMethod();
		obj.ParentMethod();
        obj.childMethod();

	}

}
