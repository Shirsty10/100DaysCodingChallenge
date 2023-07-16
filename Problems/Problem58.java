package Problems;

import java.util.Stack;

public class Problem58 {
    
    public boolean duplicateBrackets(String exp){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch==')'){
                if( st.peek() == '('){
                    return true;
                }else{
                    while(st.peek() == '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Problem58 stack = new Problem58();
 
        //String exp = "[()]{}{[()()]()}";
        String exp = "(((a+(b))+(c+d)))";
        
        boolean isValid = stack.duplicateBrackets(exp);
 
        System.out.println("Duplicate Found : " + isValid);
 
     }

   
}
