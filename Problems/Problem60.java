package Problems;
import java.util.Stack;

public class Problem60 {
    
    public static int[] nextGreaterElement(int[] arr){
       int[] ans = new int[arr.length];
      
       Stack<Integer> st = new Stack<>();
       st.push(arr[arr.length-1]);
       ans[arr.length-1] = -1;

       for(int i=arr.length-2; i>=0;i--){
        while(st.size()>0 && arr[i] >= st.peek() ){
            st.pop();
        }
        if(st.isEmpty()){
            ans[i] = -1;
        }else{
            ans[i] = st.peek();
        }
        st.push(arr[i]);
       }

       return ans;
    }

    public static void main(String[] args){
        int[] values = {2,5,9,3,1,12,6,8,7};

        int[] nge = nextGreaterElement(values);

        for(int e : nge){
            System.out.print(e + " ");
        }
    }
   
}
