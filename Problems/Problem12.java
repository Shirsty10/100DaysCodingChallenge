package Problems;
// Given a string, the task is to reverse the order of the words in the given string. 
// Input: s = “i love programming very much” 
// Output: s = “much very programming love i” 

public class Problem12 {
    
    static String reverseWords(String s){
        String[] str = s.split(" ");
        String ans ="";
        for(int i= str.length-1;i>=0;i--){
            ans+= str[i] + " ";
        }

        return ans.substring(0, ans.length()-1);
    }

    public static void main(String[] args)
  {
    String s = "i like this program very much";
 
    // Function call
    String p = reverseWords(s);
    System.out.println(p);
  }
}
