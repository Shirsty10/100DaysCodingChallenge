package Problems;

public class Problem31 {
    
    static void spiralDisplay(int[][] arr){
        int n=arr.length;
        int m= arr[0].length;
        int totEle = n*m;
        int count=0;

        int minr =0,maxr=n-1,minc=0,maxc=m-1;
        
        while(count<totEle){
            //left wall
            for(int i=minr,j=minc;i<=maxr;i++){
               System.out.print(arr[i][j] + " ");
               count++;
            }
            minc++;
            //bottom
            for(int i=maxr,j=minc;j<=maxc;j++){
                System.out.print(arr[i][j] + " ");
               count++;
            }
            maxr--;
            // right wall
            for(int i=maxr,j=maxc;i>=minr;i--){
                System.out.print(arr[i][j] + " ");
               count++;
            }
            maxc--;
            //top
            for(int i=minr,j=maxc;j>=minc;j--){
                System.out.print(arr[i][j] + " ");
               count++;
            }
            minr++;

        }

    
    }
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
       spiralDisplay(a);
    }
}
