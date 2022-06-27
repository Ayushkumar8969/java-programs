class PrintLargestSumSubArray
{
                        public static void printLargestSumSubArray(int[] a,int n)
                        {
                                         int start=0,end=0,temp=0;
                                         int curSum=0,maxSum=Integer.MIN_VALUE;
                                         int i;
                                         for(i=0;i<n;i++)
                                         {
                                                    curSum=curSum+a[i];
                                                    if(curSum>maxSum)
                                                    {
                                                               start=temp;
                                                               maxSum=curSum;
                                                               end=i;
                                                    }
                                                    if(curSum<0)
                                                    {
                                                                curSum=0;
                                                                temp=i+1;
                                                    }
                                         }
                                         System.out.println(maxSum);
                                         for(i=start;i<=end;i++)
                                         {
                                                   System.out.print(a[i]+" ");
                                         }
                        }
                              public static void main(String[] args)
                              {
                                            int[] a={-2,-3,-4,-1,1,2,4,-5,-6};
                                            int n=a.length;
                                                   printLargestSumSubArray(a,n);
                              }
}