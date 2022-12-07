public class Pattern8 {
           public static void main(String[] args) 
            {
                     for(int row=1;row<=4;row++)
                     {
                            int x=1;
                             for(int col=1;col<=7;col++)
                             {
                                 if(col>=5-row && col<=3+row)
                                 {
                                    System.out.print(x);
                                         if(col<4)
                                         {
                                            x++;
                                         }
                                         else{
                                            x--;
                                         }
                                 }
                                 else{
                                     System.out.print(" ");
                                 }
                             }
                             System.out.println();
                     }
            }
            /*
                             1   
                            121  
                           12321 
                          1234321
             */
}
