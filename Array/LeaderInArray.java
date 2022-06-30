class LeaderInArray
{
                               public static void leader(int[] a,int n)
                               {
                                          int[] b=new int[n];
                                             int i,j=0;
                                              int largest=Integer.MIN_VALUE;
                                           for(i=n-1;i>=0;i--)
                                           {
                                                      if(a[i]>largest)
                                                      {
                                                            largest=a[i];
                                                            b[j]=largest;
                                                             j++;
                                                      }
                                            }
                                              for(j=j-1;j>=0;j--)
                                              {
                                                    System.out.print(b[j]+" ");
                                              }
                                }
                                     public static void main(String[] args)
                                     {
                                                int[] a={2,7,6,1,4,3};
                                                  int n=a.length;
                                                  leader(a,n);
                                      }
}