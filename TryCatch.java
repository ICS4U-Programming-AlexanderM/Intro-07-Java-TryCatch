import java.util.Scanner;
/**
* This program calculates the volume of a sphere based on user input.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-02-10
*/

public final class TryCatch {

    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private TryCatch() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Variables
        String stringInput = "";
        double radius = 0;
        double volume = 0;

        // Try ... catch statement
        try {
            // Get input
            System.out.println("Enter the radius of a sphere (in m): ");
            final Scanner line = new Scanner(System.in);
            stringInput = line.nextLine();
            // Change from string to double
            radius = Double.parseDouble(stringInput);
            // Check for negative numbers
            if (radius >= 0) {
                // Math
                volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

                System.out.format("The volume is %.2f m^3.", volume);
                System.out.println("");
            } else {
                System.out.println("That is a negative number.");
            }
        } catch (NumberFormatException err) {
            System.out.println("Error, not a viable input.");
        }
    }
}
