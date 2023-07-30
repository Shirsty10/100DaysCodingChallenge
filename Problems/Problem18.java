package Problems;

// Input : aabcdaabc
// Output : 4
// The string "aabc" is the longest
// prefix which is also suffix.

public class Problem18 {
    
    static int prefixAndSuffix(String s){
        if(s.length()<2)
          return 0;
          
          int n= s.length();
          int count =0;
          int idx = (n+1)/2;

          while(idx<n){
            if(s.charAt(idx)!=s.charAt(count)){
                count = 0;
                idx = idx-count+1;
            }else{
                count++;
                idx++;
            }
          }
          return count;
    }
    public static void main (String[] args)
    {
      String s = "abcaabc";
      System.out.println(prefixAndSuffix(s));
    }
}
