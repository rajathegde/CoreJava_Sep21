package test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length, bredth;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Lenght");
		length = scan.nextInt();
		
		System.out.println("Enter Bredth");
		
		bredth = scan.nextInt();
		
		int arearect = length * bredth;
		System.out.println("Area of rect is "+arearect);
	}

}
