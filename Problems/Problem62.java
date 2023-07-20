package Problems;

import java.util.Stack;

public class Problem62 {
    
    public static int largestAreaHistogram(int[] arr){

        int[] nsr = new int[arr.length];  //next smaller element to the right
        int[] nsl = new int[arr.length];  //next smaller element to the left

        Stack<Integer> st = new Stack<>();

        st.push(arr.length-1);
        nsr[arr.length-1] = arr.length;
        for(int i=arr.length-2;i>=0;i--){
           while(st.size()>0 && arr[i]<=arr[st.peek()]){
            st.pop();
           }
           if(st.isEmpty()){
            nsr[i] = arr.length;
           }else{
              nsr[i] = st.peek();
           }
           st.push(i);
           

        }

        st=new Stack<>();
        st.push(0);
        nsl[0] =-1;

        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = st.peek();
            }
            st.push(i);
        }

        int maxarea =0;
       for(int i=0;i<arr.length;i++){
        int width = nsr[i]-nsl[i]-1;
        int area = arr[i]*width;

        maxarea = Math.max(area,maxarea);
       }
       return maxarea;
        
    }

    public static void main(String[] args){
        int[] values = {6, 2, 5, 4, 5, 1,6};
       
        int maxArea = largestAreaHistogram(values);

        System.out.println("Largest Area of Histogram is : "+ maxArea);
        

       
    }

}
