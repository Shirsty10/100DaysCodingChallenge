package Problems;
//Problem 1. Find a peak element which is not smaller than its neighbors
// Input: array[] = {10, 20, 15, 2, 23, 90, 67}
// Output: 20 or 90
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
class Problems{

static int peakNotSmallerThanNeighbor (int a[]) {
    int n = a.length;
    if(n==0){
       System.out.println("Array is empty");
       return 0;
    }else if(n==1){
        return a[0];
    }
    
    //check if first element is peak element or not
    if(a[0]>a[1]){
        return a[0];
    }

    //check if last element is peak element or not
    if(a[n-1]>a[n-2]){
        return a[n-1];
    }

    for(int i=1;i<n-1;i++){
        if(a[i-1]<a[i] && a[i+1]<a[i]){
            return a[i];
        }
    }

    return 0;
}

public static void main(String[] args){
    int array[] = {10, 20, 15, 2, 23, 90, 67};
    int value = peakNotSmallerThanNeighbor(array);
    System.out.println("Peak element is " + value);

}
}
