class QuickSort 
{
                               public static int quick(int[] a,int startIndex,int endIndex)
                               {
                                                        int left=startIndex;
                                                        int right=endIndex;
                                                         int loc=startIndex;

                                                         while(left<right)
                                                         {
                                                                          while(left<right && a[loc]<=a[right])
                                                                          {
                                                                                      right--;
                                                                          }
                                                                             if(left==right)
                                                                             {
                                                                                  break;
                                                                             }
                                                                            else 
                                                                            {
                                                                                     swap(a,loc,right);
                                                                                      loc=right;
                                                                            }
                                                                           while(left<right && a[left]<=a[loc])
                                                                           {
                                                                                       left++;
                                                                           }
                                                                             if(left==right)
                                                                             {
                                                                                    break;
                                                                             }
                                                                             else 
                                                                             {
                                                                                    swap(a,left,loc);
                                                                                    loc=left;
                                                                             }
                                                         }
                                                                  return loc;
                               }
                                 public static void swap(int[] b,int i,int j)
                                 {
                                                    int temp=b[i];
                                                    b[i]=b[j];
                                                    b[j]=temp;
                                 }
                                   public static int[] quick_Sort(int[] a,int start,int end)
                                   {
                                                         int loc=quick(a,start,end);
                                                          if(start+1<loc)
                                                          {
                                                                quick_Sort(a,start,loc-1);
                                                          }
                                                           if(end>loc+1)
                                                           {
                                                                quick_Sort(a,loc+1,end);
                                                           }
                                                           return a;
                                   }
                                   public static void main(String[] args)
                                   {
                                                      int[] a={10,10,31,25,14,14,90,12};
                                                      int n=a.length;
                                                        int[] arr=quick_Sort(a,0,n-1);
                                                          for(int i=0;i<n;i++)
                                                          {
                                                                     System.out.print(arr[i]+" ");
                                                          }
                                                                                         
                                   }
}