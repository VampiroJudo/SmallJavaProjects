import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample {
		
	public static void main(String[] args) {
		try {
		// Store the double[] returned by the scanValue[] method
		double[] userValues = scanValues();
		
		//Store the double returned by the calculatePayment() method;
		double payment = calculatePayment(userValues);
		
		//Print the calculated payment according to the format above
		System.out.println("Monthly payment: $" + df.format (payment));
		} catch (InputMismatchException ime) {
			//scanValues() method throws InputMismatchException
			//if user's entry cannot be parsed into a double
			System.out.println("You must enter double values. " + "Please restart program.");
			//terminate this program
			System.exit(0);
		} catch (ArithmeticException ae) {
			//calculatePayment() method throws ArithmeticException
			//if years == 0
			System.out.println("Years must be greater than 0. " + "Please restart problem.");
			//terminate the program
			System.exit(0);
		} catch (IndexOutOfBoundsException ioob) {
			//calculatePayment() method throws IndexOutOfBoundsException
			//if double[] has less than 3 elements
			System.out.println("Three doubles are required. " + "Please restart program.");
			//terminate the program
			System.exit(0);
		}
	}
	// method asks for and scan three doubles:
	//principle interest rate and loan years
	
	public static double[] scanValues() throws InputMismatchException {
		double[] values = new double[3];
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Ener the loan amount: ");
			values[0] =  scan.nextDouble();
			System.out.print("Enter the interest rate: ");
			values[1] = scan.nextDouble();
			System.out.print("Enter the loan term (in years: ");
			values[2] = scan.nextInt();
		}
		return values;
	}
	// method takes a double[] with three elements
	// and calculates a monthly payment
	public static double calculatePayment(double[] values)
		throws ArithmeticException, IndexOutOfBoundsException {
		double principle = values [0];
		double rate = values[1];
		double years = values[2];
		double interest = principle * rate * years;
		double total = principle + interest;
		return total / years /12;
	}
	
}




