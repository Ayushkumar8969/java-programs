class RotateArray
{
    public static void rotatearray(int[] a,int n,int d)
    {
        a=swap(a,0,d-1);
        a=swap(a,d,n-1);
        a=swap(a,0,n-1);
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
        int d=2;
        rotatearray(a,n,d);
    }
}