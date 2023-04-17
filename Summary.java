import java.util.*;
import java.util.Scanner;
import java.lang.Math.*;

class Summary
{
 public static void main(String args[])
 {
  float sum = 0;
  float median = 0;
  Scanner sc = new Scanner(System.in);
  System.out.print("The number of elements you want in the int array element :");
  int n = sc.nextInt();
  float A [] =  new float[n];
  for(int i = 0;i<n;i++)
   {
    System.out.println( "Enter the elements :");
    A[i] = sc.nextInt();  
   }
  //Sorting the array for 5 summary 
  Arrays.sort(A);
  System.out.print("The sorted array is :");
  for(int i = 0;i<n;i++)
  {
   System.out.print("  "+ A[i] + "  ");
  }
  //Mean of the Data 
  for(int i =0;i<n;i++)
  {
   sum = sum + A[i];
  } 
  float Mean = sum/n;
  //max value
  float max = A[n-1];
  
  //min value
  float min = A[0];
  
  double lowerQuartile;
  double upperQuartile;
  if(n%2 == 0)
  {
   median = (A[n/2 - 1] + A[n/2])/2;    //Median of the data
   int Uindex = (3*n)/4;
   int Lindex = n/4 ;
   //Lower and upper quartile
   
   lowerQuartile = (A[Lindex -1] + A[Lindex])/2; 
   upperQuartile = (A[Uindex-1]+A[Uindex])/2;
   System.out.println("\nThe mean of the data is :" + Mean);
   System.out.println("The Median value of the data is :"+ median);
   System.out.println("The max value in the data is :" + max);
   System.out.println("The min value in the data is :" + min);
   System.out.println("Lower quartile is :"+ lowerQuartile);
   System.out.println("Upper quartile is :" + upperQuartile);  
  }
  else
  {
   int index;
   median = A[(n+1)/2];
   index = (n+1)/4;
   lowerQuartile = A[index-1];
   index = 3*((n+1)/4);
   upperQuartile = A[index-1];
   System.out.println("\n The mean of the data is :" + Mean);
   System.out.println("The Median value of the data is :"+ median);
   System.out.println("The max value in the data is :" + max);
   System.out.println("The min value in the data is :" + min);
   System.out.println("Lower quartile is :"+ lowerQuartile);
   System.out.println("Upper quartile is :" + upperQuartile);  
  }

  
 }
}
