import java.util.Scanner;

public class Lecture_Module2_Exercise_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Get input from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter interest rate, number of years, and amount: ");
		double interestRate = input.nextDouble();
		int years = input.nextInt();
		double loanAmount = input.nextDouble();
		input.close();
		
		// Calculate monthly interest rate
		double monthlyInterstRate = interestRate / 1200;
		
		// Calculate monthly payment
		double monthlyPayment = (loanAmount * monthlyInterstRate) / (1 
				- 1/(Math.pow(1 + monthlyInterstRate, years * 12)));
		
		System.out.println("Monthly payment = $" + monthlyPayment);
		
		double totalPayment = monthlyPayment * 12 * years;
		
		System.out.print("Total payment = $" + totalPayment);
	}
}
