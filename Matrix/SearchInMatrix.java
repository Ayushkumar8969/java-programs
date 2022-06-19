class SearchInMatrix
{
           public static boolean searchElementInMatrix(int[][] a,int n,int key)
           {
                     int row;
                     int column;
                     for(row=0;row<n;row++)
                     {
                            for(column=0;column<n;column++)
                            {
                                   if(key==a[row][column])
                                   {
                                        return true;
                                   }
                            }
                     }
                      return false;
           }
              public static void main(String[] args)
              {
                      int n=4;
                      int key=18;
                       int[][] mat={{1,2,3,4},
                                            {5,6,7,8},
                                     {9,10,11,12},
                                             {13,14,15,16}};
                         System.out.print(searchElementInMatrix(mat,n,key));
              }
}