public class Pattern17 {
                         public static void main(String[] args) {
                                 for(int row=1;row<=9;row++)
                                 {
                                       for(int col=1;col<=9;col++)
                                       {
                                           if(col==6-row || col==4+row || col==row-4 || col==14-row)
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
                                    * *   
                                   *   *  
                                  *     * 
                                 *       *
                                  *     * 
                                   *   *  
                                    * *   
                                     * 
                    */  
}
