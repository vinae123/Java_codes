import java.lang.*;
class callme
{
 void call(String msg)
 {
  System.out.print("["+ msg);
  try
   {
    Thread.sleep(1000);
   }
  catch(Exception e)
   {
    System.out.println("Interrupted");
   }
   System.out.println("]");
 }
}
class caller implements Runnable 	
 {
  String msg;
  callme target;
  Thread t;
 public caller(callme targ, String S)
  {
   target=targ;
   msg=S;
   t.start();
  }
 public void run()
  {
   target.call(msg);
  }
}
class synchr1
{
 public static void main(String args[])
 {
  callme target= new callme();
  caller ob1= new caller(target,"Hello");
  //caller ob2= new caller(target,"Synchronized");
  //caller ob3= new caller(target,"World");
  try
   {
    ob1.t.join();
    //ob2.t.join();
    //ob3.t.join();
   }
  catch(Exception e)
  {
   System.out.println("Interrupted");
  }
 }
}
