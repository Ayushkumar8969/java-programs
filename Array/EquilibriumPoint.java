class EquilibriumPoint
{
           public static int equilibriumPoint(int[] a,int n)
           {
                   int i=0;
                   int j=n-1;
                   int sum1=0,sum2=0;
                   if(n<2)
                   {
                         return 0;
                   }
                   while(i<j)
                   {
                           sum1=sum1+a[i];
                           sum2=sum2+a[j];
                            if(sum1==sum2)
                            {
                                    return i+1;
                            }
                            i++;
                            j--;
                   }
                   return -1;
           }
              public static void main(String[] args)
              {
                      int[] a={-7,1,5,2,-4,3,0};
                      int n=a.length;
                      System.out.print(equilibriumPoint(a,n));
              }
}