package Problems;

public class Problem33 {

    static void roatetBy90(int [][] mat){
        //transpose+reverse

        //transpose
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    

        //reverse
        for(int i=0;i<mat.length;i++){
            int hi = 0;
            int lo = mat[i].length-1;
            while(hi<lo){
                int temp = mat[i][hi];
                mat[i][hi] = mat[i][lo];
                mat[i][lo] = temp;

                hi++;
                lo--;

            }
        }
    }
    public static void main(String[] args)
    {
  
    int a[][] = { {1, 2, 3, 4},
                  {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
 
     roatetBy90(a);
     // Print rotated matrix
     for (int i = 0; i < a.length; i++)
     {
         for (int j = 0; j < a[0].length; j++)
         System.out.print( a[i][j] + " ");
         System.out.print("\n");
     }
     
    }
    
}
