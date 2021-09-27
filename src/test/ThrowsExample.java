package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample obj = new ThrowsExample();
		try {
			obj.calc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void calc() throws InterruptedException {
		//throws whoever calling they have to use try catch atleast once
		method1();
		
	}
	public void method1() throws InterruptedException {
		System.out.println("Inside method 1");
		Thread.sleep(3000);
	}

}
