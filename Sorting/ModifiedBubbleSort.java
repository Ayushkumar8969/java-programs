class ModifiedBubbleSort
{
                                      public static int[] modifiedBubbleSort(int[] a,int n)
                                      {
                                                                  int i,j,temp;
                                                                     for(i=0;i<n-1;i++)
                                                                     {
                                                                               int flag=0;
                                                                                 for(j=0;j<n-1-i;j++)
                                                                                 {
                                                                                           if(a[j]>a[j+1])
                                                                                           {
                                                                                                    temp=a[j];
                                                                                                      a[j]=a[j+1];
                                                                                                      a[j+1]=temp;
                                                                                                        flag=1;
                                                                                           }
                                                                                 }
                                                                                    if(flag==0)
                                                                                    {
                                                                                            break;
                                                                                    }
                                                                     }
                                                                       return a;
                                      }
                                      public static void main(String[] args)
                                         {
                                                             int[] a={25,65,32,41,5,10};
                                                             int n=a.length;
                                                            int[] arr= modifiedBubbleSort(a,n);
                                                             for(int i=0;i<n;i++)
                                                              {
                                                                       System.out.print(arr[i]+" ");
                                                              }
                                         }
}