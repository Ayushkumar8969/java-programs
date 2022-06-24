class ThreeSumInUnsortedArray
{
             public static int threeSum(int[] a,int n,int sum)
             {
                        int i,j,k;
                        int curSum;
                        for(i=0;i<n;i++)
                        {
                                  for(j=i+1;j<n;j++)
                                  {
                                           for(k=j+1;k<n;k++)
                                           {
                                                    curSum=a[i]+a[j]+a[k];
                                                       if(curSum==sum)
                                                       {
                                                             System.out.print(i+" "+j+" ");
                                                             return k;
                                                       }
                                                       if(curSum>sum)
                                                       {
                                                             break;
                                                       }
                                           }
                                  }
                        }  
                        return -1;        
             }
                 public static void main(String[] args)
                 {
                          int[] a={1,2,4,7,3,5,-2,1};
                          int n=a.length;
                          int sum=9;
                          System.out.print(threeSum(a,n,sum));
                 }
}