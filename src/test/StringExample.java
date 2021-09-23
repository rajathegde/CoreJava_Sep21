package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Fname = "Rajat";
		String Lname = "Hegde";
		String Fullname = Fname + " " + Lname; //str conc
		System.out.println("Full Name" +Fullname);
		System.out.println("Length of name is "+Fullname.length()); //length
		System.out.println("Name in Uppercase "+Fullname.toUpperCase()); //uppercase
		System.out.println("Name in Lower case "+Fullname.toLowerCase()); //lowercase
		String NewName =Fullname.replace(" ", ","); //replacing char
		System.out.println("New Name is "+NewName); //newname

	}

}
