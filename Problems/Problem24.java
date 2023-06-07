package Problems;

public class Problem24 {

        public static boolean isNumber(String s) {
            boolean digit =false, ise=false,isDot=false;
            int countMP = 0;
    
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                
                //digit
                if(Character.isDigit(ch)){
                    digit = true;
                }
                //+/-
                else if(ch == '+' || ch=='-'){
                    if(countMP == 2){
                        return false;
                    }
                    if(i>0 && (s.charAt(i-1) !='e' && s.charAt(i-1) != 'E')){
                        return false;
                    }
                    if(i == s.length()-1){
                        return false;
                    }
                    countMP++;
                }
                //dot
                else if(ch == '.'){
                    if(ise || isDot)
                      return false;
                    if (i==s.length()-1 && !digit)
                       return false;
                   
                     isDot =true;
                }
                //e/E
                else if(ch == 'e' || ch=='E'){
                    if(ise || !digit || i== s.length()-1){
                        return false;
                    }
                      ise = true;
                }else{
                    return false;
                }
              
            }
            return true;
        }
    
        public static void main(String[] args)
    {
        String s = "-123.456e789";
 
        // Function Call
        System.out.println(isNumber(s));
    }
}
