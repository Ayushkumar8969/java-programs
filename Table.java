import java.lang.*;
import java.util.Scanner;
class Table
{
    public static void main(String []args)
    {
        int a,i;
        System.out.print("Enter Number:");
        Scanner sc =new Scanner(System.in);
          a=sc.nextInt();
          for(i=1;i<=10;i++)
          {
              System.out.println(a+"x"+i+"="+(a*i));
          }
    }
}