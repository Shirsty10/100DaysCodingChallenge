package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Problem22 {
     static List<List<String>> groupAnagrams(String [] strs){
       List<List<String>> ans = new ArrayList<>(); 

       HashMap<String,ArrayList<String>> map = new HashMap<>();

       for(int i=0;i<strs.length;i++){
        char [] carr = strs[i].toCharArray();
        Arrays.sort(carr);
        String st = new String(carr);

        if(map.containsKey(st)){
            map.get(st).add(strs[i]);
        }else{
            ArrayList<String> al = new ArrayList<>();
            al.add(strs[i]);
            map.put(st,al);
        }

       }
   
        ans.addAll(map.values());
       return ans;
     }
     public static void main(String[] args)
     {
         String s[] = {"lump", "eat", "me", "tea", "em", "plum"};
  
      
         System.out.println(groupAnagrams(s));
     }
}
