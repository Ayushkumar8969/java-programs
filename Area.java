import java.util.Scanner;
class Area
{
    public static void main(String []args)
    {
        float r;
        System.out.print("Enter radius:");
        Scanner sc = new Scanner (System.in);
           r=sc.nextFloat();
           System.out.println("Area="+(3.14*r*r));
           System.out.println("Perimeter="+(2*3.14*r));
    }
}