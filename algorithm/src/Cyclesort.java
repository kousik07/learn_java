import java.util.Arrays;

public class Cyclesort {
    public static void main(String[] args) {
        int[] kou = {3, 5, 2, 1, 4};
        cyclic(kou);
        System.out.println(Arrays.toString(kou));
    }
    static void cyclic(int [] arr){
        int i=0;
        while(i<arr.length){
            int crrt=arr[i]-1;
            if(arr[i]!=arr[crrt]){
                swap(arr,i,crrt);
            }else{
                i++;
            }

        }
    }
    static void swap(int [] arr,int i,int crrt){
       int tempt=arr[i];
       arr[i]=arr[crrt];
       arr[crrt]=tempt;
    }
}