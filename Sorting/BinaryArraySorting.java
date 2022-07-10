class BinaryArraySorting
{
                                                           public static  int[] binaryArraySorting(int[] a,int n)
                                                           {
                                                                              int i=0,j=n-1;
                                                                                while(i<j)
                                                                                {
                                                                                            if(a[i]>a[j])
                                                                                            {
                                                                                                    a[i]=0;
                                                                                                    a[j]=1;
                                                                                                     i++;
                                                                                                     j--;
                                                                                            }
                                                                                             else
                                                                                             {
                                                                                                     if(a[i]==0)
                                                                                                     {
                                                                                                           i++;
                                                                                                     }
                                                                                                     else{
                                                                                                           j--;
                                                                                                     }
                                                                                             }
                                                                                }
                                                                                 return a;
                                                           }
                                                              public static void main(String[] args)
                                                              {
                                                                                 int[] a={1,0,1,0,0,1,0,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1};
                                                                                 int n=a.length;
                                                                                   int[] arr=binaryArraySorting(a,n);
                                                                                      for(int i=0;i<n;i++)
                                                                                      {
                                                                                                 System.out.print(arr[i]+" ");
                                                                                      }
                                                              }
}