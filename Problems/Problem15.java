package Problems;

public class Problem15 {
    static String intToRoman(int n){
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] ch = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<val.length;i++){
            while(n>=val[i]){
                n= n-val[i];
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    } 
    public static void main(String args[])
    {
 
        int n = 125;
        String value = intToRoman(n);
        System.out.println("Integer to Roman : "+ value);
    }
}
