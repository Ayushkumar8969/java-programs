import java.util.Scanner;
class Factorial
{
    static int fact(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        int ans;
        ans=fact(n);
        System.out.println("Factorial="+ans);
    }
}