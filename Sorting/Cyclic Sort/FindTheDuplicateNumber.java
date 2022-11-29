public class FindTheDuplicateNumber
{
             public static int cyclicSort(int[] arr)
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
                       return search(arr);
            }   
            public static void swap(int[] arr,int first,int second)
            {
                                  int temp=arr[first];
                                  arr[first]=arr[second];
                                  arr[second]=temp;
            }
            public static int search(int[] arr)
            {
                            for(int i=0;i<arr.length;i++)
                            {
                                       if(arr[i]!=i+1)
                                       {
                                             return arr[i];
                                       }
                            }
                            return -1;
            }
                     public static void main(String[] args) {
                              int[] arr={3,1,3,4,2};
                           System.out.print(cyclicSort(arr));
                         }
}
