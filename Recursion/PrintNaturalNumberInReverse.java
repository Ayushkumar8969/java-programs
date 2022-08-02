class PrintNaturalNumberInReverse 
{
                                      static void printNaturalInReverse(int n)
                                      {
                                                         if(n==1)
                                                         {
                                                               System.out.print(n);
                                                               return;
                                                         }
                                                         System.out.println(n);
                                                         printNaturalInReverse(n-1);
                                      }
                                      public static void main(String[] args) 
                                      {
                                                         printNaturalInReverse(10);
                                      }
}