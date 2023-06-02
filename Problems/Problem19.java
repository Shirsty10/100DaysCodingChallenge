package Problems;


public class Problem19 {

    static int myAtoi(String str) {
        if (str == null || str.length() < 1)
        return 0;
        // trim white spaces
        str = str.trim();
        char flag = '+';
        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
        flag = '-';
        i++;
        } else if (str.charAt(0) == '+') {
        i++;
        }
    
        double num = 0;
        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        num = num * 10 + (str.charAt(i) - '0');
        i++;
        }
        if (flag == '-')
          num = -num;
        if ( num <= Integer.MIN_VALUE)
          return Integer.MIN_VALUE;
        if ( num >= Integer.MAX_VALUE)
          return Integer.MAX_VALUE;
  
      return (int) num;
    
    }

    public static void main(String[] args)
    {
        String s = "4193 with words";
        
        // Function Call
        int ans = myAtoi(s);
        System.out.println(ans);
    }
    
    
}
