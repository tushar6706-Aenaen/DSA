package Linear_Questions;

public class SearchInRange_Q2 {
    public static void main(String[] args){
        int[] array =  {1,23,4,56,78,89,56,34,23,45,67,78,789,89,455,34,12};
        int target = 67;

        int ans = LinearSearch(array,target,5,12);
        if (ans == 0){
            System.out.println("element is present in  array");

        }else {
            System.out.println("element is not present in array ");
        }

    }

    static int LinearSearch(int[] arr, int target,int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i =start ; i < end ; i++){
            int element = arr[i];
            if(element == target){
                System.out.println("index : " + i + " , Element : "+element);
                return 0;
            }
        }
        return -1;
    }
}
