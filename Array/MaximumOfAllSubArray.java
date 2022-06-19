class MaximumOfAllSubArray
{
    public static void maxElement(int[] a,int size,int k)
    {
        int max=0,i=0,j=0;
        while(j<size)
        {
            if(j-i+1<k)
            {
                if(a[j]>max)
                {
                    max=a[j];
                }
                j++;
            }
            else
            {
                if(j-i+1==k)
                {
                    if(a[j]>max)
                    {
                        max=a[j];
                    }
                    else{
                        if()
                        {
                        
                        }
                    }
                    System.out.print(max+" ");
                    j++;
                    i++;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] a={10,3,4,5,6,4,3,2,9};
        int n=a.length;
        int k=3;
        maxElement(a,n,k);
    }
}