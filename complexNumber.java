import java.util.Scanner;

public class complexNumber {
	public static void main(String[] args){
		
      //Asking user to input all 4 number's for a1, b1, a2, b2    
		System.out.println("Enter a Real Number for a1: ");
		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt();
		System.out.println("Enter an Imaginary number for b1: ");
		int b1 = in.nextInt();
		System.out.println("Enter a Real Number for a2: ");
		int a2 = in.nextInt();
		System.out.println("Enter an Imaginary Number for b2:");
		int b2 = in.nextInt();
		
      //Separating the complex addition Equation into 2 parts and printing out the equation in (a1 + a2) + i*(b1 + b2) form
		int complexAddition1 = (a1 + a2);
		int complexAddition2 = (b1 + b2);
		System.out.println("Complex Addition = " + complexAddition1 + " + " + complexAddition2 +"i");
		//Separating the complex subtraction Equation into 2 parts and printing out the equation in (a1 - a2) + i*(b1 - b2) form
		int complexSubtraction1 = (a1 - a2);
		int complexSubtraction2 = (b1 - b2);
		System.out.println("Complex Subtraction = " + complexSubtraction1 + " + " + complexSubtraction2 + "i");
		//Separating the complex multiplication Equation into 2 parts and printing out the equation in (a1 * a2 – b1 * b2) + i*(a1 * b2 + b1 * a2)
		int complexMultiplication1 = ((a1 * a2) - (b1 * b2));
		int complexMultiplication2 = ((a1 * b2) + (b1 * a2));
		System.out.println("Complex Multiplication = " + complexMultiplication1 + " + " + complexMultiplication2 + "i");
		/*Separating the complex division Equation into 2 parts and printing out the equation in
      (a1 * a2 + b1 * b2) / (a2 ^ 2 + b2 ^ 2) + i*(b1 * a2 – a1 * b2)/(a2 ^ 2 + b2 ^ 2) form.
      Need to use TypeCasting b/c the value coming out of equation will be double
      */
		double complexDivision1 = (double) (((a1 * a2) + (b1 * b2)) / ((a2 * a2) + (b2 * b2)));
		double complexDivision2 = (double) (((b1 * a2) - (a1 * b2)) / ((a2 * a2) + (b2 * b2)));

		System.out.println("Complex Division = " + complexDivision1 + " + " + complexDivision2 + "i");
	}

}
