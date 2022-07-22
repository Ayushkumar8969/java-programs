class PalindromeCheck1
{
                                static int palindromeCheck(int[] a,int start,int end) 
                                  {
                                                         if(start>=end)
                                                         {
                                                              return 1;
                                                         }
                                                         else if(a[start]!=a[end]) 
                                                         {
                                                                  return 0;
                                                         }
                                                         else 
                                                         {
                                                                   start++;
                                                                   end--;
                                                                  return(palindromeCheck(a,start,end));
                                                         }
                                  }
                                    public static void main(String[] args) 
                                    {
                                                    int[] a={10,20,30,20,10};
                                                    int n=a.length;
                                                    int start=0,end=n-1;
                                                    int res=palindromeCheck(a,start,end);
                                                       if(res==1) 
                                                       {
                                                              System.out.print("Palindrome");
                                                       }
                                                        else 
                                                        {
                                                              System.out.print("Not a palindrome");
                                                        }
                                                       
                                    }
}