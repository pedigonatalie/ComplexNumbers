// Natalie Pedigo
// CS2336.504
// 10/29/2022
// Belkoura
//
// Create a Complex class that 
// is able to add, subtract, multiply, divide, 
// and find the absolute value of a complex number.

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		// four double variables used to define the complex numbers
		// in format (a+bi) and (c+di)
		double a,b,c,d;
		
		// user inputs first complex number
		System.out.println("Enter the first complex number:");
		a = input.nextDouble();
		b = input.nextDouble();		
		// pass a,b to Complex constructor to form complex number
		Complex C1 = new Complex(a,b);
		
		// user inputs second complex number
		System.out.println("Enter the second complex number:");
		c = input.nextDouble();
		d = input.nextDouble();
		
		Complex C3 = new Complex();
		
		// pass c,d to Complex constructor to form complex number
		Complex C2 = new Complex(c,d);
			
		// display the results of calculations
		System.out.println(C1+ " + " +C2+ " = " +C1.add(C2));		
		System.out.println(C1+ " - " +C2+ " = " +C1.subtract(C2));
		System.out.println(C1+ " * " +C2+ " = " +C1.multiply(C2));
		System.out.println(C1+ " / " +C2+ " = " +C1.divide(C2));
		System.out.println("|"+C1+"|"+ " = " +C1.abs());
		
		}
	}


