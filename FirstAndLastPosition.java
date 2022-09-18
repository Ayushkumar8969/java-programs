class FirstAndLastPosition 
{
                            public static void main(String[] args) 
                            {
                                           int[] a={5,7,8,8,8,8,8,10,12,13};
                                           int target=8;
                                            int[] b=firstAndLastPosition(a,target);
                                            System.out.print(b[0]+" "+b[1]);
                            }
                            static int[] firstAndLastPosition(int[] a,int target) 
                            {
                                                    int[] ans={-1,-1};
                                                    ans[0]=search(a,target,true);
                                                    ans[1]=search(a,target,false);
                                                    return ans;
                            }
                            static int search(int[] a,int target,boolean found)
                            {
                                                       int ans=-1;
                                                           int start=0;
                                                        int end=a.length-1; 
                                                   while(start<=end)
                                                   {
                                                             int mid= start + (end-start)/2;
                                                               if(target==a[mid])
                                                               {
                                                                        ans=mid;
                                                                        if(found)
                                                                        {
                                                                             end=mid-1;
                                                                        }
                                                                        else
                                                                        {
                                                                              start=mid+1;
                                                                        }
                                                               }
                                                              else if(target<a[mid])
                                                              {
                                                                      end=mid-1;
                                                              }
                                                              else{
                                                                        start=mid+1;
                                                              }
                                                   }
                                                   return ans;
                            }
}
