public class RotateDigit {
           public static void main(String[] args) {
                   int x=78425,count=0;
                   System.out.println(x%10+""+x/10);
                   int n=x;
                   while(n!=0)
                   {
                        count++;
                        n=n/10;
                   }
                   int sum=x%10;
                    while(count!=1) 
                    {
                         sum=sum*10;
                         count--;
                    }
                    sum=sum+x/10;
                    System.out.println(sum);
           }
}
