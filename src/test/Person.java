package test;

public class Person {
	public String Name;
	public int Age;
	public String City;
	
	public Person() {
		
	}
	
	public Person(String name,int age,String city) {
		this.Name = name;
		this.Age = age;
		this.City = city;
	}
	public void display() {
		System.out.println("Name " +Name);
		System.out.println("Age " +Age);
		System.out.println("City " +City);
		
		//final method means cannot be override final class means cannot be inherit final in variable means cannot be change the value
	}

}
