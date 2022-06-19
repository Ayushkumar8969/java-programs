class LeaderArray
{
    public static void leader(int[] a)
    {
        int n=a.length;
        int[] b=new int[n];
        int i,j=1,max=n-1; 
        b[0]=a[max];
        for(i=n-2;i>=0;i--)
        {
            if(a[i]>a[max])
            {
                max=i;
                b[j]=a[max];
                j++;
            }
        }
        for(j=j-1;j>=0;j--)
        {
            System.out.print(b[j]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] a={2,7,6,1,4,3};
        leader(a);
    }
}