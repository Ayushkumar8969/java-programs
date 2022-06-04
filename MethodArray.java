import java.util.Scanner;
class MethodArray
{
    static int max(int[] a)
    {
        int max,i;
        max=a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    static int min(int[] a)
    {
        int min,i;
        min=a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }
          public static void main(String []args)
          {
              Scanner sc=new Scanner(System.in);
               System.out.print("Enter array size:");
              int size=sc.nextInt();
                int[] array=new int[size];
            System.out.println("Enter array elements:");
              for(int i=0;i<size;i++)
              {
                  array[i]=sc.nextInt();
              }
              int p=max(array);
              int q=min(array);
              System.out.println("max="+p);
              System.out.println("min="+q);
          }
}