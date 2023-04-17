import java.util.Scanner;

class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Aerospace Program!");

        boolean exitProgram = false;
        while (!exitProgram) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Calculate time to fall from a given altitude");
            System.out.println("2. Calculate orbital velocity of a satellite");
            System.out.println("3. Exit");

            int option = 0;
            try {
                option = input.nextInt();
                if (option < 1 || option > 3) {
                    throw new IllegalArgumentException("Invalid option selected");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                input.nextLine(); // consume the invalid input
                continue; // restart the loop
            }

            switch (option) {
                case 1:
                    calculateTimeToFall(input);
                    break;
                case 2:
                    calculateOrbitalVelocity(input);
                    break;
                case 3:
                    exitProgram = true;
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nThank you for using the Program!");
        input.close();
    }

    private static void calculateTimeToFall(Scanner input) {
        System.out.print("\nEnter the altitude in meters: ");

        try {
            double altitude = input.nextDouble();
            if (altitude < 0) {
                throw new IllegalArgumentException("Altitude cannot be negative");
            }

            double gravity = 9.81;
            double timeToFall = Math.sqrt((2 * altitude) / gravity);
            System.out.printf("The time it takes to fall from %f meters is %f seconds\n", altitude, timeToFall);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            input.nextLine(); // consume the invalid input
        }
    }

    private static void calculateOrbitalVelocity(Scanner input) {
        System.out.print("\nEnter the altitude of the satellite in meters: ");
        double altitude = 0;
        try {
            altitude = input.nextDouble();
            if (altitude < 0) {
                throw new IllegalArgumentException("Altitude cannot be negative");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            input.nextLine(); // consume the invalid input
            return;
        }

        double earthRadius = 6371e3;
        double gravitationalConstant = 6.67408e-11;
        double earthMass = 5.972e24;

        double orbitalRadius = earthRadius + altitude;
        double orbitalVelocity = Math.sqrt((gravitationalConstant * earthMass) / orbitalRadius);
        System.out.printf("The orbital velocity at an altitude of %f meters is %f m/s\n", altitude, orbitalVelocity);
    }
}

