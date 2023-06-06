package Problems;

public class Problem23 {
    
    static String reverseWords(String s){
        if(s.length()==0)
          return null;

         String sarr[] = s.split(" ");
         StringBuilder sb = new StringBuilder();
         for(int i=sarr.length-1;i>=0;i--){
          sb.append(sarr[i]);
          sb.append(" ");
         }

         return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args)
    {
        String s = "This is Temp String";
 
        // Function Call
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
