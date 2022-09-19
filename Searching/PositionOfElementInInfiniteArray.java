class PositionOfElementInInfiniteArray 
{
                                              static int searchArray(int[] a,int target)
                                              {
                                                               int start=0;
                                                                 int end=1;
                                                                   while(target>a[end])
                                                                   {
                                                                                 start=2*start+2;
                                                                                     end=2*start+1;
                                                                   }
                                                                      if(target==a[end])
                                                                      {
                                                                              return end;
                                                                      }
                                                                   return searchElement(a,target,start,end);
                                              }
                                              static int searchElement(int[] a,int target,int start,int end) 
                                              {
                                                                               while(start<=end)
                                                                               {
                                                                                          int mid=start + (end-start)/2;
                                                                                             if(target==a[mid])
                                                                                             {
                                                                                                         return mid;
                                                                                             }
                                                                                             else if(target<a[mid])
                                                                                             {
                                                                                                         end=mid-1;
                                                                                             }
                                                                                             else 
                                                                                             {
                                                                                                       start=mid+1;
                                                                                             }
                                                                               }
                                                                                return -1;
                                              }
                                                public static void main(String[] args)
                                                {
                                                                  int[] a={10,15,20,25,30,35,40};
                                                                    int target=35;
                                                                    System.out.print(searchArray(a,target));
                                                }
}