package MYFIRSTJAVAPACKAGE;

import java.util.Scanner;

public class SimpleCalculatorversion1 {
	
	public static void main(String[] args) {
		
		/* Welcoming Speech */
		System.out.println("Hi! Welcome to Al-Yeqeen Simple Smart Calculator. Please Enter 2 Numbers and enter the Arithmetic Operation you want to perform.");
		
		/* Extra Line */
		System.out.println();
		
		/* Calculation Value Input Objects */
		Scanner SimpleCalculatorInputs = new Scanner(System.in);
		
		System.out.println("Please Enter The First Number");
		int FirstNumber = SimpleCalculatorInputs.nextInt();
		
		SimpleCalculatorInputs.nextLine();
		System.out.println("Please Enter The Arithmethic Operator (+ | - | * | /)");
		String ArithmeticOperation = SimpleCalculatorInputs.nextLine();
		
		System.out.println("Please Enter The Second Number");
		int SecondNumber = SimpleCalculatorInputs.nextInt();
		
		/* Arithmetic Operator Checker and Calculation Logic */
		if (ArithmeticOperation.equals("+")) {
			
			int result = FirstNumber + SecondNumber;
			System.out.println(result);
			
		} else if (ArithmeticOperation.equals("-")) {
			        int result = FirstNumber - SecondNumber;
			        System.out.println(result);
			        
		} else if (ArithmeticOperation.equals("*")) {
	        int result = FirstNumber * SecondNumber;
	        System.out.println(result);
	        
		} else if (ArithmeticOperation.equals("/")) {
	        int result = FirstNumber / SecondNumber;
	        System.out.println(result);
	        
		} else {
			
			System.out.println("Hiyah. Please Enter a Valid Arithmetic Operator.");
			
		}

	}

}
