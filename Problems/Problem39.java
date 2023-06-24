package Problems;

public class Problem39 {

    static void sumMiddleRowCol(int[][] mat) {
        int n = mat[0].length;
        int mid = (n - 1) / 2;
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("Sum of element of mid col: ");
        for (int i = 0; i < mat.length; i++) {
            int ele = mat[i][mid];
            sum1 += ele;
        }
        System.out.print(sum1);
        System.out.print("\nSum of element of mid row: ");
        for (int j = 0; j < mat.length; j++) {
            int ele = mat[mid][j];
            sum2 += ele;
        }
        System.out.print(sum2);
    }

    public static void main(String arg[]) {
        int matrix[][] = { { 2, 5, 7 },
                { 3, 7, 2 },
                { 5, 6, 9 } };

        sumMiddleRowCol(matrix);

    }

}
