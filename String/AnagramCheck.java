class AnagramCheck
{
                           public static char[] SortingString(char[] a,int n)
                           {
                                              int i,j;
                                              char temp;
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
                                                return a;
                           }
                          public static int isAnagram(String s1,String s2)
                          {
                                           char[] arr1=s1.toCharArray();
                                            int n1=arr1.length;
                                           char[] arr2=s2.toCharArray();
                                              int n2=arr2.length;
                                                   if(n1!=n2)
                                                   {
                                                        return 0;
                                                   }
                                               char[] b1=SortingString(arr1,n1);
                                                char[] b2=SortingString(arr2,n2); 
                                                  int i;
                                                   for(i=0;i<n1;i++)
                                                   {
                                                                if(b1[i]!=b2[i])
                                                                {
                                                                       return 0;
                                                                }
                                                   }            
                                                     return 1;
                          }
                             public static void main(String[] args)
                             {
                                               String s1="silent";
                                                   String s2="listen";
                                                   int res=isAnagram(s1,s2);
                                                      if(res==1)
                                                      {
                                                                System.out.print("Anagram");
                                                      }
                                                        else{
                                                                System.out.print("Not an Anagram");
                                                        }
                             }
}