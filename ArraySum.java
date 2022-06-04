class ArraySum
{
     public static void main(String []args)
     {
         int i,sum=0;
         int[] a={10,20,30,40,50};
         for(i=0;i<a.length;i++)
         {
             sum=sum+a[i];
         }
         System.out.println("Sum="+sum);
     }
}