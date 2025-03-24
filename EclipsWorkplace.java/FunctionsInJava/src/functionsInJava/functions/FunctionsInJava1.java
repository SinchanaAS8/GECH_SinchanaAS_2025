package functionsInJava.functions;

public class FunctionsInJava1 {
	
		// 1. Public function
	    //anywhere
		public void publicFunction() {
			System.out.println("This is public function");
		}
		
		//2. private function
		//
		private void privateFunction() {
			System.out.println("This is private function");
		}
		
		//3. defult function
		//same package
		void defultFunction() {
			System.out.println("This is defult function");
		}
		
		//4. protected
		// within package but subclass of different package
		protected void protectedFunction() {
			System.out.println("This is protected function");
		}
		
		//5. static function
		//we can access by using class name
		public static void staticFunction() {
			System.out.println("this is ststic function");
		}
		public static void main(String[] args) {
		FunctionsInJava1 obj1 = new FunctionsInJava1();
		obj1.privateFunction();
		obj1.publicFunction();
		obj1.protectedFunction();
		FunctionsInJava1.staticFunction();
		}
		
		



}
