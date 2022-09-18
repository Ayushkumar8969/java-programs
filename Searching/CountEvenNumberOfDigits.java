class CountEvenNumberOfDigits 
{
                             static int countEvenNumberOfDigits(int[] arr) 
                             {
                                                 int count=0;
                                                    if(arr.length==0) 
                                                    {
                                                            return Integer.MIN_VALUE;
                                                    }
                                                      for(int i=0;i<arr.length;i++) 
                                                      {
                                                                   int count1=0;
                                                                   int n=arr[i];
                                                                   if(n==0)
                                                                   {
                                                                         return 1;
                                                                   }
                                                                      /*  while(n!=0) 
                                                                        {
                                                                               count1++;
                                                                               n=n/10;
                                                                        }*/
                                                                        if(n<0)
                                                                        {
                                                                            n=n*-1; 
                                                                        }
                                                                        count1=(int)(Math.log10(n))+1;
                                                                        if(count1%2==0) 
                                                                        {
                                                                               count++;
                                                                        }
                                                      }
                                                        return count;
                             } 
                                public static void main(String[] args) 
                                {
                                                  int[] arr={15,65,20,3,789,4562,15235,82,-60};
                                                  System.out.print(countEvenNumberOfDigits(arr));
                                }
}
