package Recursion;

public class MaxOfArray {
    static int max=0;
    static void printMax(int[] arr,int start,int end){
        if(start>end) {
            System.out.println(max);
            return;
        }
        if(max<arr[start]){
            max=arr[start];
        }
        printMax(arr,++start,end);
    }
    public static void main(String[] args) {
        int[] arr={8,6,9,1,2};
        printMax(arr,0, arr.length-1);
    }
}
