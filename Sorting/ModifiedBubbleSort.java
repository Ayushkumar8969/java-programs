import java.util.Arrays;
class ModifiedBubbleSort
{
                                      public static int[] modifiedBubbleSort(int[] a,int n)
                                      {
                                                                     for(int i=0;i<n-1;i++)
                                                                     {
                                                                               boolean swapped=false;
                                                                                 for(int j=0;j<n-1-i;j++)
                                                                                 {
                                                                                           if(a[j]>a[j+1])
                                                                                           {
                                                                                                    int temp=a[j];
                                                                                                      a[j]=a[j+1];
                                                                                                      a[j+1]=temp;
                                                                                                    swapped=true;
                                                                                           }
                                                                                 }
                                                                                    if(swapped==false)
                                                                                    {
                                                                                            break;
                                                                                    }
                                                                     }
                                                                       return a;
                                      }
                                      public static void main(String[] args)
                                         {
                                                             int[] a={50,30,40,10,20,15};
                                                             int n=a.length;
                                                            int[] arr= modifiedBubbleSort(a,n);
                                                             System.out.println(Arrays.toString(arr));
                                         }
}