class MaximumElement 
{
                                       static int maximum(int[] a,int n,int max)
                                       {
                                                         int l=n-1;
                                                          if(l==-1)
                                                          {
                                                                return max;
                                                          }
                                                          if(a[l]>max)
                                                          {
                                                                max=a[l];
                                                          }
                                                          return maximum(a,l,max);
                                       }
                                       public static void main(String[] args)
                                       {
                                                        int[] a={100,40,200,2,8,400};
                                                        int n=a.length;
                                                        int max=Integer.MIN_VALUE;
                                                        System.out.print(maximum(a,n,max));
                                       }
}