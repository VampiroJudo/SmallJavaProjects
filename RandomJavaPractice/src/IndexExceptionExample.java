
public class IndexExceptionExample {
	
// Refer to previous versions to see example
	
	public static void main(String[] args) {
		int[] hoursWorked = {7,8,7,9,5};
		int totalHours = 0;
		
		for (int i = 0; i < hoursWorked.length; i++) {
			totalHours += hoursWorked[i];
		}
		System.out.println("Total hours worked  = " + totalHours);
		
	}

}
