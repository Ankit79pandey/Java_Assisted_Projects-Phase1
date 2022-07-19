package AssistedProjects;

//import training.Modifiers;
import AssistedProjects.AccessModifier2;
public class AccessModifiers1 {
	public void PublicMethod() {
		System.out.println("YOu are in public method");
	}
	private void PrivateMethod() {
		System.out.println("You are in private method");
	}
	protected void ProtectedMethod() {
		System.out.println("You are in ProtectedMethod");
	}
	void defaultMethod() {
		System.out.println("You are in default Method");
	}
	
	
	
public static void main(String args[]) {
	AccessModifiers1 obj=new AccessModifiers1();
	obj.PublicMethod();
	obj.PrivateMethod();
	obj.defaultMethod();
	obj.ProtectedMethod();
	
	
	
}

}
