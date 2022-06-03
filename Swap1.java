import java.util.Scanner;
class Swap1
{
    public static void main(String []args)
    {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
      a=sc.nextInt();
      b=sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After Swapping:");
      System.out.println("a="+a+" "+"b="+b);
    }
}