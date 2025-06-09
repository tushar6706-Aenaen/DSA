package Linear_Questions;

public class Question_0 {
    public static void main(String[] args){
      int[] array =  {1,23,4,56,78,89,56,34,23,45,67,78,789,89,455,34,12};
      int target = 67;

      int ans = LinearSearch(array,target);
      if (ans == 0){
          System.out.println("element is present in  array");

      }else {
          System.out.println("element is not present in array ");
      }

    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0 ; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                System.out.println( i +" "+element);
                return 0;
            }
        }
        return -1;
    }
}
