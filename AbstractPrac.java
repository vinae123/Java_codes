
import java.util.*;
  
abstract class Shape
{
  double length;
  double height;
        Shape(double length,double height)
        {
         this.length = length;
         this.height = height; 
        }
	abstract public void area();
}

class Rectangle extends Shape
{
	//double len;
	//double hght;
	double breadth;
	
	Rectangle(double length, double height,double breadth)
	{
		super(length ,height);
		this.breadth = breadth;
	}
	
	public void area()
	{
		double ar = length*height*breadth;
		System.out.println("The volume of rectangle is: " + ar); 
	}
}

class Triangle extends Shape
{
	//double base;
	//double hght;
	double length;
	
	Triangle(double base, double height,double length)
	{
		super(length,height);
		this.base = base;
	}
	
	public void area()
	{
		double ar = 0.5*base*height*length;
		System.out.println("The area of triangle is: " + ar);
	}
}

class AbstractPrac
{
	public static void main (String args[])
	{
		Rectangle R = new Rectangle(31.42, 16.897,14.22);
		R.area();
		
		System.out.println("--------------------------------------------------");
		
		Triangle T = new Triangle(15.12, 7.89,47.2);
		T.area();
	}
}
