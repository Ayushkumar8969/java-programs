class PrimeNumber
 {
                            public static void main(String[] args)
                            {
                                            checkPrime(11);
                            }
                            static void checkPrime(int n)
                            {
                                             int i=0;
                                             for(i=2;i<=n/2;i++)
                                             {
                                                           if(n%i==0)
                                                           {
                                                                 break;
                                                           }
                                             }
                                             if(i>n/2)
                                             {
                                                    System.out.println("Prime Number");
                                             }
                                             else 
                                             {
                                                     System.out.println("Not a prime");
                                             }
                            }
}   
