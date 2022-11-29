import java.util.Arrays;
public class SetMismatch {
                    public static int[] cyclicSort(int[] arr)
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
                        public static int[] search(int[] arr)
                        {
                                int[] b={-1,-1};
                                        for(int index=0;index<arr.length;index++)
                                        {
                                                   if(arr[index]!=index+1)
                                                   {
                                                         b[0]=arr[index];
                                                         b[1]=index+1;
                                                   }
                                        }
                                        return b;
                        }
                        public static void main(String[] args) {
                            int[] arr={1,2,2,4};
                            System.out.print(Arrays.toString(cyclicSort(arr)));
                           }   
}
