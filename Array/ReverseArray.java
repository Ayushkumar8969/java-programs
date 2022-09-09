class ReverseArray
{
                       static void reverseArray(int[] a)
                       {
                                         int start=0;
                                       int end=a.length-1;
                                    while(start<=end)
                                    {
                                            swap(a,start,end);
                                              start++;
                                               end--;
                                    }
                       }
                         static void swap(int[] a,int start,int end) 
                         {
                                        int temp=a[start];
                                          a[start]=a[end];
                                            a[end]=temp;
                         }
                            public static void main(String[] args)
                            { 
                                          int[] a={15,25,35,55,65};
                                             reverseArray(a);
                                          for(int i=0;i<a.length;i++)
                                          {
                                                  System.out.print(a[i]+" ");
                                          }
                            }
}
