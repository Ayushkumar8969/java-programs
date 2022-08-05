class ReverseArrayGroups
{
                                              static void reverseInGroups(int[] a,int n,int k)
                                             {
                                                                    reverse(a,0,k-1);
                                                                    reverse(a,k,n-1);
                                             }
                                             static void reverse(int[] a,int start,int end)
                                            { 
                                                                    int temp;
                                                                           while(start<end)
                                                                           {
                                                                               temp=a[start];
                                                                               a[start]=a[end];
                                                                                a[end]=temp;
                                                                                  start++;
                                                                                 end--;
                                                                            }
                                            }
                                              public static void main(String[] args)
                                              {
                                                         int a[]={10,20,30,40,50,60};
                                                           int n=a.length;
                                                             int k=3;
                                                                reverseInGroups(a,n,k);
                                                              for(int i=0;i<n;i++)
                                                              {
                                                                     System.out.print(a[i]+" ");
                                                              }
                                              }
  
}