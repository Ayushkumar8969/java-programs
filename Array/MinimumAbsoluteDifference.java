class MinimumAbsoluteDifference
{
         public static int  minAdjDiff(int[] a,int n)
         {
                  int i,d,min=a[0];
                  for(i=1;i<n;i++)
                  {
                        d=a[i]-a[i-1];
                          if(d<0)
                          {
                               d=-(d);
                          }
                          if(d<min)
                          {
                               min=d;
                          }
                  }
                     d=a[n-1]-a[0];
                       if(d<0)
                       {
                            d=-(d);
                       }
                       if(d<min)
                       {
                          min=d;
                       }
                return min;
         }
             public static void main(String[] args)
             {
                      int[] a={10,-3,-4,7,6,5,-4,-1};
                      int n=a.length;
                       System.out.print(minAdjDiff(a,n));
             }
}