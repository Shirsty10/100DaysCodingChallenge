package Problems;
// An edit between two strings is one of the following changes. 

// Add a character
// Delete a character
// Change a character

public class Problem25 {
    
    static boolean isOneDistance(String s1,String s2){
       int l1 = s1.length();
       int l2 = s2.length();

       if(Math.abs(l1-l2)>1){
        return false;
       }

       int i=0,j=0,count=0;

       while(i<l1 && j<l2){
         
        if(s1.charAt(i) != s2.charAt(j)){
            if(count == 1) return false;

            if(l1>l2){
               i++;
            }else if(l2>l1){
               j++;
            }else{
                i++;
                j++;

            }
            count++;
        }else{
            i++;
            j++;
        }
       }
       if (i < l1 || j < l2)
       count++;

   return count == 1;
    }
    public static void main (String[] args)
{
    String s1 = "pep";
    String s2 = "peepp";
    if(isOneDistance(s1, s2))
        System.out.print("Yes");
    else
        System.out.print("No");
}

}
