package Sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int count=0;
        int[] arr={8,5,2,1,3}; //28 times n(n-1)/2
        System.out.println(Arrays.toString(arr));
      //  int[] arr={1, 2, 4, 6, 24, 28, 55, 99};
       l1: for(int i=0;i<arr.length;i++){
            int temp=0,n=0;
           //System.out.println("hello");
            for(int j=i+1;j< arr.length;j++){
                count++;
               // System.out.println(arr[i]+" "+arr[j]);
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    n++;
                }
                else if(arr[i]<=arr[j])  continue;

            }
           System.out.println(Arrays.toString(arr));
            if(n==0) break;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
