public class Pattern24 {
                      public static void main(String[] args) {
                             for(int row=1;row<=7;row++)
                             {
                                     for(int col=1;col<=7;col++)
                                     {
                                             if(col>=row && col<=8-row)
                                             {
                                                   System.out.print(5-row);
                                             }
                                             else if(col>=8-row && col<=row)
                                             {
                                                    System.out.print(row-3);
                                             }
                                             else{
                                                      if(col<4)
                                                      {
                                                          System.out.print(5-col);
                                                      }
                                                      else{
                                                           System.out.print(col-3);
                                                      }
                                             }
                                     }
                                     System.out.println();
                             }
                      }
                        /*
                                            4 4 4 4 4 4 4 
                                            4 3 3 3 3 3 4 
                                            4 3 2 2 2 3 4 
                                            4 3 2 1 2 3 4 
                                            4 3 2 2 2 3 4 
                                            4 3 3 3 3 3 4 
                                            4 4 4 4 4 4 4 
                         */
}
