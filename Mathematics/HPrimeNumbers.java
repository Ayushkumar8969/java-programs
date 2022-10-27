class HPrimeNumbers
{
                                  public static void main(String[] args)
                                  {
                                                     printPrime(100);
                                  }
                                  static void printPrime(int n)
                                  {
                                                    int i=0,j=0;
                                                    for(j=2;j<n;j++)
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
                                                                    }
                                                    }
                                  }
}
