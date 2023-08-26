package Problems;

public class Problem90 {

    public static void solution(String str, String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<str.length();i++){
            String pre = str.substring(0, i+1);
            String ros = str.substring(i+1);

            if(isPalindromic(pre)){
                solution(ros, asf+"(" + pre + ")");
            }
        }
    }
    
    public static boolean isPalindromic(String s){
        int li =0;
        int ri=s.length()-1;

        while(li<ri){
            char left = s.charAt(li);
            char right = s.charAt(ri);

            if(left !=right){
                return false;
            }

            li++;
            ri--;
        }
        return true;

    }

    public static void main(String[] args){
        solution("aab", "");
    }
}
