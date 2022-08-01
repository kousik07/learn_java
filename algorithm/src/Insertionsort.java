import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int [] kou={5,4,3,2,1};
        insetion(kou);
        System.out.println(Arrays.toString(kou));
    }
    static void insetion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }

        }
    }
    static void swap(int[] arr, int max, int last) {
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
