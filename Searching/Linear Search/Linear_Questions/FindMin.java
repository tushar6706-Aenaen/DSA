package Linear_Questions;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1,45,8,2,456,78,-9,4,23,7,-2,45,7,1};
        System.out.println(min(arr));

    }

    static  int min(int[] arr){
        int ans = arr[0] ;
        for (int i = 1 ; i < arr.length;i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
