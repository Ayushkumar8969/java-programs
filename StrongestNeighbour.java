import java.util.Scanner;
class StrongestNeighbour
{
    public static void maximumAdjacent(int[] a,int n)
    {
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>=a[j])
            {
                System.out.print(a[i]+" ");
            }
            else{
                System.out.print(a[j]+" ");
            }
            j++;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        maximumAdjacent(a,n);
    }
}
