package Sortings;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //int [] arr={1,8,4,22,17,3,2};
        int[] arr={5,4,1,2};
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
                System.out.println("==>"+Arrays.toString(arr));
            }
            arr[j+1]=temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
