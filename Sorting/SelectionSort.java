class SelectionSort
{
                                                public static int[] selectionSort(int[] a,int n)
                                                {
                                                                        int i,j,temp,min;
                                                                          for(i=0;i<n-1;i++)
                                                                          {
                                                                                     min=i;
                                                                                       for(j=i+1;j<n;j++)
                                                                                       {
                                                                                                  if(a[j]<a[min])
                                                                                                  {
                                                                                                           min=j;
                                                                                                  }
                                                                                       }
                                                                                  temp=a[i];
                                                                                  a[i]=a[min];
                                                                                  a[min]=temp;
                                                                          }
                                                                               return a;
                                                }
                                                 
                                         public static void main(String[] args)
                                         {
                                                             int[] a={25,65,32,41,5,10};
                                                             int n=a.length;
                                                            int[] arr= selectionSort(a,n);
                                                             for(int i=0;i<n;i++)
                                                              {
                                                                       System.out.print(arr[i]+" ");
                                                              }
                                         }

}