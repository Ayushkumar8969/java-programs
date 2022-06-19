public class CheckSortedArray
{
    public static int checkArray(int[] a)
    {
        int n=a.length;
        int j=0,flag=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>=a[j])
            {
                j++;
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args)
    {
        int[] a={15,30,45,60,75};
        int res=checkArray(a);
        if(res==1)
        {
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Unsorted Array");
        }
    }
}
