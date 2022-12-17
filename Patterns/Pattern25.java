public class Pattern25 {
                         public static void main(String[] args) {
                                  pattern25(2);
                         }
                         public static void pattern25(int n)
                         {
                                           for(int row=1;row<=2*n-1;row++)
                                           {
                                                   for(int col=1;col<=2*n-1;col++)
                                                   {
                                                          if(col>=row && col<=2*n-row)
                                                          {
                                                               System.out.print(((n+1)-row) +" ");
                                                          } 
                                                          else if(col>=2*n-row && col<=row)
                                                          {
                                                              System.out.print((row-(n-1)) +" ");
                                                          }
                                                          else{
                                                                    if(col<n)
                                                                    {
                                                                         System.out.print(((n+1)-col) +" ");
                                                                    }
                                                                    else{
                                                                          System.out.print((col-(n-1)) +" ");
                                                                    }
                                                          }
                                                   }
                                                   System.out.println();
                                           }
                         }
            /*
                  n=2            n=3

                  2 2 2         3 3 3 3 3 
                  2 1 2         3 2 2 2 3 
                  2 2 2         3 2 1 2 3 
                                3 2 2 2 3 
                                3 3 3 3 3
            */
}
