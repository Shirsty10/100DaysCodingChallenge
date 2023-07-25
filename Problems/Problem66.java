package Problems;

import java.util.Stack;

public class Problem66 {
    public static int eval(String op, int a,int b){
        if(op.equals("+")) return a+b;
        else if(op.equals("-")) return a-b;
        else if(op.equals( "*")) return a*b;
        else if(op.equals("/")) return a/b;
        return -1;
    }

    public static int reversePolishAnnotation(String[] tokens){
            Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("*") ||s.equals("+") || s.equals("-") || s.equals("/")){
                int op1 = st.pop();
                int op2 = st.pop();
                st.push(eval(s,op2,op1));
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }

    public static void main(String[] args){
        String[] tokens={"2","1","+","3","*"};

        int value = reversePolishAnnotation(tokens);
        System.out.println(value);
    }
    
}
