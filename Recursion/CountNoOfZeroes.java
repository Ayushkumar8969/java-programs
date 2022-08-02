class CountNoOfZeroes 
{
                                  static int count;
                                    static int countNoOfZeroes(int n) 
                                    {
                                                   if(n==0)
                                                   {
                                                         return count;
                                                   }
                                                   if(n%10==0)
                                                   {
                                                          count++;
                                                   }
                                                   return countNoOfZeroes(n/10);
                                    }
                                    public static void main(String[] args) 
                                    {
                                                     System.out.print(countNoOfZeroes(3020504));
                                    }
}