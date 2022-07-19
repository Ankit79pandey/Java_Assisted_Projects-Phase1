package AssistedProjects;

public class ConstructorTypes {


	int EmpId;
	String name;
	int salary;
	String Department;
	
	
	
	//Default Constructor
	public ConstructorTypes() {
		EmpId=9876;
		name="Ankit pandey";
		salary=500000;
		Department="Software Developer";
		
		System.out.println("This is default Constructor");
	}
	
	//Parameterized Constructor
	public ConstructorTypes(int EmployeeId,String Name,int Salary,String department) {
		this.EmpId=EmployeeId;
		this.name=Name;
	     this.salary=Salary;
		this.Department=department;
	}
	
	public void display()
	{
		System.out.println(EmpId+" "+ name+" "+Department+" "+salary);
	}
	
	
	public static void main(String args[]) {
		ConstructorTypes obj=new ConstructorTypes();
		obj.display();
		ConstructorTypes obj2=new ConstructorTypes(12,"Amit Pandey",25000,"MCA");
		obj2.display();
	}

}

