public class FirstMissingNumber {
                            public static int cyclicSort(int[] arr)
                            {
                                               int i=0;
                                               while(i<arr.length)
                                               {
                                                          int value=arr[i];
                                                            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[value-1])
                                                            {
                                                                  swap(arr,i,value-1);
                                                            }  
                                                            else{
                                                                   i++;
                                                            }   
                                               }
                                               return search(arr);
                            }   
                            public static void swap(int[] arr,int first,int second)
                            {
                                                  int temp=arr[first];
                                                  arr[first]=arr[second];
                                                  arr[second]=temp;
                            }
                            public static int  search(int[] arr)
                            {
                                            for(int index=0;index<arr.length;index++)
                                            {
                                                       if(arr[index]!=index+1)
                                                       {
                                                             return index+1;
                                                       }
                                            }
                                            return arr.length+1;
                            }
                             public static void main(String[] args) {
                                          int[] arr={1,2,3,4};
                                          System.out.print(cyclicSort(arr));
                           }        
}
