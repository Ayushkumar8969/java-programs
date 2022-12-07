public class Pattern14 {
                        public static void main(String[] args) {
                                   for(int row=1;row<=5;row++)
                                   {
                                         for(int col=1;col<=9;col++)
                                         {
                                               if(col==6-row || col==4+row)
                                               {
                                                   System.out.print("*");
                                               }
                                               else if(row==5)
                                               {
                                                     System.out.print("*");
                                               }
                                               else {
                                                  System.out.print(" ");
                                               }
                                         }
                                         System.out.println();
                                   }
                        }
                        /*
                                             *    
                                            * *   
                                           *   *  
                                          *     * 
                                         *********
                         */
}
