class CheckArrayIsSortedOrNot 
{
                                     static boolean checkArrayIsSortedOrNot(int[] a,int i) 
                                     {
                                                      if(i==a.length) 
                                                      {
                                                             return true;
                                                      }
                                                      if(a[i]>=a[i-1]) 
                                                      {
                                                              return checkArrayIsSortedOrNot(a,i+1);
                                                      }
                                                      else 
                                                      {
                                                              return false;
                                                      }
                                     }
                                     public static void main(String[] args) 
                                     {
                                                     int[] a={10,10,20,20,30,40,50,60,100};
                                                     System.out.print(checkArrayIsSortedOrNot(a,1));
                                     }
}