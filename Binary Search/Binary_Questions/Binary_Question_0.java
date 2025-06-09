package Binary_Questions;

public class Binary_Question_0 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 72;
        int result = BinarySearch(arr,target);

         if(result == -1){
             System.out.println("Element is not present in array");
         }else{
             System.out.println("array is present at array index :" + result);
         }
    }

    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1 ;

        while(start <= end){
          int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid ;
            }
            else if(arr[mid] < target )
            {
                start =mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1 ;
    }
}
