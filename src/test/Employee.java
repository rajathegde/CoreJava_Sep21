package test;

public class Employee extends Person {
	public String EmpID;
	public int Salary;
	static String Department="Tech";
	
	public Employee() {
		super();
		System.out.println("Inside Default");
	}
	public Employee(String empid, int salary) {
		
		this();//default constructor will be called
		this.EmpID = empid;
		this.Salary = salary;
	}
	
public Employee(String name,int age, String city,String empid, int salary) {
		
		super(name,age,city);
		this.EmpID = empid;
		this.Salary = salary;
	}
	
	public void display() {
		super.display();//to call person display
		System.out.println("Employee ID is " +EmpID);
		System.out.println("Employee Salary is " +Salary);
		System.out.println("Employee Dep is " +Employee.Department);
	}

}
