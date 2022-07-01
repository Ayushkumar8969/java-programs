class MajorityElement1
{
                                 public static int majorityelement(int[] a,int n)
                                 {
                                                      int i,j;
                                                        int count;
                                                         for(i=0;i<n;i++)
                                                         {
                                                                 count=1;
                                                                      for(j=i+1;j<n;j++)
                                                                      {
                                                                              if(a[i]==a[j])
                                                                              {
                                                                                      count++;
                                                                              }      
                                                                      }
                                                                        if(count>n/2)
                                                                        {
                                                                                  return a[i];
                                                                        }
                                                         }
                                                           return -1;
                                 }
                                        public static void main(String[] args)
                                        {
                                                           int[] a={2,4,2,3,3,3,2,3,3};
                                                           int n=a.length;
                                                             System.out.print(majorityelement(a,n));
                                        }
}