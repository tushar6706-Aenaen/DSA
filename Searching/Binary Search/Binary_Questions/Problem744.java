package Binary_Questions;
//Find Smallest Letter Greater Than Target
class Problem744 {
    public static void main(String[] args){
        char[] letters = {'c','e','h','i','j','l'};
        char target = 'l';
        char result = nextGreatestLetter(letters,target);
        if (result == -1){
            System.out.println("error");
        }else{
            System.out.println(result);
        }
    }


    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ;
        int end = letters.length - 1;
        int mid = 0 ;

        while(start <= end){
            mid = start + (end - start) / 2 ;
            if(target >= letters[mid]){
                start= mid + 1 ;
            }else{
                end = mid -1;
            }
        }
        return (char) letters[start % letters.length];


    }
}
