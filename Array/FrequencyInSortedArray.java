class FrequencyInSortedArray
{
         public static void frequency(int[] a,int n)
         {
            int i,j=0,k=0;
            a[j]=a[0];
              for(i=1;i<n;i++)
              {
                    if(a[j]!=a[i])
                    {
                        System.out.println(a[j]+" "+(i-k));
                        a[j+1]=a[i];
                        j++;
                        k=i;
                    }
              }
                System.out.println(a[j]+" "+(i-k));
         }
            public static void main(String[] args)
            {
                    int[] a={10,10,10,20,20,40,40,40,40,50,50};
                    int n=a.length;
                    frequency(a,n);
            }
}