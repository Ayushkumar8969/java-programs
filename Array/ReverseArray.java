public class ReverseArray
{
    public static void reverse(int[] a)
    {
        int n=a.length;
        int i=0,j=n-1,temp;
        while(i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50};
        reverse(a);
    }
}
