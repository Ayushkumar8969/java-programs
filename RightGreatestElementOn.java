class RightGreatestElementOn
{
    public static void rightSideGreatestElement(int[] a,int n)
    {
        int temp; 
        int max=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>max)
            {
                temp=max;
                max=a[i];
                a[i]=temp;
            }
            else
            {
                a[i]=max;
            }
        }
        a[n-1]=0;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
         public static void main(String[] args)
         {
            int[] a={7,5,8,9,6,8,5,7,4,6};
            int n=a.length;
            rightSideGreatestElement(a,n);  
         }
}