class ReverseArray
{
                  public static int[] reverse(int[] a,int start,int end)
                  {
                             int temp;
                                  if(start>=end)
                                  {
                                         return a;
                                  }
                                     temp=a[start];
                                     a[start]=a[end];
                                     a[end]=temp;
                                     start++;
                                     end--;
                             reverse(a,start,end);
                                return a;
                  }
                      public static void main(String[] args)
                      {
                                    int[] a={10,20,30,40,50,60};
                                    int n=a.length;
                                    int start=0,end=n-1;
                                    int[] b=reverse(a,start,end);
                                        for(int i=0;i<b.length;i++)
                                        {
                                                 System.out.print(b[i]+" ");
                                        }

                      }
}