package Problems;

public class Problem41 {

    public static int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1,v=1;

        while(top<=bottom || left<=right){
            if(top<=bottom){
                for(int i=top;i<=right;i++)
                  res[top][i] = v++;
                  top++;
            }
            if(left<=right){
                for(int i=top;i<=bottom;i++)
                  res[i][right] = v++;
                  right--;
            }
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                  res[bottom][i] = v++;
                  bottom--;
            }
            if(top<=bottom){
                for(int i=bottom;i>=top;i--)
                  res[i][left] = v++;
                    left++;
            }
           
        }
        return res;
    }
    public static void main(String arg[]) {
        int n=3;
        int matrix[][] = generateMatrix(n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
            }
  
        
    }
    
}
