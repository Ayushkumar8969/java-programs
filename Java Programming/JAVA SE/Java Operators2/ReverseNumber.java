public class ReverseNumber {
        public static void main(String[] args) {
                 int n=4567,sum=0;
                    while(n!=0)
                    {
                          sum=sum*10+n%10;
                          n=n/10;
                    }
                    System.out.println(sum);
        }
}
