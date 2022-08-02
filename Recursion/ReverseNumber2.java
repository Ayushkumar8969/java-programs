class ReverseNumber2 
{
                                    static int reverseNumber(int n) 
                                    {
                                              return helper(n,0);
                                    }
                                    static int helper(int n,int sum) 
                                    {
                                                    if(n==0)
                                                    {
                                                            return sum;
                                                    }
                                                    sum=sum*10+(n%10);
                                                    return helper(n/10,sum);
                                    } 
                                    public static void main(String[] args)
                                    {
                                                     System.out.print(reverseNumber(108109));
                                    }
}