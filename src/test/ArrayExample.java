package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1  = {10,12,13,14,15};
		System.out.println(array1[0]); //1st element
		System.out.println(array1[4]); //last element
		System.out.println(array1.length); //length
		System.out.println(array1[array1.length-1]); //last element

		String[] array2 = {"a","b","c"};
		System.out.println(array2[0]);
		array2[0] = "r";
		System.out.println(array2[0]);
		for(int i=0; i <= (array2.length-1); i++ )
		{
			System.out.println(array2[i]);
		}
		
		for(int i=(array1.length-1); i>= 0 ; i--)
		{
			System.out.println(array1[i]);
		}
		
		
	}

}
