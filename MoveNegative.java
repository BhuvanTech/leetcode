package Day1_Arrays;

import java.util.*;

class MoveNegative {
    public static void main (String[] args) {
// 		System.out.println("GfG!");
        Scanner sc = new Scanner(System.in);
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int temp=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i] > 0){
                temp=arr[i];
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
