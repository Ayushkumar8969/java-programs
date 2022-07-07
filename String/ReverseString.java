class ReverseString
{
                                          public static String reverseString(String s)
                                          {
                                                               int i;
                                                               String word="";
                                                                 String sentence="";
                                                                   for(i=0;i<s.length();i++)
                                                                   {
                                                                                 if(s.charAt(i)!=' ')
                                                                                 {
                                                                                          word=word+(s.charAt(i));
                                                                                 }
                                                                                  else
                                                                                  {
                                                                                            sentence=' '+word+sentence;
                                                                                             word="";
                                                                                  }
                                                                   }
                                                                   sentence = word+sentence;  // for last word
                                                        return sentence;                 
                                          }
                                              public static void main(String[] args)
                                              {
                                                                   String s="My Self Ayush Kumar";
                                                                      System.out.print(reverseString(s)); 
                                              }
}