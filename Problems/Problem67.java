package Problems;

import java.util.Stack;

public class Problem67 {

    public static String simplifyPath(String path){
          String[] paths = path.split("/");
        Stack<String> st = new Stack<>();
        for(String s:paths){
            if(!s.isEmpty()){
                if(s.equals("..")){
                    if(!st.isEmpty())
                        st.pop();
                }
                else if(s.equals(".")){
                    continue;
                }else{
                    st.push(s);
                }
                    
            }
        }
        String ans ="";
        while(!st.isEmpty()){
            if(st.size() == 1){
                ans = st.pop()+ans;
            }else{
                ans = "/"+st.pop()+ans;
            }
        }
        return "/"+ans;
    }

    public static void main(String[] args){
        String path = "/home//foo/";

        String simplifiedPath = simplifyPath(path);

        System.out.println("Path : "+ simplifiedPath);
    }
    
}
