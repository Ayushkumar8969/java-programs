import java.util.Scanner;
class MaxMinArray
{
    public static void main(String []args)
    {
         int i,max,min;
          int[] a=new int[10];
         Scanner sc=new Scanner(System.in);
            for(i=0;i<5;i++)
            {
              a[i]=sc.nextInt();
            }
               max=a[0];
                for(i=1;i<5;i++)
                {
                     if(a[i]>max)
                     {
                       max=a[i];
                     }
                }
             System.out.println("Max="+max);
               min=a[0];
                 for(i=1;i<5;i++)
                 {
                    if(a[i]<min)
                    {
                       min=a[i];
                    }
                }
             System.out.println("Min="+min);
    }
}