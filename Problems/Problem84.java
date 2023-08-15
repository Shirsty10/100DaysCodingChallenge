package Problems;

import java.util.ArrayList;

public class Problem84 {

    public static ArrayList<String> getKeyPadCombinations(String s){
        if(s.length()==0){
          ArrayList<String> bcase = new ArrayList<>();
          bcase.add("");
          return bcase;
        }
        String[] codes = {",!", "abc", "def","ghi","jkl","mnop","qrst","uvw","xyz"};

        char ch = s.charAt(0);
        String rest = s.substring(1);

        ArrayList<String> res = getKeyPadCombinations(rest);
        ArrayList<String> result = new ArrayList<>();

        String code=codes[ch-'0'];

        for( int i=0;i<code.length();i++){
           char c = code.charAt(i);
            for(String ans : res){
                result.add(c+ans);
            }
        }
        
        return result;
    }

    public static void main(String[] args){
        ArrayList<String> ans = getKeyPadCombinations("543");
        System.out.println(ans);
        
    }
    
}
