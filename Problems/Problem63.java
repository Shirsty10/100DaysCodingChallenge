package Problems;

import java.util.Stack;

public class Problem63 {

    public static void slidingWindowMax(int[] arr,int k){
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>= arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = arr.length;
            }else{
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int j=0;
        for(int i=0;i<=arr.length-k;i++){
            if(j<i) j=i;

            while(nge[j]<i+k){
               j=nge[j];
            }
            System.out.print(arr[j] + " ");
        }

        
    }
    public static void main(String[] args ){
        int[] values={1, 2, 3, 1, 4, 5, 2, 3, 6};
        int K = 3;

        slidingWindowMax(values, K);

    }
    
}
