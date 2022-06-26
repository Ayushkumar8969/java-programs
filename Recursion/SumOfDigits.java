class SumOfDigits
{
                     public static int sumOfDigits(int n)
                     {
                                  if(n<10)
                                  {
                                           return n;
                                  }
                                  return n%10 +sumOfDigits(n/10);
                     }
                           public static void main(String[] args)
                           {
                                        System.out.print(sumOfDigits(456)); 
                           }
}