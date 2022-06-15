import java.util.Scanner;
class MajorityElement
{
    public static int majorityWins(int[] a,int n,int x,int y)
    {
        int count1=0,count2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                count1++;
            }
            else
            {
                if(a[i]==y)
                {
                    count2++;
                }
            }
        } 
        if(count1<=count2)
        {
            if(x<y)
            {
                return x;
            }
            else{
                return y;
            }
        }
        else{
            return x;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=majorityWins(a,n,x,y);
        System.out.println(ans);
    }
}