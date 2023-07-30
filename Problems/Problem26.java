package Problems;
// Given a matrix of n x n size, the task is to find the saddle point of the matrix. A saddle point
//  is an element of the matrix such that it is the minimum element in its row and the maximum in its column. 
public class Problem26 {
     
    static int saddlePoint(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int leastPoint =0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] < arr[i][leastPoint]){
                    leastPoint = j;

                }
            }
            boolean flag = true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][leastPoint] > arr[i][leastPoint]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
               return arr[i][leastPoint];
                
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int mat[][] = {{1, 2, 3},
                      {4, 5, 6},
                     {7, 8, 9}};
         
        
    System.out.println("Saddle Point : " + saddlePoint(mat));
    }
}
