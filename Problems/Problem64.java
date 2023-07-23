package Problems;

import java.util.Stack;

public class Problem64 {

    public static void celebrityProblem(int[][] arr){
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            st.push(i);
        }

        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();

            if(arr[i][j] ==1){
                 st.push(j);
            }else{
                st.push(i);
            }
        }
        
        int ac=st.pop(); //assumed celebrity

        for(int i=0;i<arr.length;i++){
            if(i!=ac){
                if(arr[i][ac] == 0 || arr[ac][i] == 1){
                    System.out.println("No celebrity Present");
                    return;
                }
            }
        }
        System.out.println("Celebrity is on spot no. " + ac);
    }

    public static void main(String[] args)
    {
         int MATRIX[][] = { { 0, 0, 1, 0 },
        { 0, 0, 1, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 1, 0 } };

        celebrityProblem(MATRIX);
    }
    
}
