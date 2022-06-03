import java.util.Scanner;
 class Swap
{
     public static void main(String []args)
     {
         int a,b,c;
         System.out.println("Enter two numbers:");
         Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
           c=a;
           a=b;
           b=c;
           System.out.println("After Swapping:");
           System.out.println("a="+a+" "+"b="+b);
     }
}