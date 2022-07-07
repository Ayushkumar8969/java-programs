class Palindrome1
{
                                        public static int checkPalindrome(String s)
                                        {
                                                                   int n=s.length();
                                                                  int start=0,end=n-1;
                                                                     while(start<end)
                                                                     {
                                                                                 if(s.charAt(start)!=s.charAt(end))
                                                                                 {
                                                                                            return 0;
                                                                                 }
                                                                                   start++;
                                                                                      end--;
                                                                     }
                                                                        return 1;
                                        }
                                            public static void main(String[] args)
                                            {
                                                                       int res=checkPalindrome("abba");
                                                                          if(res==1)
                                                                          {
                                                                                     System.out.print("Palindrome");
                                                                          }
                                                                            else
                                                                            {
                                                                                        System.out.print("Not a Plaindrome");
                                                                            }
                                            }
}