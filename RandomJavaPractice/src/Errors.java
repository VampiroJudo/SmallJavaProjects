
public class Errors {
	
	public static void main(String[] args) {
		int age = 30;
		int retirementFund = 10000;
		int yearsInRetirement = 0;
		String name = "David Johnson";
		for( int i = age; i <= 65; i++) {
			recalculate(retirementFund,0.1);
		}
		int monthlyPension = retirementFund/yearsInRetirement/12;
		System.out.println(name + " will have $" + monthlyPension + " per month for retirement.");
		}
		
		public static void recalculate(double fundAmount, double rate) {
			fundAmount = fundAmount*(1+rate);
	}
}
