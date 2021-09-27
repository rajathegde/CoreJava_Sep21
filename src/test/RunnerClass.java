package test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.EmpID ="4567";
		emp1.Salary = 6578;
	
		emp1.display();
		
		Employee emp2 = new Employee("Rajat",4500);
		emp2.display();
		Employee emp3 = new Employee("Rajat",45120,"abc","abc",56);
		emp3.display();
		
		
		PolymorphismExample poly = new PolymorphismExample();
		poly.add(10, 20);
		poly.add(10, 20,30);
		poly.add(10.5, 20.65);
		
		AccountAbstraction abs = new AccountAbstraction();
		abs.setBalance(1000);
		
		System.out.println(abs.getBalance());

	}

}
