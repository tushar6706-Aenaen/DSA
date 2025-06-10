package Binary_Questions;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 54;
        int result = ceilingQ(arr,target);


        System.out.printf("Ceiling of %d is %d" , target,result);
    }

    static int ceilingQ(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1 ;
        if(target > arr[arr.length-1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return arr[mid] ;
            }
            else if(arr[mid] < target )
            {
                start =mid+1;
            }else{
                end = mid - 1;
            }
        }
        return arr[start] ;
    }
}
