class LinearSearchInRange 
{
                        static int linearSearchInRange(int[] a,int target,int start,int end)
                        {
                                                       if(a.length==0)
                                                       {
                                                               return -1;
                                                       }
                                                        for(int i=start;i<=end;i++) 
                                                        {
                                                                   if(a[i]==target) 
                                                                   {
                                                                         return i;
                                                                   }
                                                        }
                                                        return -1;
                        }
                            public static void main(String[] args) 
                            {
                                                 int[] a={25,15,65,35,75,45};
                                                 System.out.print(linearSearchInRange(a,65,1,4));
                            }
}