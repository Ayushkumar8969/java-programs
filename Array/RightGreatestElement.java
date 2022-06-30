class RightGreatestElement
{
                                        public static void rightSideGreatestElement(int[] a,int n)
                                        {
                                                    int i;
                                                    for(i=0;i<n;i++)
                                                    {
                                                           int max=0;
                                                             for(int j=i+1;j<n;j++)
                                                             {
                                                                    if(a[j]>max)
                                                                    {
                                                                          max=a[j];
                                                                     }
                                                              }
                                                             a[i]=max;
                                                    }
                                                       a[n-1]=0;
                                                           for(i=0;i<n;i++)
                                                           {
                                                                 System.out.print(a[i]+" ");
                                                            }
                                        }
                                            public static void main(String[] args)
                                            {
                                                     int[] a={7,5,8,9,6,8,5,7,4,6};
                                                        int n=a.length;
                                                          rightSideGreatestElement(a,n);
                                             }
}
