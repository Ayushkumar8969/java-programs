import java.util.Arrays;
class BubbleSort
{
                                      public static int[] bubbleSort(int[] a,int n)
                                      {
                                                             for(int i=0;i<n-1;i++)
                                                             {
                                                                        for(int j=0;j<n-1-i;j++)
                                                                        {
                                                                                 if(a[j]>a[j+1])
                                                                                 {
                                                                                       int temp=a[j];
                                                                                       a[j]=a[j+1];
                                                                                       a[j+1]=temp; 
                                                                                 }
                                                                        }
                                                             }
                                                                       return a;
                                      }
                                      public static void main(String[] args)
                                         {
                                                             int[] a={25,65,32,41,5,10};
                                                             int n=a.length;
                                                            int[] arr= bubbleSort(a,n);
                                                            System.out.println(Arrays.toString(arr));
                                         }
}