package Problems;
// Given two strings s1 and s2, determine if they are isomorphic.
// Input: s = "egg", t = "add"
// Output: true

import java.util.HashMap;

public class Problem16 {

    static boolean  isIsomorphic(String s1, String s2){
        if(s1.length()!=s2.length())
           return false;
         
           HashMap<Character,Character> map1 = new HashMap<>();
           HashMap<Character,Boolean> map2 = new HashMap<>();

           for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1.containsKey(c1)==true){
                if(map1.get(c1) != c2){
                    return false;
                }
            }else{
                if(map2.containsKey(c2) == true){
                    return false;
                }else{
                    map1.put(c1,c2);
                    map2.put(c2,true);

                }
            }
           }
           return true;
    }
    public static void main(String args[])
    {
 
        System.out.println("Is Strings Isomorphic : "+ isIsomorphic("paper","title"));
    }
}
