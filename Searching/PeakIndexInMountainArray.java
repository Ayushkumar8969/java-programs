class PeakIndexInMountainArray 
{
                                      static int peakIndexInMountainArray(int[] a)
                                      {
                                                            int start=0;
                                                             int end=a.length-1;

                                                             if(a.length<2)
                                                             {
                                                                   return -1;
                                                             }
                                                             while(start<end)
                                                             {
                                                                         int mid=start + (end-start)/2;
                                                                                 if(a[mid]>a[mid+1])
                                                                                {
                                                                                         end=mid;
                                                                                }
                                                                                else 
                                                                                {
                                                                                        start=mid+1;
                                                                                }
                                                             }
                                                               return start; 
                                      }
                                        public static void main(String[] args)
                                        {
                                                   int[] a={10,15,11,9,8,7,6,5,4};
                                                   System.out.print(peakIndexInMountainArray(a));
                                        }
}