import java.util.Scanner;
class InsertElementAtEnd
{
    public static void insertAtEnd(int[] a,int n)
    {
        int len=0,i;
        int k=98;
       for(i=0;i<a.length;i++)
        len=i;
        if(len<n)
        {
            a[len]=k;
        }
        else{
            System.out.println("Array is Full");
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int n=6;
        int[] a={10,20,30,40,50};
        insertAtEnd(a,n);
    }
}