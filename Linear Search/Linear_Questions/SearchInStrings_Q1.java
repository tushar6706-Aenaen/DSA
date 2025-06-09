package Linear_Questions;

import java.util.Arrays;

public class SearchInStrings_Q1 {
    public static void main(String[] args) {
            String str= "Tushar";
            char target = 'a';
        System.out.println(search(str,target));

    }

    static boolean search2(String str,char target){

        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false ;
    }

    static boolean search(String str,char target){

        if(str.length() == 0){
            return false;
        }

        for (int i = 0 ; i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false ;
    }
}
