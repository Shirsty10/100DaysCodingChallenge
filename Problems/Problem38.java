package Problems;

public class Problem38 {
     static void squareDiagonalEle(int [][] mat){
        int n= mat[0].length;
        System.out.print("Diagonal one: ");
        for(int i=0;i<mat.length;i++){
            int ele = mat[i][i];
            System.out.print(ele*ele + " ");
        }
        System.out.print("\nDiagonal two: ");
        for(int i=0;i<mat.length;i++){
            int ele = mat[i][n-i-1];
            System.out.print(ele*ele + " ");
        }
     }
     public static void main(String arg[]) {
        int matrix[][] = {{0, 1, 2},
                          {3, 4, 5},
                          {6, 7, 8}};
     
                          squareDiagonalEle(matrix);
  
        
    }
    
}
