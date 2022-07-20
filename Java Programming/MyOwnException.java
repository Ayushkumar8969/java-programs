   // creating my own Exception 
import java.util.Scanner;
class MyException extends Exception 
{
                         MyException()
                         {
                                 System.out.println("Password should be 8 characters long");     
                         }
}
class UserDefinedException 
{
                        static void check(int n)
                         {
                                     try 
                                     {
                                               if(n<8)
                                               {
                                                       throw new MyException();
                                               }
                                               else
                                               {
                                                        System.out.println("Right Password");
                                               }
                                     }
                                     catch(MyException e)
                                     {
                                             System.out.println("Exception Caught");
                                     }
                         }
                           public static void main(String[] args) 
                           {
                                         Scanner sc=new Scanner(System.in);
                                         System.out.print("Enter Password:");
                                       //  String s=sc.nextLine();
                                        // int n=s.length();
                                         check(sc.nextLine().length());
                           }
}