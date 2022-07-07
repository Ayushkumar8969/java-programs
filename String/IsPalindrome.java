class IsPalindrome
{
                                    public static int isPalindrome(String s)
                                    {
                                                  char[] a=s.toCharArray();
                                                     int n=a.length;
                                                             int start=0,end=n-1;
                                                          while(start<end)
                                                          {
                                                                         if(a[start]!=a[end])
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
                                                          String str="abkkba";
                                                            int res=isPalindrome(str);
                                                               if(res==1)
                                                               {
                                                                        System.out.print("Palindrome");
                                                               }
                                                                 else
                                                                 {
                                                                          System.out.print("Not a Palindrome");
                                                                 }
                                                          
                                        }
}