import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[]kou ={5,4,3,2,1};
        select(kou);
        System.out.println(Arrays.toString(kou));
    }
    static void select(int [] arr){
        for(int i=0; i< arr.length;i++){
            int last=arr.length-1-i;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
        }
    }

    static void swap(int[] arr, int max, int last) {
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    static int getmax(int[] arr, int start, int last) {
        int max=start;
        for(int i=0;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
