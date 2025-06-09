package Linear_Questions;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {1,23,56,8,4},
                {56,8,34,5,8},
                {4,67,9,3,5,12,4,5},
                {4,6,89,4,2,5,78,9}
        };
        int target = 78;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

//    find min value
    static int[] Search(int[][] arr, int target){
        for (int row = 0 ; row < arr.length ;row++){
            for (int col = 0 ; col < arr[row].length ;col++){
                if (arr[row][col] == target  ){
                    return new int[]{row,col};
                }
            }
        }

        return new int[] {-1,-1};
    }

//    find max value

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }

}
