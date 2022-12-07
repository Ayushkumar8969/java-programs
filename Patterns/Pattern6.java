public class Pattern6 {
    public static void main(String[] args) 
    {
                     for(int row=1;row<=4;row++)
                     {
                             for(int col=1;col<=7;col++)
                             {
                                 if(col>=5-row && col<=3+row)
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
                       */
}
