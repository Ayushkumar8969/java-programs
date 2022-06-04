import java.util.Scanner;
class Fib
{
    public static void main(String []args)
    {
        int n,ans;
        Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          ans=fibonaci(n);
          System.out.println("Ans="+ans);
    }
    static int fibonaci(int n)
    {
      int a=-1,b=1,c=0;
      while(n!=0)
      {
          c=a+b;
          a=b;
          b=c;
          n--;  
      }
     return c; 
    }
}