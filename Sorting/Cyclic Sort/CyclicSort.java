import java.util.Arrays;
class CyclicSort 
{
                       public static void cyclicSort(int[] arr)
                       {
                                          int i=0;
                                          while(i<arr.length)
                                          {
                                                     int value=arr[i];
                                                       if(arr[i]!=arr[value-1])
                                                       {
                                                             swap(arr,i,value-1);
                                                       }  
                                                       else{
                                                              i++;
                                                       }   
                                          }
                       }   
                       public static void swap(int[] arr,int first,int second)
                       {
                                             int temp=arr[first];
                                             arr[first]=arr[second];
                                             arr[second]=temp;
                       }
                       public static void main(String[] args) {
                                      int[] arr={3,5,2,4,1};
                                      cyclicSort(arr);
                                      System.out.print(Arrays.toString(arr));
                       }        
}