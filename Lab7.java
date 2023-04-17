import java.util.*;

// Superclass for all aircraft
abstract class Aircraft 
 {
    public String manufacturer;
    public int maxSpeed;
    public abstract void Menu();

    // Constructor for the class aircraft
    public Aircraft(String manufacturer, int maxSpeed) 
    {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getMaxSpeed() 
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) 
    {
        this.maxSpeed = maxSpeed;
    }

    public void fly() 
    {
        System.out.println("The aircraft is flying.");
    }
 }

class CommercialAircraft extends Aircraft 
 {
    public int passengerCapacity;
    public CommercialAircraft(String manufacturer, int maxSpeed, int passengerCapacity) 
    {
        super(manufacturer, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }
    public int getPassengerCapacity() 
    {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) 
    {
        this.passengerCapacity = passengerCapacity;
    }
    
    /*public int getCargoCapacity()
    {
      return
    }*/
    public void Menu() 
    {
        System.out.println("The passenger airplane menu is :");
        System.out.println("1. Tea/Coffee");
        System.out.println("2. breadd");
        System.out.println("3. Fruit juices");
        System.out.println("4. Pastry");
    }
    // Method implemented by this class
    public void takeOff() 
    {
        System.out.println("The commercial aircraft is taking off.");
    }
 }

// Subclass of commercial aircraft for passenger airplanes
class PassengerAirplane extends CommercialAircraft 
 {
    public int cabinCrew;
    public PassengerAirplane(String manufacturer, int maxSpeed, int passengerCapacity, int cabinCrew) 
    {
        super(manufacturer, maxSpeed, passengerCapacity);
        this.cabinCrew = cabinCrew;
    }
    public int getCabinCrew() 
    {
        return cabinCrew;
    }
    public void setCabinCrew(int cabinCrew) 
    {
        this.cabinCrew = cabinCrew;
    }
  /*  public void Menu()
    {
        System.out.println("The passenger airplane menu is :");
        System.out.println("1. Tea/Coffee");
        System.out.println("2. Sandwiches");
        System.out.println("3. Fruit juices");
        System.out.println("4. Pastry");
    } */
    // Method implemented by this class
    public void land() 
    {
        System.out.println("The passenger airplane is landing.");
    }
 }

class CargoAirplane extends CommercialAircraft
{
  public int Workers;
  public int Capacity;
  public CargoAirplane(String manufacturer, int maxSpeed, int Workers, int Capacity)
  {
  	super(manufacturer, maxSpeed,0); 
  	this.Workers = Workers;
  	this.Capacity = Capacity;
  }
 public int getCargoCapacity()
 {
   	return Capacity;
 } 
 public int getworkers()
 {
  	return Workers;
 } 
}

public class Lab7 
{
    public static void main(String[] args) 
    {
        PassengerAirplane airplane = new PassengerAirplane("Boeing", 900, 150, 10);
        PassengerAirplane airplane2 = new PassengerAirplane("Airbus",1500,500,20);
        System.out.println("Manufacturer: " + airplane.getManufacturer());
        System.out.println("Max Speed: " + airplane.getMaxSpeed());
        System.out.println("Passenger Capacity: " + airplane.getPassengerCapacity());
        System.out.println("Cabin Crew: " + airplane.getCabinCrew());
        airplane.Menu();
        System.out.print("\n");
        System.out.println("Manufacturer: " + airplane2.getManufacturer());
        System.out.println("Max Speed: " + airplane2.getMaxSpeed());
        System.out.println("Passenger Capacity: " + airplane2.getPassengerCapacity());
        System.out.println("Cabin Crew: " + airplane2.getCabinCrew());
        airplane2.Menu();
        System.out.print("\n");
        CargoAirplane cargo = new CargoAirplane("Amazon Airbus",900,200,5000);
        System.out.println("Manufacturer: " + cargo.getManufacturer());
        System.out.println("Max Speed: " + cargo.getMaxSpeed());
        System.out.println("Cargo Capacity: " + cargo.getCargoCapacity());
        System.out.println("Cabin Crew: " + cargo.getworkers());
    }
}
