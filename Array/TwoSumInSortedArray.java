class TwoSumInSortedArray
{
           public static int twoSum(int[] a,int n,int k)
           {
                      int i=0,sum;
                      int j=n-1;
                      while(i<j)
                      {
                              sum=a[i]+a[j];
                                 if(sum==k)
                                 {
                                       System.out.print(i+" ");
                                       return j;
                                 }
                                 else if(sum>k)
                                   {
                                         j--;
                                   }
                                 else
                                 {
                                        i++;
                                 }
                      }
                      return -1;
           }
               public static void main(String[] args)
                {
                          int[] a={1,2,7,8,10,12};
                          int n=a.length;
                          int k=10;
                         int result=twoSum(a,n,k);
                         System.out.print(result);
                }
}