package Problems;

import java.util.Arrays;
import java.util.Stack;

class Pair implements Comparable<Pair>{

    int st;
    int et;

    Pair(int st,int et){
        this.st=st;
        this.et=et;

    }

    @Override
    public int compareTo(Pair o) {
        if(this.st != o.st){
            return this.st-o.st;
        }else{
            return this.et-o.et;
        }
        
    }

}

public class Problem59 {
    
    public static void mergeIntervals(int[][] arr){
        Pair[] pairs = new Pair[arr.length];

        for(int i=0;i<arr.length;i++){
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(pairs[i].st + " " + pairs[i].et);
        // }

        Stack<Pair> st = new Stack<>();


        for(int i=0;i<pairs.length;i++){
            if(i==0){
                st.push(pairs[i]);

            }else{
                Pair p = st.peek();

                if (p.et > pairs[i].st) {
                    p.et = Math.max(p.et, pairs[i].et);
                } else {
                    st.push(pairs[i]);
                }
         }
        }

        Stack<Pair> res = new Stack<>();

        while(st.size()>0){
            res.push(st.pop());
        }

        while(!res.isEmpty()){
            Pair ans = res.pop();
            System.out.println(ans.st + " " + ans.et);
        }
    }
     
    public static void main(String args[]) {
        int arr[][]={{6,8},{1,9},{2,4},{4,7}};
        // arr[0]=new Interval(6,8);
        // arr[1]=new Interval(1,9);
        // arr[2]=new Interval(2,4);
        // arr[3]=new Interval(4,7);
        // mergeIntervals(arr);
      
        mergeIntervals(arr);
    }
    
}
