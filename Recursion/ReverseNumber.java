class ReverseNumber 
{
                                    static int reverseNumber(int n,int sum) 
                                    {
                                                    if(n==0)
                                                    {
                                                            return sum;
                                                    }
                                                    sum=sum*10+(n%10);
                                                    return reverseNumber(n/10,sum);
                                    } 
                                    public static void main(String[] args)
                                    {
                                                     System.out.print(reverseNumber(4568,0));
                                    }
}