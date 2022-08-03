class CheckArrayIsSortedOrNot1 
{
                                     static boolean checkArrayIsSortedOrNot(int[] a, int index) 
                                     {
                                                      if(index==a.length) 
                                                      {
                                                             return true;
                                                      }
                                                       return (a[index]>=a[index-1] && checkArrayIsSortedOrNot(a,index+1)); 
                                     }
                                     public static void main(String[] args) 
                                     {
                                                     int[] a={10,10,20,20,80,40,50,60,100};
                                                     System.out.print(checkArrayIsSortedOrNot(a,1));
                                     }
}