
import java.util.*;
  
interface Shape
{
 void GetSurfaceArea();
 void GetVolume();
}

interface Rendering
{
 void getMaterialDetails();
 void calculateCoverAmount();
 void calculateFillAmount();
}

class Rectangle implements Shape,Rendering
{
	double len;
	double height;
	double breadth;
	double Volume,Area,A_Rate,V_Rate;
	String A_Material,V_Material;
	Scanner sc = new Scanner(System.in);
	
	Rectangle(double length,double height,double breadth)
	{
	 this.len = length;
	 this.height = height;
	 this.breadth = breadth;
	}
	
	public void GetSurfaceArea()
	{
	 Area = 2*(len*height + len*breadth + breadth*height);
	 System.out.println("The surface area of the Cuboid is :" + Area);
	}
	
	public void GetVolume()
	{
	 Volume = len*height*breadth;
         System.out.println("The volume of cuboid is :" + Volume); 
	}
	 
	public void getMaterialDetails()
	{
	//covering material details
  	 
  	 System.out.println("Enter the material name :");
  	 A_Material = sc.nextLine();
  	 System.out.println("Enter the price of the material per cm :");
  	 A_Rate = sc.nextDouble(); 
  	 
  	 //Volume materail details
  	 System.out.println("Enter the name of the material you wanna fill the cuboid with :");
	 V_Material = sc.nextLine();
	 System.out.println("Enter the price of the material per cm3");
	 V_Rate = sc.nextDouble();
	}
	
	public void calculateCoverAmount()
	{
	 double CoverAmount = A_Rate*Area;
	 System.out.println("The rate for covering the cuboid with material  " + A_Material +" is :"+ CoverAmount);
	}
	public void calculateFillAmount()
	{

	 double FillAmount = V_Rate * Volume;
	 System.out.println("The cuboid willl be filled with material "+ V_Material + "and it'll cost you :" + FillAmount); 
	}
}

//For traingualr prism wiht base height and breadth as arguments
class TrianglePrism implements Shape,Rendering
{
	double length;
	double height;
	double base;
	double Volume,Area,A_Rate,V_Rate;
	String A_Material,V_Material;
	Scanner sc = new Scanner(System.in);
	
	TrianglePrism(double base, double height,double length)
	{
		this.height = height;
		this.base = base;
		this.length = length;
	}
	
	public void GetSurfaceArea()
	{       
 	 Area = 12*base*height;		
 	 System.out.println("\nThe area of triangularPrism is: " + Area);
	}
	public void GetVolume()
	{
	 Volume = .5 * base * height * length ;
	 System.out.println("\nThe volume of the traingular prism is :" + Volume );
	}
	
	//Getting material Details from the user
	public void getMaterialDetails()
	{
	//Material details for Covering

  	 System.out.println("Enter the material name :");
  	 A_Material = sc.nextLine();
  	 System.out.println("Enter the price of the material per cm :");
  	 A_Rate = sc.nextDouble(); 
  	 
  	//Materail for volume fill
  	 sc.nextLine();
  	 System.out.println("Enter the name of the material you wanna fill the cuboid with :");
	 V_Material = sc.nextLine();
	 System.out.println("Enter the price of the material per cm3");
	 V_Rate = sc.nextDouble();
	}
	
	public void calculateCoverAmount()
	{
	 double CoverAmount = A_Rate*Area;
	 System.out.println("\nThe rate for covering the cuboid with material  " + A_Material +" is"+ CoverAmount);
	}
	public void calculateFillAmount()
	{

	 double price = V_Rate * Volume;
	 System.out.println("\nThe cuboid willl be filled with material "+V_Material + " and it'll cost you :" + price); 
	}
	
}

class Interfaceimplement
{
	public static void main (String args[])
	{
		//cuboid 
		Rectangle R = new Rectangle(31.42, 16.897,14.22);
		R.GetSurfaceArea();
		R.GetVolume();
		R.getMaterialDetails();
		R.calculateCoverAmount();
		R.calculateFillAmount();
		
		//For triangular prism	
		TrianglePrism T = new TrianglePrism(15.21, 12.89,47.2);
		T.GetSurfaceArea();
		T.GetVolume();
		T.getMaterialDetails();
		T.calculateCoverAmount();
		T.calculateFillAmount();
	}
}
