import java.util.*;
class ArrayListDemo2 
{
                               static ArrayList<Integer> leaderArray(int[] a,int n) 
                               {
                                                 ArrayList<Integer> b=new ArrayList<Integer>();
                                                   int j=0;
                                                     b.add(a[n-1]);
                                                    for(int i=n-2;i>=0;i--) 
                                                     {
                                                                  if(a[i]>=b.get(j))
                                                                  {
                                                                            j++;
                                                                            b.add(a[i]);
                                                                  }
                                                     }
                                                     Collections.reverse(b);
                                                     return b;
                               }
                                public static void main(String[] args) 
                                     {
                                               int[] a={2,7,6,1,4,3};
                                               int n=a.length;
                                                 ArrayList<Integer> arr=leaderArray(a,n);
                                                     for(int num :arr) 
                                                     {
                                                            System.out.print(num+" ");
                                                     }
                                                     //System.out.print(arr);
                                     }
}