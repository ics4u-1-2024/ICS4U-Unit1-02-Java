/*
* This is a program that calculates the amount of energy
* when mass is given.
*
* @author  Mr. Coxall
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
 * This is the log program.
 */
final class Energy {
    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The speed of light in a vacuum.
     */
    public static final double SPEED_OF_LIGHT = 2.998 * (Math.pow(10, 8));

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final double energy;
        final String massString;
        final double mass;

        // declare input
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter the mass of an object in kilograms: ");

        // input
        massString = input.nextLine();
        input.close();

        try {
            // input
            mass = Double.parseDouble(massString);
            // input.close();

            if (mass > 0) {
                // calculate
                energy = mass * Math.pow(SPEED_OF_LIGHT, 2);

                // output
                System.out.println(mass + " kg of mass would produce "
                    + energy + " J of energy.");
            } else {
                System.err.println("Please enter a positive mass");
            }
        } catch (NumberFormatException nfe) {
            System.err.println("Sorry, that was not an number.");
        }
        System.out.println("\nDone.");
    }
}
