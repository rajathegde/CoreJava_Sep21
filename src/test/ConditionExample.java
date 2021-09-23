package test;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println("Even Number "+i);
			}
			else {
				System.out.println("Odd Number "+i);
			}
		}
		
		int age =18;
		if (age >= 18) {
			System.out.println("Elligible");
		}
		else if(age == 17) {
			System.out.println("Sorry, Next year your are elligible to vote");
			
		}
		else {
			System.out.println("Sorry, Not elligible");
		}

	}

}
