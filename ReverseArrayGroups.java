class ReverseArrayGroups
{
    public static void reverseInGroups(int[] a,int n,int k)
    {
        a=swap(a,0,k-1);
        a=swap(a,k,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    public static int[] swap(int[] b,int start,int end)
    { 
        int temp;
         while(start<=end)
        {
            temp=b[start];
            b[start]=b[end];
            b[end]=temp;
            start++;
            end--;
        }
        return b;
    }
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        int n=a.length;
        int k=3;
        reverseInGroups(a,n,k);
    }
}