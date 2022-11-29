import java.util.ArrayList;
class FindAllNumbersDisappearedInArray 
{
                                      public static ArrayList<Integer> cyclicSort(int[] arr)
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
                                      public static ArrayList<Integer>  search(int[] arr)
                                      {
                                                  ArrayList<Integer> list=new ArrayList<Integer>();
                                                      for(int i=0;i<arr.length;i++)
                                                      {
                                                                 if(i!=arr[i]-1)
                                                                 {
                                                                       list.add(i+1);
                                                                 }
                                                      }
                                                      return list;
                                      }
                                      public static void main(String[] args) {
                                        int[] arr={4,3,2,7,8,2,3,1};
                                        System.out.print(cyclicSort(arr));
                         }        
}
