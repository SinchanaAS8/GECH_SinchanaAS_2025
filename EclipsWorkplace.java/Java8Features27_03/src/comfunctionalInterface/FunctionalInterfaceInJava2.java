package comfunctionalInterface;

@FunctionalInterface
interface Interface2{
	public void display();
}

@FunctionalInterface
interface Interface3{
	public int string(String s);
}

@FunctionalInterface
interface Interface4{
	public int add(int a, int b);
}

public class FunctionalInterfaceInJava2 {

	public static void main(String[] args) {
		Interface2 i = ()->System.out.println("Hello world");
		i.display();
		 
		Interface3 i3 = s->s.length();
		int res = i3.string("Hello");
		System.out.println("Result is : " +res);
		
		Interface4 i4 =(int a, int b)->{
			return a+b;
		};
		int add = i4.add(5, 2);
		System.out.println("a + b = " +add);
	}

}
