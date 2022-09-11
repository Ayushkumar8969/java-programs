class CeilingOfNumber 
{
                                     static int ceilingOfNumber(int[] a,int target) 
                                     {
                                                          int start=0;
                                                         int end=a.length-1;
                                                           if(target>a[end])
                                                           {
                                                                    return -1;
                                                           }
                                                           while(start<=end) 
                                                           {
                                                                         int mid= start + (end-start)/2;
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
                                                                                          if(target<a[start])
                                                                                          {
                                                                                                  return start;
                                                                                          }
                                                                             }
                                                           } 
                                                           return start;
                                     }
                                       public static void main(String[] args) 
                                       {
                                                         int[] a={2,3,5,9,14,16,18};
                                                         int target=15;
                                                         System.out.print(ceilingOfNumber(a,target));
                                       }
}