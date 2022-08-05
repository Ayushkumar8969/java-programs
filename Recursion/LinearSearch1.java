class LinearSearch1 
{
                                   static boolean search(int[] a,int index,int target) 
                                   {
                                                  if(index==a.length) 
                                                  {
                                                             return false;
                                                  }
                                                  return (a[index]==target || search(a,index+1,target));
                                   }
                                    public static void main(String[] args) 
                                    {
                                                  int[] a={10,14,56,23,87,50};
                                                  System.out.print(search(a,0,23));
                                    }
}