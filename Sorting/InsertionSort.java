import java.net.SocketPermission;
import java.util.Arrays;
class InsertionSort{
                  public static void insertionSort(int[] a,int n)
                  {
                           for(int i=0;i<n-1;i++){
                                       for(int j=i+1;j>0;j--)
                                       {
                                            if(a[j]<a[j-1])
                                            {
                                                   int temp=a[j-1];
                                                   a[j-1]=a[j];
                                                   a[j]=temp;
                                            }
                                            else {
                                                   break;
                                            }
                                       }
                           }
                  }  
                  public static void main(String[] args) {
                               int[] arr={50,40,20,30,10};
                               int n=arr.length;
                               insertionSort(arr,n);
                               System.out.println(Arrays.toString(arr));
                  }    
}