class CountNoOfZeroes1
{
                                    // Special Pattern 
                                    static int countNoOfZeroes(int n) 
                                    {
                                               return helper(n,0);
                                    }
                                    static int helper(int n,int count) 
                                    {
                                                   if(n==0)
                                                   {
                                                         return count;
                                                   }
                                                   if(n%10==0)
                                                   {
                                                          count++;
                                                   }
                                                   return helper(n/10,count);
                                    }
                                    public static void main(String[] args) 
                                    {
                                                     System.out.print(countNoOfZeroes(30200504));
                                    }
}