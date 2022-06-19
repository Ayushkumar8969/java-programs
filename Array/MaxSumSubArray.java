class MaxSumSubArray
{
    public static void maxSum(int[] a,int n)
    {
        int max=0,sum=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+a[j];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args)
    {
        int[] a={6,-3,4,-2,1,5,-4};
        int n=a.length;
        maxSum(a,n);
    }
}