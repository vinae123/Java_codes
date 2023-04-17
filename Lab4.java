import java.util.*
class Aerospace  
 {	
   String AirplaneName;
   String SerialNumber;
   int Velocity;
   int Altitude;
   int N_Pilots;
   Aerospace(String Name,String S_Numb,int max_velocity,int Altitude,int N_Pilots)
   	{
   	 AirplaneName = Name;
   	 SerialNumber = S_numb;
   	 Max_Velocity = max_velocity;
   	 this.Altitude = Altitude;
   	 this.N_Pilots = N_pilots;
   	} 
   public static String Airplane_info()
   `	{	
   	   Stringbuffer sb = new Stringbuffer();
           sb.append("Aircraft name " + name + "\n");
	   sb.append("Serial Number" + SerialNumber + "\n");
	   sb.append("Max Velocity" + Max_Velocity + "\n");
	   sb.append("Max Altitude" + this.Altitude + "\n" );
	   sb.append("Number of pilots" + this.N_pilots + "\n");    
	   return sb.toString();
  	 }
  	 
  public void replace_plane()
  	{
  		Stringbuffer s = new Stringbuffer();
  		s.append[name];
  	 }
 }
 
 Class Lab4
 {
 public void main()
 	{
 	 
 	}
 }
 
