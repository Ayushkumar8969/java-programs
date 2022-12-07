public class Pattern18 {
                     public static void main(String[] args) {
                         for(int row=1;row<=7;row++)
                         {
                               for(int col=1;col<=7;col++)
                               {
                                    if(col>=5-row && col<=3+row && row<=4)
                                    {
                                         System.out.print("*");
                                    }
                                    else if(col>=row-3 && col<=11-row && row>4)
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
                                               *   
                                              ***  
                                             ***** 
                                            *******
                                             ***** 
                                              ***  
                                               *
                                     */
}
