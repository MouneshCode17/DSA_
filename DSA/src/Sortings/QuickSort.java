package Sortings;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int swapIndex=low-1;
        for (int i = low; i < high; i++) {
            if(arr[i]<pivot){
                swapIndex++;
                int temp=arr[swapIndex];
                arr[swapIndex]=arr[i];
                arr[i]=temp;
            }
        }
        swapIndex++;
        int temp=arr[swapIndex];
        arr[swapIndex]=pivot;
        arr[high]=temp;
        System.out.println(Arrays.toString(arr));
        return swapIndex;
    }
    public static void quickSort( int[] arr,int low,int high){
      if(low<high){
          int pidix=partition(arr,low,high);
       quickSort(arr,low,pidix-1);
       quickSort(arr,pidix+1,high);
      }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{6,3,9,5,2,8};
        quickSort( arr ,0, arr.length-1 );
        System.out.println(Arrays.toString(arr));
    }
}
