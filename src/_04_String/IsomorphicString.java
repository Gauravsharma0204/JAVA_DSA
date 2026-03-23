package _04_String;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicString {

    public static void main(String[] args) {
        IsomorphicString obj = new IsomorphicString();

        String s = "egg";
        String t = "add";

        boolean ans = obj.isIsomorphic(s, t);

        System.out.println(ans);
    }

    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashMap<Character, Character> tToTMap = new HashMap<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(!sToTMap.containsKey(s1)){
                sToTMap.put(s1, t1);
            }

            if(!tToTMap.containsKey(t1)){
                tToTMap.put(t1, s1);
            }

            if(sToTMap.get(s1) != t1 || tToTMap.get(t1) != s1){
                return false;
            }
        }
        return true;
    }


    public boolean isIsomorphicUsingArray(String s, String t){

        int sToTMap[] = new int[128];
        int tToSMap[] = new int[128];
        Arrays.fill(sToTMap, - 1);
        Arrays.fill(tToSMap, -1);

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if (sToTMap[s1] == -1){
                sToTMap[s1] = t1;
            }

            if (tToSMap[t1] == -1){
                tToSMap[t1] = s1;
            }

            if(sToTMap[s1] != t1 || tToSMap[t1] != s1){
                return false;
            }
        }
        return true;
    }

}
