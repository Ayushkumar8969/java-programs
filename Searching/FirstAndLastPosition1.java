import java.util.*;
class FirstAndLastPosition1 
{
                            public static void main(String[] args) 
                            {
                                           int[] a={5,7,8,8,8,8,8,10,12,13};
                                           int target=7;
                                            ArrayList<Integer> b=firstAndLastPosition(a,target);
                                            System.out.print(b);
                            }
                            static ArrayList<Integer> firstAndLastPosition(int[] a,int target) 
                            {
                                              ArrayList<Integer> list=new ArrayList<Integer>();
                                                    list.add(search(a,target,true));
                                                    list.add(search(a,target,false));
                                                    return list;
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
