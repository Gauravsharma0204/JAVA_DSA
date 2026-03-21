package _04_String;

public class Substring {

    void main(){
        String str = "ABC";
//        substring(str);
        withoutSubtring(str);
    }

    static void substring(String input){
         int n = input.length();
         for (int i = 0; i < n; i++){
             for(int j = i+1; j <= n; j++){
                 System.out.println(input.substring(i, j));
             }
             System.out.println();
         }
    }

    static void withoutSubtring(String input){
        int n = input.length();

        for (int i = 0; i < n; i++) {
            String temp = "";

            for (int j = i; j < n; j++) {
                temp = temp + input.charAt(j);
                System.out.println(temp);
            }
            System.out.println();
        }
    }
}
