package Problems;

public class Problem65 {
    
    public static int trapingRainWater(int[] arr){
        int[] maxleft= new int[arr.length];
        int[] maxRight = new int[arr.length];
        
        maxleft[0] =arr[0];
        for(int i=1;i<arr.length;i++){
            maxleft[i] = Math.max(maxleft[i-1],arr[i]);
        }

        maxRight[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            maxRight[i] = Math.max(maxRight[i+1],arr[i]);
        }

        int totalSum=0;
        for(int i=0;i<arr.length;i++){
           int minWater = Math.min(maxRight[i],maxleft[i]);
           totalSum+=minWater-arr[i];
        }

        return totalSum;
    }
    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
      
  
        System.out.print(trapingRainWater(arr));
    }
}
