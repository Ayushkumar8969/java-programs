public class RemoveDuplicates
{
    public static void remove(int[] a)
    {
        int n=a.length;
        int i=0,j=0;
        a[j]=a[i];
        for(i=0;i<n;i++)
        {
            if(a[j]!=a[i])
            {
                a[j+1]=a[i];
                j++;
            }
        }
        for(int k=0;k<=j;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] a={2,2,3,3,4,4,7};
        remove(a);
    }
}