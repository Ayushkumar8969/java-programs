public class Pattern9 {
    public static void main(String[] args) 
    {
              for(int row=1;row<=5;row++)
              {
                         boolean flag=true;
                      for(int col=1;col<=9;col++)
                      {
                          if(col>=6-row && col<=4+row && flag)
                          {
                             System.out.print("*");
                             flag=false;
                          }
                          else{
                              System.out.print(" ");
                              flag=true;
                          }
                      }
                      System.out.println();
              }
}
}
