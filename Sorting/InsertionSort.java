class InsertionSort
{
                                      public static int[] insertionSort(int[] a,int n)
                                      {
                                                          int i,j,temp;
                                                            for(i=1;i<n;i++)
                                                            {
                                                                       for(j=i-1;j>=0;j--)
                                                                       {
                                                                                  if(a[j+1]<a[j])
                                                                                  {
                                                                                          temp=a[j+1];
                                                                                          a[j+1]=a[j];
                                                                                          a[j]=temp;
                                                                                  }
                                                                                   else
                                                                                   {
                                                                                           break;
                                                                                   }
                                                                       }
                                                            }
                                                                  return a;
                                      }
                                         public static void main(String[] args)
                                         {
                                                             int[] a={25,65,32,41,5,10};
                                                             int n=a.length;
                                                            int[] arr= insertionSort(a,n);
                                                             for(int i=0;i<n;i++)
                                                              {
                                                                       System.out.print(arr[i]+" ");
                                                              }
                                         }
}