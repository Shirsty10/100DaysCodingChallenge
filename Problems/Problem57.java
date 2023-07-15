package Problems;

import java.util.Stack;
public class Problem57 {

    public boolean isValidaParenthesis(String exp){
        boolean isValid = true;
        Stack<Character> st = new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(isOpening(ch)){
                st.push(ch);
            }else {
                if(st.isEmpty()){
                    isValid = false;
                    return isValid;
                }else{
                    if((ch==')' && st.peek() != '(') || (ch=='}' && st.peek() != '{') || (ch==']' && st.peek() != '[')){
                        isValid = false;
                        return isValid;
                    }else{
                        st.pop();
                    }
                }
            }
        }
    

        if(st.isEmpty()){
            return true;
        }else{
          return isValid;
        }
        
    }

    boolean isOpening(char ch){
        return ch == '(' || ch == '{' || ch == '[';
    }
    
    public static void main(String[] args) {

       Problem57 stack = new Problem57();

       //String exp = "[()]{}{[()()]()}";
       String exp = "[(])";
       
       boolean isValid = stack.isValidaParenthesis(exp);

       System.out.println("Is Parenthesis valid : " + isValid);

    }
   
    
}
