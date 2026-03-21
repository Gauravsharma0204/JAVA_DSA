package _04_String;

public class Pallindrome {

    void main(){
        String str = "NAMAN";
        pallindrome(str);

        Boolean str1 = checkPalindrome(str);
        System.out.println(str1);
    }


    static void pallindrome(String str){
        int n = str.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans = str.charAt(i) + ans;
        }

        if(str.equalsIgnoreCase(ans)){
            System.out.println("This is Pallindrome ");
        } else {
            System.out.println("This is not Pallindrome ");
        }
    }

    static boolean checkPalindrome(String input1){
        String input = input1.toLowerCase();
        int start = 0;
        int end = input.length()-1;
        while (start < end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


}
