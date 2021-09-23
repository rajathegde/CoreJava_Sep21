package test;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i=1;i<=10;i++) {
			System.out.println(i);
		}
		int[] array1  = {10,12,13,14,15};
		String[] array2 = {"a","b","c"};
		for(int j=0; j <= (array2.length-1); j++ )
		{
			System.out.println(array2[j]);
		}
		
		for(int j=(array1.length-1); j>= 0 ; j--)
		{
			System.out.println(array1[j]);
		}
		System.out.println("for each loop:");
		for(int values:array1) {
			
			System.out.println(values);
		}
		String str1 = "Rajat Hegde";
		for(int j =0;j<str1.length();j++) {
			System.out.println(str1.charAt(j));
		}
		String str2="";
		
		for(int j =str1.length()-1;j>=0;j--) {
			str2+=str1.charAt(j);
		}
		System.out.println(str2);
		
		String str3 = " India is a country ";
		String[] words = str3.trim().split(" ");// split it by words
		System.out.println("Total words "+words.length);
	
		// While Loop
		int r=1;
		while(r<=10) {
			System.out.println(r);
			r++;
		}
		
		int n1=436721;
		int count=0;
		while(n1>0) {
			int r1= n1%10;
			System.out.println(r1);
			count++;
			n1 = n1/10;
		}
		System.out.println("Total Count is "+count);
		
		
		//Do While
		int n5 = 10;
		do {
			System.out.println(n5);
			n5--;
		}while(n5>=0);
	}
	

			

}
