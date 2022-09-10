import java.util.*;
class ArrayListDemo1 
{
                                 static ArrayList<Integer> leaderArray(int[] a,int n) 
                                 {
                                                  ArrayList<Integer> b=new ArrayList<Integer>();
                                                     int largest=Integer.MIN_VALUE;
                                                    for(int i=n-1;i>=0;i--) 
                                                    {
                                                                if(a[i]>=largest)
                                                                {
                                                                         largest=a[i];
                                                                        b.add(largest);
                                                                }
                                                    }
                                                  // Collections.reverse(b);
                                                    reverse(b);
                                                     
                                                     return b;
                                 }
                                    static void reverse(ArrayList<Integer> list)
                                     {
                                                  for(int i=0;i<(list.size())/2;i++)
                                                  {
                                                            Integer temp=list.get(i);
                                                            list.set(i,list.get(list.size()-i-1));
                                                            list.set(list.size()-i-1,temp);          
                                                  }
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