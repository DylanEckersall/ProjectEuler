/**
 * Application class for executing the code used to solve Project
 * Euler problem 1 (Sum of all multiples of 3 and 5 below 1000).
 * @author dylaneckersall
 *
 */
public class App {

	public static void main(String[] args) {
		int sum = 0;
		// Cycles through every number between 1 and 1000.
		for (int i = 1; i < 1000; i++) {
			// Checks if the number can be divided by 3 or 5.
			if (i % 3 == 0 || i % 5 == 0) {
				// Increments the sum.
				sum += i;
			}
		}
		System.out.println(sum);
	}	
	
}
