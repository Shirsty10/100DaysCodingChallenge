package Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem87 {
     public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        if(expression.length() == 0){
            return res;
        }
        
        for(int i=0;i<expression.length();i++){
            char ch = expression.charAt(i);
             if (ch == '+' || ch == '-' || ch == '*') {
            List<Integer> left = diffWaysToCompute(expression.substring(0,i));
            List<Integer> right = diffWaysToCompute(expression.substring(i+1));
            
            for(int l : left){
                for(int r: right){
                    if(ch=='-')
                        res.add(l-r);
                    else if(ch=='*')
                        res.add(l*r);
                    else if(ch=='+')
                        res.add(l+r);
                }
            }
        }
            
    }
        if(res.size()== 0){
            res.add(Integer.parseInt(expression));
        }
       return res; 
    }

    public static void main(String[] args){
        List<Integer> ans = diffWaysToCompute("2*3-4*5");
        System.out.println(ans);
    }
    
}
