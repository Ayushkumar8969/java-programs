import java.util.Scanner;
class LeapYear
{
    public static void main(String []args)
    {
    int a;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a year:");
      a=sc.nextInt();
        if(a%100==0)
        {
            if(a%400==0)
            {
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else{
            if(a%4==0)
            {
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
    }
}