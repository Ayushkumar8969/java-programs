class IntersectionOfTwoSortedArrays
{
                                              public static void intersection(int[] a,int[] b,int[] c,int n1,int n2)
                                              {
                                                                             int i,j,k=0;
                                                                             for(i=1;i<n1;i++)
                                                                             {
                                                                                       if(a[i]!=a[i-1])
                                                                                       {
                                                                                                  for(j=0;j<n2;j++)
                                                                                                  {
                                                                                                             if(a[i-1]==b[j])
                                                                                                             {
                                                                                                                   c[k]=b[j];
                                                                                                                   k++;
                                                                                                             }
                                                                                                  }
                                                                                       }
                                                                             }
                                                                                for(j=0;j<n2;j++)
                                                                                {
                                                                                         if(a[n1-1]==b[j])
                                                                                         {
                                                                                               c[k]=b[j];
                                                                                               k++;
                                                                                         }
                                                                                }
                                                                                for(i=0;i<k;i++) 
                                                                                  {
                                                                                             System.out.print(c[i]+" ");
                                                                                  }
                                                }
                                                    public static void main(String[] args)
                                                    {
                                                                             int[] a={2,5,6,6,7,8};
                                                                             int n1=a.length;
                                                                         int[] b={1,1,2,3,6,6,7,8};
                                                                          int n2=b.length;
                                                                            int size=n1<n2?n1:n2;
                                                                               int[] c=new int[size];
                                                                                intersection(a,b,c,n1,n2);
                                                                                 /* for(int i=0;i<size;i++)
                                                                                  {
                                                                                             System.out.print(arr[i]+" ");
                                                                                  }*/
                                                    }
}