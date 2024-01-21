package fibseq;
import java.util.Scanner;

/**
 * Class designed to generate total number of Fibonacci sequence numbers based on user input.
 */
public class fibseq {
	static int chosenNbr = 0;
	static int firstNbr = 0;
	static int secondNbr = 1;

	/**
	 * This starts the app and gets the user desired number of output.
	 * @param args default unused.
	 */
    public static void main(String args[]) {

    	System.out.println("How many Fibonacci Numbers?");
        Scanner scanner = new Scanner(System.in);
        chosenNbr = scanner.nextInt();
    	
    	
	    System.out.print("Fib Numbers: 0 1 ");
	    fibCalc(firstNbr, secondNbr, 2, chosenNbr);
		System.out.println();
        scanner.close();
    }

	/**
	 * This function calculates numbers in the Fibonacci sequence.
	 * Outputs next number in the sequence up to the total number chosen by the user.
	 * @param firstNbr First number for addition to calculate new Fibonnaci Number.
	 * @param secondNbr Second number for addition to calculate new Fibonnaci Number.
	 * @param countNbr Counts the number of iterations it's cycling through.
	 * @param chosenNbr The number provided by the user for desired number of output.
	 */
	private static void fibCalc(int firstNbr, int secondNbr, int countNbr, int chosenNbr) {
		if (countNbr < chosenNbr) {
			int newNbr = firstNbr + secondNbr;
         	countNbr = countNbr + 1;
			System.out.print(newNbr + " ");
			fibCalc(secondNbr, newNbr, countNbr, chosenNbr);
		}
	} 
}

