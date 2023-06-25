package Problems;

public class Problem40 {

    private int[][] multiply(int[][] mat){
        int n= mat.length;
        int [][] res = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j] =0;
                for(int k=0;k<n;k++){
                    res[i][j] += mat[i][k]*mat[k][j];
                }
            }
        }

        return res;

    }

    public boolean isSame(int[][] mat, int n){
        if(mat.length!=mat[0].length)
          return false;

        int res[][] = multiply(mat);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(res[i][j] !=mat[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Problem40 p = new Problem40();
        int mat[][] = {{2, -2, -4},
                       {-1, 3, 4},
                       {1, -2, -3}};
        int n= mat.length;               
        System.out.println("Is Matrix Idempotent " + p.isSame(mat, n));
    }
    
}
