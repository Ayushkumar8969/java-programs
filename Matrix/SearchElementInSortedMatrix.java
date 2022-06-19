class SearchElementInSortedMatrix
{
           public static boolean searchInMatrix(int[][] a,int n,int key)
           {
                   int row=0;
                   int column=n-1;
                   while(row<n && column>=0)
                   {
                          if(key==a[row][column])
                          {
                               return true;
                          }
                          else if(key>a[row][column])
                          {
                                row++;
                          }
                           else{
                                column--;
                           }
                   }
                   return false;
           }
              public static void main(String[] args)
              {
                       int n=4;
                       int key=10;
                       int[][] mat={{1,2,3,4},
                                              {5,6,7,8},
                                     {9,10,11,12},
                                                 {13,14,15,16}};
                         boolean result=searchInMatrix(mat,n,key);
                         System.out.print(result);
              }
}