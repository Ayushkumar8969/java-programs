class MatrixRotation
{
    public static void transposeOfMatrix(int[][] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int swap=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=swap;
            }
        }
    }
    public static int[][] rotationOfMatrix(int[][] a,int n)
    {
         transposeOfMatrix(a,n);
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n/2;j++)
            {
                int swap=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=swap;
            }
         }
         return a;
    }
    public static void main(String[] args)
    {
        int n=4;
           int[][] mat={{1,2,3,4},
                              {5,6,7,8},
                     {9,10,11,12},
                              {13,14,15,16}};
            int[][] matrix_rotation=new MatrixRotation().rotationOfMatrix(mat,n);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(matrix_rotation[i][j]+" ");
                }
                System.out.println();
            }
    }
}