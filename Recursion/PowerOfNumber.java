class PowerOfNumber
{
                 public static int powerOfNumber(int a,int b)
                 {
                              int s;
                                  if(b==1)
                                  {
                                          return a;
                                  }
                                      s= a*powerOfNumber(a,b-1);
                                        return s;
                 }
                        public static void main(String[] args)
                        {
                                    int a=3,b=4;
                                      System.out.print(powerOfNumber(a,b));
                        }
}