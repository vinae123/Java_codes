import java.util.*;

class set
{
int m,n;
int [] a;
int [] b;

public void get_details()
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of elements in a  :");
  m = sc.nextInt();
  System.out.print("Enter the number of elements in b  :");
  n = sc.nextInt();
  a = new int[m];
  b = new int[n];
  System.out.print("Enter the elements in a :");
  for(int i =0;i<m;i++)
   {
     a[i] = sc.nextInt();   
   }
  System.out.print("Enter the elements in b :");
  for(int i =0;i<n;i++)
   {
     b[i] = sc.nextInt();   
   }	
 }
public void display()
{ 
   System.out.println("The elements in a :");
  for(int i =0;i<m;i++)
   {
     System.out.println(a[i]);   
   }
  System.out.println("The elements in b :");
  for(int i =0;i<n;i++)
   {
    System.out.println(b[i]);    
   }	
}
}

class union extends set
{
 int [] arr = new int[m + n];
 int index = 0;
 public void result()
 {
  display();
  for(int i = 0; i < m; i++)
  {
   arr[index] = a[i];
   index++;
  }
  System.out.print(m);
  
  for (int i = 0; i < n; i++) 
  {
    boolean duplicate = false;
    for (int j = 0; j < m; j++) 
      {
        if (b[i] == a[j]) 
         {
          duplicate = true;
          break;
         } 
      }
     if(!duplicate) 
     {
       arr[index++] = b[i];
     }
  }
  arr = Arrays.copyOf(arr, index);
  System.out.print("The union of A and B is :" );
  for(int i = 0 ; i<index;i++)
  {
   System.out.print(arr[i] + ", " );
  }
 } 
}

class intersection extends set
{
 new intersect = 
 public inter_result()
 {
  for(int i = 0;i<m;i++ )
  {
   for(int j=0;j<n;j++)
   {
    if(a[i]==b[j])
    {
     
    }
   }
  }
 }
}

class CAC
{
 public static void main (String [] args)
 {
  union u = new union();
  u.get_details();
  u.result();
 }
}

