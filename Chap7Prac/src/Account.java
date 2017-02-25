import java.math.BigDecimal;

public class Account {
	
	String name;
	BigDecimal amount;
	
	public Account(String acctName, String startAmount) {
		this.name = acctName;
		this.amount = new BigDecimal(startAmount);
		this.amount = setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
}
