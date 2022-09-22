class PeakElement1
{
                                           static void peakElement(int[] a)
                                           {
                                                                 int n=a.length;
                                                               if(a[0]>=a[1])
                                                               {
                                                                        System.out.print(a[0]+" ");
                                                               }
                                                               
                                                               for(int i=1;i<n-1;i++)
                                                               {
                                                                              if(a[i-1]<=a[i] && a[i]>=a[i+1])
                                                                              {
                                                                                         System.out.print(a[i]+" ");
                                                                              }
                                                               }

                                                               if(a[n-2]<=a[n-1])
                                                               {
                                                                       System.out.print(a[n-1]);
                                                               }
                                           }
                                             public static void main(String[] args) 
                                             {
                                                                      int[] a={10,20,30,40,50,90};
                                                                      peakElement(a);
                                             }
}