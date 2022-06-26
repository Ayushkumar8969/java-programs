class PrintNaturalNumbers
{
                 public static void printN(int n)
                 {
                           if(n==1)
                           {
                                  System.out.print(n+" ");
                                  return;
                           }
                               printN(n-1);
                               System.out.print(n+" ");
                 }
                       public static void main(String[] args)
                       {
                                    printN(10);
                       }
}