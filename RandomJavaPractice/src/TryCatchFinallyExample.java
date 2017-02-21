import java.text.DecimalFormat;
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
		System.out.println("Monthly payment: $" + df.format(payment));
		} catch (inputMismatchException ime) {
			//scanValues() method throws InputMismatchException
			//if user's entry cannot be parsed into a double
			System.out.println("You must enter double values. " + "Please restart program.");
			//terminate this program
			System.exit(0);
		} catch (ArithmeticException ae) {
			
		}
	}
}




