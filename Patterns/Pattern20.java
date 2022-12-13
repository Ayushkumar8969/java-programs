public class Pattern20 {
                  public static void main(String[] args) {
                         for(int row=1;row<=7;row++)
                         {
                                int x=row;
                                int i=0;
                              for(int col=1;col<=7;col++)
                              {
                                    if(col>=5-row && col<=3+row && row<=4)
                                    {
                                           System.out.print(x);
                                                if(col<4)
                                                {
                                                     x--;
                                                }
                                                else{
                                                    x++;
                                                }
                                    }
                                    else if(col>=row-3 && col<=11-row && row>4)
                                    {
                                               x=8-row-i;
                                               System.out.print(x);
                                               if(col<4)
                                               {
                                                  i++;
                                               }
                                               else{
                                                i--;
                                               }
                                    }
                                    else{
                                    System.out.print(" ");
                                    }
                              }
                              System.out.println();
                         }
                  }
                /* 1   
                  212  
                 32123 
                4321234
                 32123 
                  212  
                   1 
                   */
}
