class Majority
{
                  public static int majority(int[] a,int n)
                  {
                              int i,j,temp;
                              // Sorting array
                               for(i=0;i<n-1;i++)
                               {
                                      for(j=0;j<n-1-i;j++)
                                      {
                                               if(a[j]>a[j+1])
                                               {
                                                      temp=a[j];
                                                      a[j]=a[j+1];
                                                      a[j+1]=temp;
                                               } 
                                      }
                               }
                               // Printing Sorted Elements
                               for(i=0;i<n;i++)
                               {
                                      System.out.print(a[i]+" ");
                               }
                               // frequency of majority element
                                 int freq=1;  
                                 for(i=1;i<n;i++)
                                 {
                                         if(a[i]==a[i-1])
                                         {
                                                 freq++;
                                         }
                                          else
                                          {
                                                   if(freq>n/2)
                                                   {
                                                          return 1;
                                                   }
                                                   freq=1;
                                          }
                                 }
                                 if(freq>n/2)
                                 {
                                         return 1;  
                                 }
                                 else{
                                         return -1;
                                 }

                  } 
                      public static void main(String[] args)
                      {
                               int[] a={4,2,4,4,5,4,3,4,5};
                               int n=a.length;
                                 int result=majority(a,n);
                                 if(result==1)
                                 {
                                         System.out.print("Majority");
                                 }
                                 else{
                                        System.out.print("No majority");
                                 }
                      }
}