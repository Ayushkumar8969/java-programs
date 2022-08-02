class PalindromeNumber 
{
                                                 static int sum;            // by default static variable sum is intialized with 0
                                 static int reverseNumber(int n) 
                                 {
                                                if(n==0) 
                                                {
                                                       return sum;
                                                }
                                                sum=sum*10+n%10;
                                                return reverseNumber(n/10); 
                                 }
                                 static boolean palindrome(int n)
                                 {
                                               return (n==reverseNumber(n));
                                 }
                                 
                                 public static void main(String[] args) 
                                 {
                                               System.out.print(palindrome(123321));
                                 }
}