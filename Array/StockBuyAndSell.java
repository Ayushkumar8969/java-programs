class StockBuyAndSell
{
                               public static void stockBuySell(int[] a,int n)
                              {
                                           int currProfit=0,profit=0,maxProfit=0;
                                           int i,temp=0,start=0,end=0;
                                             for(i=1;i<n;i++)
                                             {
                                                         currProfit=a[i]-a[i-1];
                                                           if(currProfit>0)
                                                           {
                                                                       profit=profit+currProfit;
                                                                          if(profit>maxProfit)
                                                                          {
                                                                                    maxProfit=profit;
                                                                                    start=temp;
                                                                                    end=i;
                                                                          }
                                                           }  
                                                           else{
                                                                     if(start!=end)
                                                                     {
                                                                           System.out.println(start+" "+end);
                                                                     }
                                                                              currProfit=0;
                                                                                 profit=0;
                                                                                 temp=i;
                              
                                                           }
                                             }
                                                if(start!=end){
                                                  System.out.println(start+" "+end);
                                                }
                                               if(maxProfit==0)
                                               {
                                                      System.out.print("No Profit");
                                               }
                              }
                                    public static void main(String[] args)
                                    {
                                                     int[] a={100,80,210,360,40,535,695};
                                                     int n=a.length;
                                                         stockBuySell(a,n);
                                    }
}