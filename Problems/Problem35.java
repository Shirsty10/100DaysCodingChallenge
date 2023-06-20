package Problems;

import java.util.HashMap;
import java.util.Map;

public class Problem35 {
    
    static void commonDistinctEle(int[][] mat){
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<mat[0].length;i++){
            mp.putIfAbsent(mat[0][i], 1);
        }

        for(int i=1;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mp.containsKey(mat[i][j]) && mp.get(mat[i][j]) == i){
                    mp.put(mat[i][j], i+1);

                    if(i==mat.length-1){
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }
      
    }
    public static void main(String[] args)
  {
    int matrix[][] = { { 2, 1, 4, 3 },
                      { 1, 2, 3, 2 },
                      { 3, 6, 2, 3 },
                      { 5, 2, 5, 3 } };
 
       commonDistinctEle(matrix);
  }
}
