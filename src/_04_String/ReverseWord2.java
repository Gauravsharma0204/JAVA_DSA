package _04_String;

public class ReverseWord2 {

    public static String reverseWords(String s){
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;

        while(i >= 0){

            // 1. Skip spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            if(i < 0) break;

            // 2. Find end of word
            int j = i;

            // 3. Move to start of word
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            // 4. Append word
            if(res.length() == 0){
                res.append(s.substring(i + 1, j + 1));
            } else {
                res.append(" ").append(s.substring(i + 1, j + 1));
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String input = "  hello   world  java  ";
        System.out.println(reverseWords(input));
    }
}