class TransposeMatrix
{
    public static int[][] transposeOfMatrix(int[][] a,int n)
    {
        int[][] temp=new int[4][4];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j]=a[j][i];
            }
        }
        return temp;
    }
    public static void main(String[] args)
    {
        int n=4;
        int[][] a={{1,2,3,4},
                              {4,5,6,7},
                     {8,9,10,11},
                              {12,13,14,15}};
        int[][] mat=transposeOfMatrix(a,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}