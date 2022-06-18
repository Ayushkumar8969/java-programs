class ThirdLargestElement
{
    public static int element(int [] a,int n)
    {
        int l=0;
        int sl=0;
        int thirdLargest=-1;
        int temp=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[l])
            {
                temp=sl;
                sl=l;
                l=i;
                if(a[sl]>a[temp] && thirdLargest<a[sl])
                {
                    thirdLargest=a[temp];
                }
            }
            else
            {
                if(a[i]<a[l])
                {
                     if(sl==0 || a[sl]<a[i])
                    {
                      temp=sl;
                      sl=i;
                      if(a[sl]>a[temp] && thirdLargest<a[sl])
                      {
                        thirdLargest=a[temp];
                      }
                    }
                    else{
                        if(a[i]<a[sl])
                        {
                           if(a[i]>thirdLargest)
                           {
                              thirdLargest=a[i];
                           }
                        }
                    }
               }
            }
        }
        return thirdLargest;
    }
    public static void main(String[] args)
    {
        int[] a={10,20,50,40,30,15};
        int n=a.length;
        int ans=element(a,n);
        System.out.println(ans);
    }
}