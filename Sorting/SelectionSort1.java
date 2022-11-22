import java.util.Arrays;
public class SelectionSort1{
                          public static int select(int[] a,int i){
                                            for(int j=i+1;j<a.length;j++)
                                            {
                                                            if(a[j]<a[i])
                                                            {
                                                                   i=j;
                                                            }
                                            }
                                            return i;
                          }  
                          public static void selectionSort(int[] a,int n){
                                      for(int i=0;i<n-1;i++)
                                      {
                                              int min=select(a,i);
                                              int temp=a[i];
                                              a[i]=a[min];
                                              a[min]=temp;
                                      }
                          }    
                          public static void main(String[] args) {
                                          int[] a={30,50,10,20,12};
                                          int n=a.length;
                                          selectionSort(a,n);
                                            System.out.println(Arrays.toString(a));
                          }      
}