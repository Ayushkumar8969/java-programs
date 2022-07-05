class CheckSortedAndRotated
{
                                  public static int checkSortedAndRotated(int[] a,int n)
                                  {
                                                    int min=0,i,j;
                                                    for(i=1;i<n;i++)
                                                    {
                                                                    if(a[i]<a[min])
                                                                    {
                                                                            min=i;
                                                                    }
                                                    }
                                                      for(i=1;i<min;i++)
                                                      {
                                                                   if(a[i]<a[i-1])
                                                                   {
                                                                          return 0;
                                                                   }
                                                      }
                                                         j=min;
                                                         for(i=j+1;i<n;i++)
                                                         {
                                                                       if(a[0]<a[i] || a[j]>a[i])
                                                                       {
                                                                                  return 0;
                                                                       }
                                                         }
                                                           return 1;
                                  }
                                       public static void main(String[] args)
                                       {
                                                         int[] a={30,40,50,10,20};
                                                        int n=a.length;
                                                             int res=checkSortedAndRotated(a,n);
                                                                if(res==1)
                                                                {
                                                                             System.out.print("Sorted And Rotated");
                                                                }
                                                                  else
                                                                  {
                                                                            System.out.print("Not Sorted And Rotated");
                                                                  }
                                       }
}