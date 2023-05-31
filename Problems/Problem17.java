package Problems;

import java.util.HashMap;

public class Problem17 {
    
    static boolean isKAnagram(String s1,String s2,int k){
        if(s1.length()!=s2.length())
           return false;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
          if(map.containsKey(s1.charAt(i)) == true){
             map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
          }else{
             map.put(s1.charAt(i),1);
          }
        }
    

        for(int i=0;i<s2.length();i++){
            if(map.getOrDefault(s2.charAt(i), 0)>0){
                map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
            }
        }
    

        int diff=0;
        for(char ch : map.keySet()){
            diff+= map.get(ch);
        }
    

        if(diff>k){
            return false;
        }else
          return true;
    }
    public static void main(String args[])
    {
        System.out.println("Is Strings K Anangram : "+ isKAnagram("anagram","grammar",3));
    }
}
