class MergeTwoSortedArrays 
{
                                                   public static int[] mergeTwoSortedArrays(int[] a,int[] b,int[] c,int n1,int n2,int size)
                                                   {
                                                                                 int i=0,j=0,k;
                                                                                 for(k=0;k<size;k++)
                                                                                 {
                                                                                            if(i<n1 && j<n2)
                                                                                            {
                                                                                                      if(b[j]<a[i])
                                                                                                      {
                                                                                                            c[k]=b[j];
                                                                                                            j++;
                                                                                                      }
                                                                                                       else 
                                                                                                       {
                                                                                                             c[k]=a[i];
                                                                                                              i++;
                                                                                                       }
                                                                                            }
                                                                                             else 
                                                                                             {
                                                                                                          if(i<n1)
                                                                                                          {
                                                                                                                  c[k]=a[i];
                                                                                                                  i++;
                                                                                                          }
                                                                                                          if(j<n2)
                                                                                                          {
                                                                                                                   c[k]=b[j];
                                                                                                                   j++;
                                                                                                          }
                                                                                             }
                                                                                 }
                                                                                 return c;
                                                   }
                                                     public static void main(String[] args)
                                                     {
                                                                   int[] a={10,20,30,40};
                                                                   int[] b={4,5,8,11,15,18,21};
                                                                    int n1=a.length;
                                                                    int n2=b.length;
                                                                    int size=n1+n2;
                                                                    int[] c=new int[size];
                                                                      int[] arr=mergeTwoSortedArrays(a,b,c,n1,n2,size);
                                                                       for(int i=0;i<size;i++)
                                                                       {
                                                                               System.out.print(arr[i]+" ");
                                                                       }
                                                     }
}