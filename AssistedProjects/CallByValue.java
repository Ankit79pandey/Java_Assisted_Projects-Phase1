package AssistedProjects;


public class CallByValue {
	int num=50;
	
	void operation(int num) {
		this.num=num*10/100;
	}
public static void main(String args[]) {
	CallByValue obj=new CallByValue();
	System.out.println(obj.num);
	obj.operation(15);
	System.out.println(obj.num);
}
}

