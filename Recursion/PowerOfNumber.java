class PowerOfNumber
{
                 public static int powerOfNumber(int a,int b)
                 {
                                  if(b==1)
                                  {
                                          return a;
                                  }
                                      return a*powerOfNumber(a,b-1); 
                 }
                        public static void main(String[] args)
                        {
                                      System.out.print(powerOfNumber(3,4));
                        }
}