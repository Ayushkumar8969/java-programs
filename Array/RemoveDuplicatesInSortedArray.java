class RemoveDuplicatesInSortedArray
{
                                                            static int remove(int[] a,int n)
                                                           {
                                                                         int i=0,j=0;
                                                                         a[j]=a[i];
                                                                        for(i=1;i<n;i++)
                                                                        {
                                                                               if(a[j]!=a[i])
                                                                               {
                                                                                        j++;
                                                                                       a[j]=a[i];
                                                                               }
                                                                        }
                                                                        for(int k=0;k<=j;k++)
                                                                        {
                                                                                 System.out.print(a[k]+" ");
                                                                        }
                                                                          System.out.println();
                                                                        return j+1;
                                                            }
                                                           public static void main(String[] args)
                                                           {
                                                                        int[] a={2,2,3,3,4,4,7};
                                                                        int n=a.length;
                                                                        System.out.print("Total no. of distinct elements:"+remove(a,n));  // total no. of of distinct elements
                                                           }
}