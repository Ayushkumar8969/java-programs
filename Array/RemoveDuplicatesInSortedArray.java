class RemoveDuplicatesInSortedArray
{
                                                            static int removeDuplicate(int[] a,int n)
                                                           {
                                                                         int j=0;
                                                                         a[j]=a[0];
                                                                        for(int i=1;i<n;i++)
                                                                        {
                                                                               if(a[j]!=a[i])
                                                                               {
                                                                                        j++;
                                                                                       a[j]=a[i];
                                                                               }
                                                                        }
                                                                        for(int i=0;i<=j;i++)
                                                                        {
                                                                                 System.out.print(a[i]+" ");
                                                                        }
                                                                          System.out.println();
                                                                        return j+1;
                                                            }
                                                           public static void main(String[] args)
                                                           {
                                                                        int[] a={2,2,3,3,4,4,7};
                                                                        int n=a.length;
                                                                        System.out.print("Total no. of distinct elements:"+removeDuplicate(a,n));  // total no. of of distinct elements
                                                           }
}
