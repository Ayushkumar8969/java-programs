class CheckSorted 
{
                        static boolean arraySortedOrNot(int[] a)
                        {
                                     for(int i=0;i<a.length-1;i++)
                                     {
                                              if(a[i]>a[i+1])
                                              {  
                                                       return false;
                                              }
                                     }
                                       return true;
                        }
                             public static void main(String[] args)
                             {
                                             int[] a={10,25,25,30,80,95};
                                             System.out.print(arraySortedOrNot(a));
                             }
}
