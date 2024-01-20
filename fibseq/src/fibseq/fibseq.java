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
	    for(int i = 2; i < chosenNbr; i++){
			System.out.print(fibCalc(i) +" ");
    }
	    scanner.close();
    }


	private static int fibCalc(int i) {
		 int newNbr = firstNbr + secondNbr;
         firstNbr = secondNbr;
         secondNbr = newNbr;
		return newNbr;
	} 
}

