class SecondLargest
{
                        public static int secondLargest(int[] a)
                        {
                                          int largest=0;
                                            int secondLargest=-1;
                                           if(a.length<2)
                                           {
                                                 return -1;
                                           }
                                               for(int i=1;i<a.length;i++)
                                               {
           
                                                              if(a[i]>a[largest])
                                                              {
                                                                     secondLargest=largest;
                                                                      largest=i;
                                                              }
                                                              else
                                                              {
                                                                           if(a[i]<a[largest])
                                                                           {
                                                                                   if(secondLargest==-1 || a[i]>a[secondLargest])
                                                                                   {
                                                                                               secondLargest=i;
                                                                                    }
                                                                            }
                                                               }
                                                 }
                                             return secondLargest;
                             }
                                              public static void main(String[] args)
                                              {
                                                      int[] a={10,15,50,40,20,5};
                                                      int n=a.length;
                                                       //int secondMaxIndex=secondLargest(a);
                                                          System.out.print(a[secondLargest(a)]);
                                               }
}
