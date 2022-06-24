 class WaveArray
{
          public static void convertToWave(int[] a,int n)
          {
                   int i=0,j=1;
                   int temp;
                     while(i<n-1 && j<n)
                     {
                             temp=a[i];
                             a[i]=a[j];
                             a[j]=temp;
                             i=i+2;
                             j=j+2;
                     }
                     for(i=0;i<n;i++)
                     {
                             System.out.print(a[i]+" ");
                     }
          }
             public static void main(String[] args)
             {
                        int[] a={1,2,3,4,5};
                        int n=a.length;
                        convertToWave(a,n);
             }
}