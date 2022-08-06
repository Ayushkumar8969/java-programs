// return position of the element
class LinearSearch 
{
                                                        static int linearSearch(int[] a,int target) 
                                                        {
                                                                           if(a.length==0)
                                                                           {
                                                                                 return -1;
                                                                           }
                                                                           for(int index=0;index<a.length;index++)
                                                                           {
                                                                                            if(target==a[index])
                                                                                            {
                                                                                                    return index;
                                                                                            }
                                                                           }
                                                                             return -1;
                                                        }
                                                          public static void main(String[] args) 
                                                          {
                                                                       int[] a={30,60,90,40,50,20,10,70};
                                                                       int target=50;
                                                                       System.out.print(linearSearch(a,target));
                                                          }
}