package Problems;

public class Problem21 {
    public static int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int len=s.length();
         if(len==0){
             return 0;
         }else if(len==1){
             return 1;
         }
        String maxlen="";
         String temp="";
        while(i<len && j<len){
            char ch1=s.charAt(j);
            if(temp.indexOf(ch1)<=-1){
                temp+=ch1;
               j++;
               
            }else{
                if(temp.length()>maxlen.length()){
                    maxlen = temp;
                    
                }
               i++;
               j = i;
                temp="";
                
            }
            
           
        }
         if(temp.length()>maxlen.length()){
                    maxlen = temp;
                    
                }
          //System.out.println(maxlen);
        return maxlen.length();
    }
    public static void main(String[] args)
{
    String str = "abcabcbb";
    System.out.println("The input string is " + str);
 
    int len = lengthOfLongestSubstring(str);
     
    System.out.println("The length of the longest " +
                       "non-repeating character " +
                       "substring is " + len);
}
}
