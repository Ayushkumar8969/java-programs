class LinearSearch 
{
                                        static int linearSearch(int[] a,int index,int target) 
                                        {
                                                             if(index==a.length) 
                                                             {
                                                                     return -1;
                                                             }
                                                              if(a[index]==target) 
                                                              {
                                                                     return index;
                                                              }
                                                              return linearSearch(a,index+1,target);
                                        }
                                           public static void main(String[] args) 
                                           {
                                                            int[] a={45,65,23,89,15,25,78};
                                                            System.out.print(linearSearch(a,0,10));
                                           }
}