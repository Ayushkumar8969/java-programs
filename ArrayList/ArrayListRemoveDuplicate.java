import java.util.*;
class ArrayListRemoveDuplicate 
{
                                static ArrayList<Integer> remove(int[] a,int n)
                                 {
                                                       ArrayList<Integer> b=new ArrayList<Integer>();
                                                          int j=0;
                                                               b.add(a[0]);
                                                             for(int i=1;i<n;i++)
                                                             {
                                                                       if(b.get(j)!=a[i])
                                                                       {
                                                                                j++;
                                                                                b.add(a[i]);
                                                                       }
                                                             }
                                                             return b;
                                 }
                                     public static void main(String[] args) 
                                     {
                                                       int[] a={10,10,10,20,20,40,50,50};
                                                         int n=a.length;
                                                          ArrayList<Integer> arr=remove(a,n);
                                                          System.out.print(arr);
                                     }
}