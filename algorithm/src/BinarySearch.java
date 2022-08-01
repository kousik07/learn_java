public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,11,22,33,44,55,66,77,88,98,99};
        int target=97;
        int ans=inarsearch(arr,target);
        System.out.println(ans);


    }
    static int inarsearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target > arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else if(target==arr[mid]){
                return arr[mid];
            }
        }
        return arr[start];


    }
}
