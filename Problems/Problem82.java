package Problems;

import java.util.ArrayList;

public class Problem82 {
    
    public static ArrayList<String> getSubSequence(String str){
        if(str.length() ==0){
            ArrayList<String> bc = new ArrayList<>();
            bc.add("");
            return bc ;
        }

        char ch = str.charAt(0);
        String restString = str.substring(1);

        ArrayList<String> res = getSubSequence(restString);

        ArrayList<String> ans = new ArrayList<>();

        for(String s : res){
           ans.add("" + s);
           ans.add(ch+s);
        }

        return ans;
    }

    public static void main(String[] args){
        ArrayList<String> ans = getSubSequence("abc");

         ans.stream().forEach(s-> System.out.println(s));
        
    }
}
