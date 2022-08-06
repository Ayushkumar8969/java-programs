class FindMaxMinValue 
{
                                          static void findMaxMinValue(int[] a)
                                          {
                                                           int max=a[0];
                                                           int min=a[0];
                                                           for(int i=1;i<a.length;i++) 
                                                           {
                                                                        if(a[i]>max) 
                                                                        {
                                                                               max=a[i];
                                                                        }
                                                                        else 
                                                                        {
                                                                                if(a[i]<min) 
                                                                                {
                                                                                        min=a[i];
                                                                                }
                                                                        }
                                                           }
                                                           System.out.println("MIN VALUE:"+min);
                                                           System.out.println("MAX VALUE:"+max);
                                          }
                                             public static void main(String[] args) 
                                             {
                                                              int[] a={12,20,15,60,56,25,16};
                                                              findMaxMinValue(a);
                                             }
}