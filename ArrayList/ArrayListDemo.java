import java.util.*; 
class ArrayListDemo 
{
                                          public static void main(String[] args) 
                                          { 
                                                         ArrayList<Integer> b=new ArrayList<Integer>();

                                                               // adding elements in the array
                                                                b.add(50);
                                                                b.add(80);
                                                                b.add(10);
                                                                b.add(25);
                                                                b.add(90);

                                                                // printing the elements 
                                                                System.out.println(b);

                                                                // get elemnets 
                                                                  int ele=b.get(2);
                                                                  System.out.println(ele);
                                                                     System.out.println(b.get(4));

                                                           // adding the elements in between the list
                                                                 b.add(2,60);
                                                                 System.out.println(b);

                                                           // set elements 
                                                                b.set(3,96);
                                                                System.out.println(b);

                                                          // delete element 
                                                                 b.remove(1);
                                                                 System.out.println(b);

                                                          // element is present or not 
                                                             System.out.println(b.contains(25));

                                                             int size=b.size();
                                                             System.out.println(size);

                                                             // loops
                                                             for(int i=0;i<b.size();i++)
                                                             {
                                                                         System.out.print(b.get(i)+" ");
                                                             }
                                                                 System.out.println();
                                                             // for each 
                                                             for(int num: b)
                                                             {
                                                                         System.out.print(num+" ");
                                                             }
                                                             System.out.println();

                                                             // Sorting
                                                             Collections.sort(b);
                                                             System.out.println(b);

                                                             // Reverse the list 
                                                             Collections.reverse(b);
                                                             System.out.print(b);






                                          }
} 