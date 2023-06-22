package Problems;

public class Problem37 {
    
    static void swapMajorMinorDiag(int[][] mat){
        
        for(int i=0;i<mat.length;i++){
            int n = mat[0].length;
            int temp = mat[i][i];
            mat[i][i] = mat[i][n-i-1];
            mat[i][n-i-1] = temp;
        }

   
    }
    public static void main(String arg[]) {
        int matrix[][] = {{0, 1, 2},
                          {3, 4, 5},
                          {6, 7, 8}};
     
            swapMajorMinorDiag(matrix);
     
        
        for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++)
            System.out.print(matrix[i][j] + " ");
        System.out.println();
        }
    }
}
