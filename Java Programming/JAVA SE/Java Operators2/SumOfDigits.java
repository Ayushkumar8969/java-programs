public class SumOfDigits {
             public static void main(String[] args) {
                     int n=45689,sum=0;
                       while(n!=0)
                       {
                             sum=sum+n%10;
                             n=n/10;
                       }
                       System.out.println(sum);
             }
}
