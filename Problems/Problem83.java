package Problems;



public class Problem83 {

    static int idx =0;
    public static String decodeString(String s){
        String res="";
        int count =0;
        while(idx<s.length()){
            char ch = s.charAt(idx);
            if(Character.isLetter(ch)){
              res+=ch;
            }else if(Character.isDigit(ch)){
               count = count*10 + (ch- '0');
            }else if(ch == '['){
                idx++;
                String temp = decodeString(s);

                while(count>0){
                    res+=temp;
                    count--;
                }
            }else{
                break;
            }
            idx++;
        }
        return res;
    }

     public static void main(String[] args){
        String ans = decodeString("3[a]2[bc]");
        System.out.println(ans);
        
    }
    
}
