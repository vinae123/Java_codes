import java.util.*;
import java.lang.*;

class OddReverse
{
 public String reverseOdd(String input)
  {
   String rev = "";
   if(input.length() % 2 != 0)
   {
    char x;
    for(int i = 0; i< input.length() ; i++)
    { 
     x = input.charAt(i);
     rev = x + rev;
    }
   }
   else
   {
    rev = input;   
   }
   return rev;
  }
}

class oddreversethread implements Runnable
{ 
 String input;
 OddReverse odd;
 Thread t ;
 oddreversethread(String input,OddReverse odd)
 {
  this.input = input;
  this.odd = odd;
  t = new Thread(this);
  t.start();
 }
 public void run()
 {
 try
  {
   t.sleep(1000);
   System.out.println("String is " + odd.reverseOdd(input));
  }
 catch(Exception e)
  {
   System.out.print("Error");
  } 
 } 
}

class Happynumber
{
 public static String happyAlgorithm(int num)
 {
  String out = "";
  int rem = 0, sum = 0;
  
  // calculate the sum of squares of each digit
  while (num > 0) 
  {
   rem = num % 10;
   sum = sum + (rem * rem);
   num = num / 10;
  }
  if (sum == 1) 
  {
   out = "The number entered is a Happy Number";
  } 
  else 
  {
   out  = "The number entered is not a Happy Number";
  }  
  return out; 		
 }
}

class Happynumberthread implements Runnable
{
	int num;
	Happynumber obj;
	Thread t;
	Happynumberthread(int num, Happynumber obj)
	{
		this.num = num;
		this.obj = obj;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			t.sleep(1000);
			System.out.println(num + " " + obj.happyAlgorithm(num));
		}
		catch(Exception e1)
		{
			System.out.println("Interrupted");
		}
	}
}

class Threadreversehappy extends Thread
{
 public void run()
 {
  OddReverse or = new OddReverse();		
  oddreversethread o1 = new oddreversethread("Hello world", or);
  oddreversethread o2 = new oddreversethread("Christ", or);
  oddreversethread o3 = new oddreversethread("Vinay", or);
  try
    {
     Thread.sleep(1000);
    }
  catch(Exception e2)
    {
     System.out.println("Interrupted");
    }
  Happynumber hn = new Happynumber();
  Happynumberthread o4 = new Happynumberthread(10, hn);
  Happynumberthread o5 = new Happynumberthread(48, hn);
  Happynumberthread o6 = new Happynumberthread(100, hn);
 }
}


class Lab10
{
  public static void main(String args[])
   { 
     //OddReverse odd = new OddReverse();
     //oddreversethread o = new oddreversethread("Vinay",odd);
     //o.t.start();
     Threadreversehappy obj = new Threadreversehappy();
     obj.start();
     
   } 
}
