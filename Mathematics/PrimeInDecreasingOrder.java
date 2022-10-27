class PrimeInDecreasingOrder
{
                                    public static void main(String[] args)
                                    {
                                                printPrime(8,10);
                                    }    
                                    static void printPrime(int m,int n)
                                    {
                                                        int i=0,j=0,count=0;
                                                        int max=m>n?m:n;
                                                        int min=m<n?m:n;
                                                        for(j=max;j>=min;j--)
                                                        {
                                                                        for(i=2;i<=j/2;i++)
                                                                        {
                                                                                    if(j%i==0)
                                                                                    {
                                                                                          break;
                                                                                    }
                                                                        }
                                                                        if(i>j/2)
                                                                        {
                                                                               System.out.print(j+" ");
                                                                               count++;
                                                                        }
                                                        }
                                                        if(count==0)
                                                        {
                                                               System.out.print(-1);
                                                        }
                                    }
}
