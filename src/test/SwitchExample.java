package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		switch(age) {
		case 18:
		case 19:
			System.out.println("Elligible");
			break;
		case 17:
			System.out.println("Will be elligible next year");
			break;
		case 15:
			System.out.println("Inelligible");
			break;
		default:
			System.out.println("Default will be executed");
		}

	}

}
