class LeaderElement
{
    public static void element(int[] a)
    {
        int n=a.length;
        int j;
        for(int i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.print(a[i]+" ");
            }
        }   
    }
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50};
        element(a);
    }
}