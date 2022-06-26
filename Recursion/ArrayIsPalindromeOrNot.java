class ArrayIsPalindromeOrNot
{
                       public static int arrayIsPalindromeOrNot(int[] b,int start,int end)
                       {
                                       int s;
                                         if(start>=end)
                                         {
                                                  return 1;
                                         }
                                         else if(b[start]==b[end])
                                         {
                                                    start++;
                                                    end--;
                                                       s=arrayIsPalindromeOrNot(b,start,end);
                                                            return s;
                                         }
                                         else{
                                                     return 0;
                                         }

                       }
                           public static void main(String[] args)
                           {
                                        int[] a={1,2,5,2,1};
                                        int n=a.length;
                                        int start=0,end=n-1;
                                           int k=arrayIsPalindromeOrNot(a,start,end);
                                              if(k==1)
                                              {
                                                      System.out.print("Palindrome");
                                              }
                                                else
                                                {
                                                       System.out.print("Not a Palindrome");
                                                }
                           }
}