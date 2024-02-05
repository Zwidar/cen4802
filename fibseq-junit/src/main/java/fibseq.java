import java.util.Scanner;

/**
 * Class designed to generate total number of Fibonacci sequence numbers based on user input.
 */
public class fibseq {
    static int chosenNbr = 0;
    static int newNbr = 0;
    /**
     * This starts the app and gets the user desired number of output.
     * @param args default unused.
     */
    public static void main(String args[]) {

        System.out.println("How many Fibonacci Numbers?");
        Scanner scanner = new Scanner(System.in);
        chosenNbr = scanner.nextInt();

        fibCalc(chosenNbr);
        System.out.print("The " + chosenNbr + "th term of Fibonacci is " + newNbr);
        System.out.println();
        scanner.close();
    }

    /**
     * This function calculates numbers in the Fibonacci sequence.
     * Outputs next number in the sequence up to the total number chosen by the user.
     *
     * @param chosenNbr The number provided by the user for desired number of output.
     * @return Shows the number at the desired position.
     */

    public static int fibCalc(int chosenNbr) {
        int firstNbr = 0;
        int secondNbr = 1;
        for (int i = 2; i <= chosenNbr; ++i) {
            newNbr = firstNbr + secondNbr;
            firstNbr = secondNbr;
            secondNbr = newNbr;
        }

        return newNbr;
    }
}

