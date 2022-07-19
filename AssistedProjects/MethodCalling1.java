package AssistedProjects;

//public class MethodCalling1 {
	class Method2{
		void B() {
			System.out.println("Now you are in method2");
		}
		Method2(){
			System.out.println("YOu are in second constructor");//It is called at the time of creation of object of class Method2
		}
	}

	public class MethodCalling1{
		
		void A() {
			System.out.println("Hi you are in same class");
		}
		
		//Method overloading
		void A(int n) {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
				
			}
			System.out.println(fact);
		}
		
		//Constructor
		 public MethodCalling1() {
			// TODO Auto-generated constructor stub
			 System.out.println("You are in constructor");//It is called at the time of creation of object of class Method
				
		}
		public static void main(String []args) {
		MethodCalling1 obj=new MethodCalling1();
		Method2 obj1=new Method2();
		obj1.B();
		obj.A();
	    obj.A(5);
		}
	}
