package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		try {
			a=a/0;
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Null pointer exception");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Generic exception");
		}
		finally{
			System.out.println("Finally block");
		}
		System.out.println("after exception");
	}

}
