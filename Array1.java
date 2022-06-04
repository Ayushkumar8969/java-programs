import java.lang.*;
import java.util.Scanner;
class Array1
{
    public static void main (String args[])
    {
        float[] a=new float[5];
        int i;
        float avg,sum=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextFloat();
        }
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/5;
        for(i=0;i<5;i++)
        {
            if(a[i]>avg)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}