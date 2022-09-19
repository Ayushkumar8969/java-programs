class pair  {  
                                  int first, second;  
                                   public pair(int first, int second)  
                                   {  
                                                 this.first = first;  
                                                 this.second = second;  
                                   }  
                                 void display()
                                 {
                                          System.out.print(first+" "+second);
                                 }
}

class Solution
 {
                                         public static void main(String[] args)
                                         {
                                                         int[] a={4,5,5,5,5,5,5,5,5,8,10,12,15};
                                                         int target=12; 
                                                          pair p1=indexes(a,target);
                                                            p1.display();                  
                                         }
                                    public static pair indexes(int a[], int target)
                                    {
                                                   int start=0;
                                               int end=a.length-1;
                                                int[] ans={-1,-1};
                                             ans[0]=search(a,target,true);
                                             ans[1]=search(a,target,false);
                                               return new pair(ans[0],ans[1]);
                                    }
                             static int search(int[] a,int target,boolean found)
                             {
                                                       int ans=-1;
                                                           int start=0;
                                                        int end=a.length-1; 
                                                   while(start<=end)
                                                   {
                                                             int mid= (int)start + (end-start)/2;
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
