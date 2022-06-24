class LargestSumSubArray
{
                public static int largestSumSubArray(int[] a,int n)
                {
                             int i;
                             int curSum=0; 
                             int maxSum=Integer.MIN_VALUE;
                             for(i=0;i<n;i++)
                             {
                                    curSum=curSum+a[i];
                                       if(curSum>maxSum)
                                       {
                                              maxSum=curSum;
                                       }
                                         if(curSum<0)
                                         {
                                               curSum=0;
                                         }
                             }
                             return maxSum;
                } 
                   public static void main(String[] args)
                   {
                         int[] a={6,-7,4,-2,1,5,-4};
                         int n=a.length;
                             System.out.print(largestSumSubArray(a,n));
                   }
}