package Problems;

public class Problem32 {

    public static int[] FindExitPoint(int[][] matrix) {
        int dir = 0;
        int i = 0, j = 0;
        int ans[] = new int[2];

        while (true) {
            dir = (dir + matrix[i][j]) % 4;
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;
            }

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == matrix.length) {
                i--;
                break;
            } else if (j == matrix[0].length) {
                j--;
                break;
            }
        }
        ans[0] = i;
        ans[1] = j;
        return ans;
    }
    public static void main(String[] args)
    {
        int a[][] = {{0, 1, 0},
        {0, 1, 1}, {0, 0, 0}};
 
       int result[] = FindExitPoint(a);
       System.out.println("Exit point is : "+ result[0] + "," + result[1]);
    }

}
