import java.util.Scanner;
import java.util.*;

public class FlightBookingSystem {
  private static int MAX_SEATS = 100;
  private static String[] FLIGHTS = {"BA001", "AA101", "UA201"};
  private static String[] DESTINATIONS = {"London", "New York", "San Francisco"};
  private static String[] WEEKDAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

  private static String[] bookings = new String[MAX_SEATS];
  private static int numBookings = 0;

  public static void bookFlight(Scanner) 
  {
    System.out.println("\nBooking a flight");
    System.out.println("Available flights:");
    for (int i = 0; i < FLIGHTS.length; i++) 
    {
      System.out.println((i + 1) + ". " + FLIGHTS[i] + " - " + DESTINATIONS[i]);
    }

    int flightChoice = sc.nextInt();
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

    int weekdayChoice = sc.nextInt();
    if (weekdayChoice < 1 || weekdayChoice > WEEKDAYS.length) 
    {
      System.out.println("Invalid weekday choice. Please try again.");
      return;
    }

    System.out.println("Enter passenger name:");
    String name = sc.next();

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
    System.out.println("\nViewing bookings");
    if (numBookings == 0) 
    {
      System.out.println("No bookings found.");
      return;
    }
    StringBuffer buffer = new StringBuffer();
    buffer.append(String.format("%-10s %-10s %-20s\n", "Flight", "Weekday", "Passenger"));
    for (int i = 0; i < numBookings; i++) {
      String[] parts = bookings[i].split(",");
      buffer.append(String.format("%-10s %-10s %-20s\n", parts[0], parts[1], parts
      
      
      
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
        bookFlight(sc);
      } 
      else if (choice == 2) 
      {
        viewBookings();
      } 
      else if (choice == 3) 
      {
        cancelBooking(sc);
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

