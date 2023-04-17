import java.util.*;
import java.lang.*; 
import java.util.regex.*;  

class Mnemoist
{
 public String A;
 String Con[];
 
 //Constructor for the class Mnemoist
 
 Mnemoist(String A)
 {
  this.A = A;
 }
/* public void validNum()
 {
  if(A.length == 12)
  {
   if(Character.isDigit(A.charAt(i)))
   
  }
 }*/

 public void Dispaly_input()
 {
  Con = A.split("-");
  System.out.println("The string entered by the user is :");
  for(int i =0; i< Con.length;i++)
  {
    for(int j = 0;j < Con[i].length();j++)
     {
       System.out.println(Con[i].charAt(j));
     }
  
  }
 }
 public void Convert()
 { 
 try
 {
   Con = A.split("-");
   StringBuffer sb = new StringBuffer();
   for(int i =0; i< Con.length;i++)
   {
    for(int j = 0;j < Con[i].length();j++)
     {
     String a = String.valueOf(Con[i].charAt(j));
       if(Pattern.matches("[0-9]",a))
       {
        sb.append(Con[i].charAt(j));
       	continue;
       }
       else if(Pattern.matches("[A-Z]",a))
       {
        if(Pattern.matches("[ABC]",a))
        {
         sb.append("2");
        }
        else if(Pattern.matches("[DEF]",a))
        {
         sb.append("3");
        }
        else if(Pattern.matches("[GHI]",a))
        {
         sb.append("4");
        }
        else if(Pattern.matches("[JKL]",a))
        { 
         sb.append("5");
        }
        else if(Pattern.matches("[MNO]",a))
        { 
         sb.append("6");
        }
        else if(Pattern.matches("[PQRS]",a))
        {
         sb.append("7");
        }
        else if(Pattern.matches("[TUV]",a))
        {
         sb.append("8");
        }
        else if(Pattern.matches("[WXYZ]",a))
        {
         sb.append("9");
        }
       else
       {
        System.out.print("Your input was wrong ");
       }
       }
     }
  }
   sb.insert(3,"-");
   sb.insert(7,"-");
   System.out.println("The sorted array is :" + sb);
 }
  catch(Exception e)
  {
   System.out.print("Wrong input ");
  }
 }
 
}


class Numbers
{
 public static void main(String arg [])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the 10 digit number as XXX-XXX-XXXX :");
  String num = sc.nextLine();
  Mnemoist m = new Mnemoist(num);
  m.Dispaly_input();
  m.Convert();
 }
}
