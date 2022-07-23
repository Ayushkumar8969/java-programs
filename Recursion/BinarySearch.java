class BinarySearch 
{
                                      static int binarySearch(int[] a,int l,int h,int ele) 
                                      {
                                                          int mid=(l+h)/2;
                                                          if(l>h)
                                                          {
                                                              return -1;
                                                          }
                                                                if(ele==a[mid])
                                                                {
                                                                          return mid;
                                                                }
                                                                 else if(ele>a[mid])
                                                                 {
                                                                         l=mid+1;
                                                                         return binarySearch(a,l,h,ele);
                                                                 }
                                                                 else 
                                                                 {
                                                                         h=mid-1;
                                                                         return binarySearch(a,l,h,ele);
                                                                 }
                                      }
                                        public static void main(String[] args) 
                                        {
                                                      int[] a={10,20,30,40,50,60,70,80,90};
                                                      int n=a.length;
                                                      int l=0,h=n-1,ele=70; 
                                                      int res=binarySearch(a,l,h,ele);
                                                        if(res==-1)
                                                        {
                                                               System.out.print("Element not found");
                                                        }
                                                        else 
                                                        {
                                                              System.out.print("Element is found at:"+ res);
                                                        }
                                        }
}