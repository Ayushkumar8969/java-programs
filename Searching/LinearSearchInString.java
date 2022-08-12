class LinearSearchInString 
{
                                     static boolean linearSearchInString(String str,char target) 
                                     {
                                                           if(str.length()==0) 
                                                           {
                                                                    return false;
                                                           }
                                                            for(int i=0;i<str.length();i++)
                                                            {
                                                                         if(str.charAt(i)==target) 
                                                                         {
                                                                                   return true;
                                                                         }
                                                            }
                                                            return false;
                                     }
                                       public static void main(String[] args) 
                                       {
                                                     System.out.print(linearSearchInString("ayush",'p'));      
                                       }
}