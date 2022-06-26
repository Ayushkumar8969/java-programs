class SumOfNSquare
{
                    public static int sumOfNSquare(int n)
                    {
                                   if(n==1)
                                   {
                                         return n;
                                   }
                                   return n*n +sumOfNSquare(n-1);
                    }
                        public static void main(String[] args)
                        {
                                        System.out.print(sumOfNSquare(5));
                        }
}