public class Pattern12 {
                        public static void main(String[] args) {
                                for(int row=1;row<=9;row++)
                                {
                                      boolean flag=true;
                                        for(int col=1;col<=9;col++)
                                        {
                                              if(col>=row && col<=10-row && flag)
                                              {
                                                   System.out.print("*");
                                                   flag=false;
                                              }
                                              else if(col>=10-row && col<=row && flag)
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
