import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] kou={5,4,3,2,1};
        sort(kou);
        System.out.println(Arrays.toString(kou));
    }
    static void sort(int[] arr){
        boolean sw;
        for(int i=0;i<arr.length;i++){
            sw=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        sw=true;

                }
            }
            if(!sw){
                break;
        }

        }
    }

}
