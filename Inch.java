import java.util.Scanner;
class Inch
{
    public static void main(String []args)
    {
        float i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextFloat();
        System.out.println("In meters="+(0.0254*i));
    }
}