package Problems;

public class Problem34 {
    
    static int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m= mat[0].length;
        int i=0,j=0;
        int idx=0;
        boolean up=true;
        int ans[] = new int[n*m];

        while(i<n && j<m){
            if(up == true){
                while(i>0 && j<m-1){
                    ans[idx++] = mat[i][j];
                    i--;
                    j++;
                }
                 ans[idx++] = mat[i][j];
                 if(j == m-1){
                     i++;
                 }else{
                     j++;
                 }

            }else{
                while(i<n-1 && j>0){
                    ans[idx++] = mat[i][j];
                    i++;
                    j--;
                }
                 ans[idx++] = mat[i][j];
                 if(i == n-1){
                     j++;
                 }else{
                     i++;
                 }

            }
            up = !up;
        }
           return ans;
    }
    public static void main(String[] args)
    {
  
    int a[][] = { {1,2,3},{4,5,6},{7,8,9}};
 
    int res[] =findDiagonalOrder(a);
    
     for (int i = 0; i < res.length; i++)
     {
         System.out.print( res[i] + " ");
       
     }
     
    }
 
}
