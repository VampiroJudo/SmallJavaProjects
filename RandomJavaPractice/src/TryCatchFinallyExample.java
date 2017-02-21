import java.text.DecimalFormat;

public class TryCatchFinallyExample {
		
		public static void main(String[] args) {
			int age = 30;
			double retirementFund = 10000;
			int yearsInRetirement = 20;
			String name = "David Johnson";
			for(int i = age; i <= 65; i++) {
				retirementFund = recalculate(retirementFund,0.1);
			}
			double monthlyPension = retirementFund/yearsInRetirement/12;
			DecimalFormat df = new DecimalFormat ("0.##");
			System.out.println(name + " will have $" + df.format(monthlyPension) + " per month for retirement.");
			}
			
			public static double recalculate(double fundAmount, double rate) {
				return  fundAmount*(1+rate);
		}
}


