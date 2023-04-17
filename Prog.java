import java.util.*;


class Myclass
{
 float[] a;
 int number;
 int intervals;
 
 Myclass(int elements ,int intervals)
 {
  number = elements
  this.intervals = intervals;
 }
 
 public void GetDetails();
 {
  System.out.print("Enter the numbers :");
  for(int i =0 ; i<number ; i++)
  {
   System.out.print("/nThe" + i+1 +"th element is :")
   a[i] = sc.nextInt();
  }
 }
  
 public void count()
 {
  int lv;
  int uv;
  for(int i =0;i<number;i++)
  {
   
  }
 }
}

class Prog
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner();
  System.out.print("/nEnter the number of elements you want to enter in the array");
  int elements = sc.nextInt();
  System.out.print("/nEnter the number of interavals you wanna create :")
  int interavls = sc.nextInt();
  Myclass m = new Myclass(elements,intervals);
  
  
 }
}
