package Sortings;



public class BinarySearch {
    static int mid=0;
    static int binarySearch(int[] arr,int left,int right,int item){
        if(right>=left) {
            mid = (left + right) / 2;
            if (arr[mid] == item) return mid;
            else if (arr[mid] > item) return binarySearch(arr, left, mid - 1, item);
            else return binarySearch(arr, mid + 1, right, item);
        }
else
        return -1;
    }
   public static void main(String[] args) {
       System.out.println(binarySearch(new int[]{2,3,5,7,8,9},0,5,7));
   }
}
