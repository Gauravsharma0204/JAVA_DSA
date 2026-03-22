package _04_String;

public class ReverseWords {

    public static String reverseWords(String s){
        String arr[] = s.split(" ");
        String res = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i].length() == 0){
                continue;
            }

            if(res.length() == 0){
                res = arr[i];
            } else {
                res = res + " " + arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String input = "  hello   world  java  ";
        System.out.println(reverseWords(input));
    }
}