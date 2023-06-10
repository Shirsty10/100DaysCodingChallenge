package Problems;

public class Problem27 {
    public static void onesMinusZeros(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
       int[][] diff = new int[n][m];

      int one =0;
       for(int i=0;i<n;i++){
           one =0;
          for(int j=0;j<m;j++){
              if(grid[i][j] == 1)
                 one++;
          }
          row[i] =one;
       } 
      
       for(int i=0;i<m;i++){
           one =0;
          for(int j=0;j<n;j++){
              if(grid[j][i] == 1)
                 one++;
          }
          col[i] =one;
       }

      
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               diff[i][j] = row[i]+col[j] - ((n-row[i]) + (m-col[j]));
           }
       }

       for(int i=0;i<diff.length;i++){
        for(int j=0;j<diff[0].length;j++){
            System.out.print(diff[i][j] +" , ");
        }
        System.out.println();
       }
      
    }
    public static void main(String[] args)
    {
        int mat[][] = {{0,1,1},
                      {1,0,1},
                     {0,0,1}};
         
        onesMinusZeros(mat);
      
    }
}
