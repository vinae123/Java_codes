import java.util.Scanner;
import java.util.*;

class FlightBookingSystem 
{
  public static int MAX_SEATS = 100;
  public static String[] FLIGHTS = {"BA001", "AA101", "UA201"};
  public static String[] DESTINATIONS = {"London", "New York", "San Francisco"};
  public static String[] WEEKDAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
  public static Scanner scanner = new Scanner(System.in);

  public static String[] bookings = new String[MAX_SEATS];
  public static int numBookings = 0;
  public static void bookFlight() 
  {
    System.out.println("\nBooking a flight");
    System.out.println("Available flights:");
    for (int i = 0; i < FLIGHTS.length; i++) 
    {
      System.out.println((i + 1) + ". " + FLIGHTS[i] + " - " + DESTINATIONS[i]);
    }

    int flightChoice = scanner.nextInt();
    if (flightChoice < 1 || flightChoice > FLIGHTS.length) 
    {
      System.out.println("Invalid flight choice. Please try again.");
      return;
    }

    System.out.println("Select a weekday:");
    for (int i = 0; i < WEEKDAYS.length; i++) 
    {
      System.out.println((i + 1) + ". " + WEEKDAYS[i]);
    }

    int weekdayChoice = scanner.nextInt();
    if (weekdayChoice < 1 || weekdayChoice > WEEKDAYS.length) 
    {
      System.out.println("Invalid weekday choice. Please try again.");
      return;
    }

    System.out.println("Enter passenger name:");
    scanner.nextLine();
    String name = scanner.nextLine();

    String booking = FLIGHTS[flightChoice - 1] + "," + WEEKDAYS[weekdayChoice - 1] + "," + name;
    if (numBookings < MAX_SEATS) 
    {
      bookings[numBookings] = booking;
      numBookings++;
      System.out.println("Booking successful!");
    } 
    else 
    {
      System.out.println("Sorry, the flight is fully booked.");
    }
  }

  public static void viewBookings() 
  {
    System.out.println("\nAll bookings:");
    if (numBookings == 0) 
    {
      System.out.println("No bookings found.");
    } 
    else 
    {
      StringBuffer table = new StringBuffer();
      table.append("Flight\tWeekday\tPassenger\n");
      for (int i = 0; i < numBookings; i++) 
      {
        String[] booking = bookings[i].split(",");
        table.append(booking[0] + "\t" + booking[1] + "\t" + booking[2] + "\n");
      }
      System.out.println(table.toString());
    }
  }

  public static void cancelBooking() {
    System.out.println("\nCancelling a booking");
    System.out.println("Enter passenger name:");

    String name = scanner.nextLine();
    boolean found = false;

    for (int i = 0; i < numBookings; i++) 
    {
      String[] booking = bookings[i].split(",");
      if (booking[2].equals(name)) {
        System.out.println("Booking found:");
        System.out.println("Flight: " + booking[0]);
        System.out.println("Weekday: " + booking[1]);
        System.out.println("Passenger: " + booking[2]);
        System.out.println("Cancel this booking? (y/n)");

        String choice = scanner.nextLine();
        if (choice.equals("y")) {
          for (int j = i; j < numBookings - 1; j++) {
            bookings[j] = bookings[j + 1];
          }
          numBookings--;
          System.out.println("Booking cancelled.");
        } else {
          System.out.println("Booking not cancelled.");
        }

        found = true;
        break;
      }
    }

    if (!found) 
    {
      System.out.println("Booking not found.");
    }
  }
}  
      
      
 class Stringbuffer
 {     
   public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    while (true) 
    {
      System.out.println("\nWelcome to the Flight Booking System!");
      System.out.println("1. Book a flight");
      System.out.println("2. View bookings");
      System.out.println("3. Cancel a booking");
      System.out.println("4. Exit");

      int choice = sc.nextInt();

      if (choice == 1) 
      {
        FlightBookingSystem.bookFlight();
      } 
      else if (choice == 2) 
      {
        FlightBookingSystem.viewBookings();
      } 
      else if (choice == 3) 
      {
        FlightBookingSystem.cancelBooking();
      } 
      else if (choice == 4) 
      {
        System.out.println("Thank you for using the Flight Booking System!");
        break;
      } 
      else 
      {
        System.out.println("Invalid choice. Please try again.");
      }
    }
  }
 }

