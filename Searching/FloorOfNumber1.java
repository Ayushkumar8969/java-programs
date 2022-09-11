class FloorOfNumber1
{
                             public static void main(String[] args)
                             {
                                           int[] a={10,20,30,40,50,60};
                                            int target=5;
                                            System.out.print(floorOfNumber(a,target));
                             }
                               static int floorOfNumber(int[] a,int target)
                               {
                                         int start=0;
                                         int end=a.length-1;
                                                if(target<a[start])
                                                {
                                                        return -1;
                                                }
                                              
                                            boolean isAsc=a[start]<a[end];

                                            while(start<=end)
                                         {
                                                 int mid= start + (end-start)/2;
                                                       if(target==a[mid])
                                                       {
                                                                  return mid;
                                                       }
                                                 if(isAsc)
                                                 {
                                                             if(target<a[mid])
                                                              {
                                                                    end=mid-1;
                                                              }
                                                             else 
                                                             {
                                                                    start=mid+1;
                                                              }
                                                 }
                                                 else 
                                                 {
                                                                  if(target>a[mid])
                                                                  {
                                                                           end=mid-1;
                                                                   }
                                                                   else 
                                                                   {
                                                                              start=mid+1;
                                                                   }
                                                 }
                                         }
                                         return end;
                                            
                               }
                                 
}
                                 
                                 


 