package Binary_Questions;

public class Order_Agnostic {
    public static void main(String[] args) {

//        for  Ascending
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

//        for  Descending
        int[] arr2 = {91, 72, 56, 38, 23, 16, 12, 8, 5, 2};

        int target = 38;
        int result = Agnostic(arr2,target);

        if(result == -1){
            System.out.println("Element is not present in array");
        }else{
            System.out.println("array is present at array index :" + result);
        }
    }
    static int Agnostic(int [] arr, int target){
        int start = 0;
        int  end = arr.length -1;
        boolean Asc = arr[start] < arr[end];

        while(start <= end){

            int mid = start  + (end - start ) / 2 ;

            if (arr[mid] == target){
                return  mid;
            }
            if(Asc){
                if (arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if (arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
