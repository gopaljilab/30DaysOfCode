import java.util.*;

public class Day1_DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int seci = scan.nextInt();
        double secd = scan.nextDouble();
        scan.nextLine();
        String secs = scan.nextLine();

        System.out.println(i + seci);
        System.out.println(d + secd);
        System.out.println(s + secs);

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}