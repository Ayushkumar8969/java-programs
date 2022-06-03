import java.util.Scanner;
class Product
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.print("Enter two numbers:");
        Scanner sc = new Scanner (System.in);
           a=sc.nextInt();
           b=sc.nextInt();
           System.out.println(a*b);
    }
}