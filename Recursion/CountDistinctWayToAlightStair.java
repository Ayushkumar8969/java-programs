class CountDistinctWayToAlightStair 
{
                           static int stair(int n)
                           {
                                      if(n==1)
                                      {
                                           return 1;
                                      }
                                      if(n==2) 
                                      {
                                           return 2;
                                      }
                                      return  (stair(n-1)+stair(n-2));
                           }
                            public static void main(String[] args) 
                            {
                                          System.out.print(stair(10));
                            }
}