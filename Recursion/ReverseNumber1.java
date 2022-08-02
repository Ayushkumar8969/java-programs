class ReverseNumber1 
{
                                 static int sum;
                                 static int reverseNumber(int n) 
                                 {
                                                if(n==0) 
                                                {
                                                       return sum;
                                                }
                                                sum=sum*10+n%10;
                                                return reverseNumber(n/10); 
                                 }
                                 public static void main(String[] args) 
                                 {
                                               System.out.print(reverseNumber(2564));
                                 }
}