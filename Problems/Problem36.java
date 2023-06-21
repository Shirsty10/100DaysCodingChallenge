package Problems;

public class Problem36 {
    
    static void shiftRowsByK(int [][] mat,int k){
     
        int n = mat.length;

        if(k>n){
            System.out.println("Invalid Input");
            return;
        }

        for(int i=0;i<mat.length;i++){

            for(int j=k;j<mat[0].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            for(int j=0;j<k;j++){
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();

        }
    }
    public static void main(String args[])
    {
        int [][]mat = new int [][]
                    { {1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16} };
        int k = 2;

           
        // Function call
        shiftRowsByK(mat, k);
    }
}
