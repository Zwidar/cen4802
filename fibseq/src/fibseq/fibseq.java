package fibseq;
import java.util.Scanner;

public class fibseq {
	static int chosenNbr = 0;
	static int firstNbr = 0;
	static int secondNbr = 1;
	
    public static void main(String args[]) {

    	System.out.println("How many Fibonacci Numbers?");
        Scanner scanner = new Scanner(System.in);
        chosenNbr = scanner.nextInt();
    	
    	
	    System.out.print("Fib Numbers: 0 1 ");
	    fibCalc(firstNbr, secondNbr, 2, chosenNbr);
		System.out.println();
        scanner.close();
    }


	private static void fibCalc(int firstNbr, int secondNbr, int countNbr, int chosenNbr) {
		if (countNbr < chosenNbr) {
			int newNbr = firstNbr + secondNbr;
         	countNbr = countNbr + 1;
			System.out.print(newNbr + " ");
			fibCalc(secondNbr, newNbr, countNbr, chosenNbr);
		}
	} 
}

