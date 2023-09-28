package Sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
      //  int [] arr={9,8,4,22,17,3,2};
        int [] arr = {5,2,3,8,1};
        for(int i=0;i<arr.length-1;i++){
            int index=i;
           for(int j=i+1;j<arr.length;j++) {
               if(arr[j]<arr[index]) index=j;

           }
            System.out.println("==>"+Arrays.toString(arr));
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("The Sorted Array is:"+Arrays.toString(arr));
    }
}
