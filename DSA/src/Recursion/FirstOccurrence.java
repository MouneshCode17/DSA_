package Recursion;

public class FirstOccurrence {
    static int res=0;
    static void printArray(int[] arr,int start,int end,int val){
        if(start>end) return;
        if(arr[start]==val) {
            System.out.println(start);
            start=end;
        }
        start++;
        printArray(arr,start,end,val);

    }
    static void printArrayLast(int[] arr,int start,int end,int val){

        if(start>end)
        {
            System.out.println(res);return;}
        if(arr[start]==val) {
            res=start;
        }
        start++;
        printArrayLast(arr,start,end,val);

    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,4,5};
    //  printArray(arr,0,arr.length-1,5);
        printArrayLast(arr,0, arr.length-1,2);

    }
}