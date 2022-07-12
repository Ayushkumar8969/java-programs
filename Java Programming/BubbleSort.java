class BubbleSort 
{
                                    void bubbleSort(int[] a,int n)
                                    {
                                                  int i,j,k,temp;
                                                     for(i=0;i<n-1;i++)
                                                     {
                                                                 for(j=0;j<n-1-i;j++)
                                                                 {
                                                                          if(a[j+1]>a[j])
                                                                          {
                                                                                  temp=a[j];
                                                                                  a[j]=a[j+1];
                                                                                  a[j+1]=temp;
                                                                          } 
                                                                 }
                                                                  System.out.println("Pass"+(i+1)+" ");
                                                                    for(k=0;k<n;k++)
                                                                    {
                                                                          System.out.print(a[k]+" ");
                                                                    }
                                                                     System.out.println();
                                                     }
                                                       
                                    }
}
class Test 
{
                                                   public static void main(String[] args)
                                                   {
                                                                   BubbleSort obj=new BubbleSort();
                                                                     int[] a={30,40,20,50,60};
                                                                       int n=a.length;
                                                                       obj.bubbleSort(a,n);
                                                   }
}