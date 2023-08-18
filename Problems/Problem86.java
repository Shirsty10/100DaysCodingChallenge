package Problems;

public class Problem86 {

    public static int lastRemaining(int n) {
        return (n == 1) ? 1 : (n / 2 - lastRemaining(n / 2) + 1) * 2;
    }

    public static void main(String[] args){
        System.out.println(lastRemaining(9));
    }
    
}
