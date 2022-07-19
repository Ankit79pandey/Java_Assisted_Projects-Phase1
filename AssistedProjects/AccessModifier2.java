package AssistedProjects;

public class AccessModifier2  {
	public static void main(String args[]) {
		AccessModifiers1 obj=new AccessModifiers1();
		obj.PublicMethod();
		//obj.PrivateMethod();
		obj.defaultMethod();
		obj.ProtectedMethod();
	}
	}

}
