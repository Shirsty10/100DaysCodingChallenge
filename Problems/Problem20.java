package Problems;
// Input: Str = “aabbcc”, k = 1
// Output: 2
// Explanation: Max substring can be any one from {“aa” , “bb” , “cc”}.

import java.util.HashMap;

public class Problem20 {
     static int kLongestUniqueCharacter(String s, int k){
        int ans =-1;
        int i=-1;
        int j=-1;

        HashMap<Character,Integer> map = new HashMap<>();

        while(true){
            boolean flag1 = false;
            boolean flag2 = false;

            while(i<s.length()-1){
                flag1=true;
                i++;
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch, 0)+1);

                if(map.size()<=k){
                    int len = i-j;
                    if(len>ans) 
                      ans = len;
                }else{
                    break;
                }
            }

            while(j<i){
                flag2 = true;
                j++;
                char ch = s.charAt(j);
                if(map.get(ch) ==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }

                if(map.size()> k){
                    continue;
                }else{
                    int len = i-j;
                    if(len>ans) 
                      ans = len;
                      break;
                }
            }
            if (flag1 == false && flag2 == false)
                break;
        }
        return ans;
     }

     public static void main(String[] args)
     {
         String s = "aabacbebebe";
         int k = 3;
  
         // Function Call
         int ans = kLongestUniqueCharacter(s, k);
         System.out.println(ans);
     }
}
