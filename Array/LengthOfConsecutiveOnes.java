class LengthOfConsecutiveOnes
{
          public static int lengthOfConsecutiveOnes(int[] a,int n)
          {
                     int count=0;
                     int max=0;
                     for(int i=0;i<n;i++)
                     {
                           if(a[i]==1)
                           {
                                  count++;
                           }
                            else 
                            {
                                 if(count>max)
                                 {
                                      max=count;
                                 }
                                   count=0;
                            }
                     }
                        if(count>max)
                         {
                               max=count;
                         }
                    return max;
          }
             public static void main(String[] args)
             {
                    int[] a={1,1,1,0,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1};
                    int n=a.length;
                      System.out.print(lengthOfConsecutiveOnes(a,n));
             }
}
