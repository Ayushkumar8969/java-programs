class DeleteElement
{
                    static int deleteElement(int[] a,int key)
                    {
                                int i,n=a.length;
                               for(i=0;i<a.length;i++)
                               {
                                        if(a[i]==key)
                                        {
                                              break;
                                        }
                               }
                                 if(i==n)
                                 {
                                       return n;  
                                 }
                                   for(int j=i;j<a.length-1;j++)
                                   {
                                           a[j]=a[j+1];
                                   }
                                    return n-1;
                    }
                        public static void main(String[] args)
                        {
                                      int[] a={10,20,30,40,50,60,70,80};
                                      int key=80;
                                      int n=deleteElement(a,key);
                                       for(int i=0;i<n;i++)
                                       {
                                                System.out.print(a[i]+" ");
                                       } 
                        }
}
