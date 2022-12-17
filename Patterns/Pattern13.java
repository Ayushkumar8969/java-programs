public class Pattern13 {
                          public static void main(String[] args) {
                                for(int row=1;row<=10;row++)
                                {
                                    for(int col=1;col<=10;col++)
                                    {
                                           if(col<=6-row || col>=5+row || col<=row-5 || col>=16-row)
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
                                          **********
                                          ****  ****
                                          ***    ***
                                          **      **
                                          *        *
                                          *        *
                                          **      **
                                          ***    ***
                                          ****  ****
                                          **********
                               */
}
