public class Pattern23 {
      public static void main(String[] args) {
              for(int row=1;row<=9;row++)
              {
                      for(int col=1;col<=10;col++)
                      {
                                if((col<=row || col>=11-row) && row<=5)
                                {
                                      System.out.print("*");
                                }
                                else if((col<=10-row || col>=row+1) && row>5)
                                {
                                    System.out.print("*");
                                }
                                else{
                                     System.out.print(" ");
                                }
                      }
                      System.out.println();
              }
      }
                        /*
                                            *        *
                                            **      **
                                            ***    ***
                                            ****  ****
                                            **********
                                            ****  ****
                                            ***    ***
                                            **      **
                                            *        *
                         */
}
