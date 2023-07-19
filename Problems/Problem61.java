package Problems;

import java.util.Stack;

public class Problem61 {

    public static int[] stockSpanProblem(int[] arr){
        Stack<Integer> st = new Stack<>();

        st.push(0);

        int span[] = new int[arr.length];
        span[0] =1;
        for(int i=1;i<arr.length;i++){

            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }else{
                span[i]= i-st.peek();
            }
            st.push(i);
        }
        return span;

    }
    public static void main(String[] args){
        int[] values = {10, 4, 5, 90, 120, 80};

        int[] nge = stockSpanProblem(values);

        for(int e : nge){
            System.out.print(e + " ");
        }
    }
    
}
