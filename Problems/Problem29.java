package Problems;

public class Problem29 {
    public static boolean isFound(int[][] arr,int trg) {
        int i=0;
        int j=arr[0].length-1;

        while(i<arr.length && j>=0){
            if(arr[i][j] <trg){
                 i++;
            }else if(arr[i][j] >trg){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int mat[][] = {{11,12,13},
                      {21,22,23},
                     {31,32,33},
                    {41,42,43,44}};
         
       int trg = 42;
      System.out.println("Element found : " + (isFound(mat,trg)? "Found" : "Not Found"));
    }
}
