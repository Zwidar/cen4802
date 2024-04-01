import com.sun.source.tree.WhileLoopTree;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.*;
import java.util.Scanner;

/**
 * Class designed to generate total number of Fibonacci sequence numbers based on user input.
 */
public class fibseq {
    static int chosenNbr = 1;
    static int newNbr = 1;
    private static Logger fiblog = Logger.getLogger("fibseq");

    /**
     * This starts the app and gets the user desired number of output.
     * @param args default unused.
     */
    public static void main(String args[]) {

        try {
            FileHandler fh = new FileHandler("fiblog.txt", true);
            fiblog.addHandler(fh);
            fiblog.setLevel(Level.ALL);
            fiblog.info("Starting Program.");

            while (true) {
                System.out.println("How many Fibonacci Numbers? (use 0 to exit)");
                Scanner scanner = new Scanner(System.in);

                try {
                    chosenNbr = scanner.nextInt();
                    fiblog.info("Chosen Number was " + chosenNbr);
                    if (chosenNbr == 0) {
                        System.out.print("Thanks for using the program!");
                        scanner.close();
                        break;
                    }
                } catch (InputMismatchException e) {
                    fiblog.log(Level.SEVERE, "Alpha character entered for chosenNbr.", e);
                    System.out.print("Number is expected.");
                    return;
                }
                if (chosenNbr < 0) {
                    fiblog.warning("Negative value entered for chosenNbr.");
                    System.out.print("Please enter a positive integer.");
                    return;
                }
                fibCalc(chosenNbr);
                System.out.print("The " + chosenNbr + "th term of Fibonacci is " + newNbr);
                System.out.println();

            }
        } catch(IOException e){
                throw new RuntimeException(e);
            }
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
        fiblog.info("Iterating through the numbers.");
        for (int i = 2; i <= chosenNbr; ++i) {
            newNbr = firstNbr + secondNbr;
            firstNbr = secondNbr;
            secondNbr = newNbr;
            fiblog.fine("next number is " + newNbr);
        }

        return newNbr;
    }
}

