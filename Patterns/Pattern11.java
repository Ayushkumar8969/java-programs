public class Pattern11 {
                          public static void main(String[] args) {
                                   for(int row=1;row<=7;row++)
                                   {
                                           for(int col=1;col<=4;col++)
                                           {
                                                if(col<=row && row<=4)
                                                {
                                                      System.out.print("*");
                                                }
                                                else{
                                                        if(col<=8-row && row>4)
                                                        {
                                                            System.out.print("*");
                                                        }
                                                }
                                           }
                                           System.out.println();
                                   }
                          }
}
