class MissingNumber
{
                                    public static int missingNumber(int[] arr)
                                    {
                                                     int i=0;
                                                     while(i<arr.length)
                                                     {
                                                                     int value=arr[i];
                                                                   if(arr[i]<arr.length && i!=value)
                                                                   {
                                                                             swap(arr,i,value);     
                                                                   }
                                                                   else {
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
                                                   int n=arr.length;
                                                  for(int i=0;i<n;i++)
                                                  {
                                                              if(i!=arr[i])
                                                              {
                                                                   return i;
                                                              }
                                                  }
                                                  return n;
                                    }
                                    public static void main(String[] args) {
                                             int[] arr={4,0,2,3};
                                             System.out.println(missingNumber(arr));
                                    }

}
