package _04_String;

public class ReverseString {

    void main(){
        String str = "GAURAV";
//        reverseString(str);
        reverseString2(str);

    }


//    1ST METHOD
    static void reverseString(String input){
        String ans = "";
        for (int i = 0; i < input.length(); i++) {
            ans = input.charAt(i) + ans;
        }
        System.out.println(ans);
    }


//    2ND METHOD
    static void reverseString2(String input){
        StringBuilder ans = new StringBuilder(input);
        int n = ans.length();

        for(int i = 0; i < n/2; i++){
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n-1-i);
            ans.setCharAt(i, lastChar);
            ans.setCharAt(n-1-i, firstChar);
        }
        System.out.println(ans.toString());
    }


}
