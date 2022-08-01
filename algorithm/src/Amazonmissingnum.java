import java.util.Arrays;

public class Amazonmissingnum {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 4};
        System.out.println(cyclic(arr));

    }

    static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int crrt = arr[i];
            {
                if (arr[i] < arr.length && arr[i] != arr[crrt]) {
                    swap(arr, i, crrt);
                } else {
                    i++;
                }
            }
        }
        for(int index=0;index<arr.length;index++){
            if (index != arr[index]){
                return index;
            }
        }return arr.length;
    }
    static void swap(int [] arr,int i,int crrt){
        int tempt=arr[i];
        arr[i]=arr[crrt];
        arr[crrt]=tempt;
    }
}