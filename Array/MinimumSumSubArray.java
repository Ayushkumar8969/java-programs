class MinimumSumSubArray
{
            public static int minSumSubArray(int[] a,int n)
            {
                      int i;
                      int curSum=0;
                      int minSum=Integer.MAX_VALUE;
                      for(i=0;i<n;i++)
                      {
                             curSum=curSum+a[i];
                              if(curSum<minSum)
                             {
                                    minSum=curSum;
                             }
                             if(curSum>0)
                             {
                                     curSum=0;
                             }
                      }
                        return minSum;
            }
                public static void main(String[] args)
                {
                       int[] a={3,-4,2,-3,-1,7,-5}; 
                       int n=a.length;
                          System.out.print(minSumSubArray(a,n));
                }
}