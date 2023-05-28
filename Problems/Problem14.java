package Problems;
/* SYMBOL       VALUE
  I            1
  V            5
  X            10
  L            50
  C            100
  D            500
  M            1000*/

public class Problem14 {

    static int intVal(char c){
        if(c =='I') return 1;
        else if(c == 'V') return 5;
        else if(c== 'X') return 10;
        else if(c=='L') return 50;
        else if(c == 'C') return 100;
        else if(c=='D') return 500;
        else if(c=='M') return 1000;
        else return -1;
    }

    static int romanToInteger(String s){
        int ans =0;
        for(int i=0;i<s.length();i++){
          int c1 = intVal(s.charAt(i));
          if(i+1 < s.length()){
            int c2 = intVal(s.charAt(i+1));

            if(c1>c2){
                ans+=c1;
            }else{
                ans = ans+ (c2-c1);
                i++;
            }
          }else{
            ans += c1;
          }

        }
        return ans;
    }
    public static void main(String args[])
    {
 
        String str = "MCMIV";
        int value = romanToInteger(str);
        System.out.println("Roman to Integer : "+ value);
    }
    
}
