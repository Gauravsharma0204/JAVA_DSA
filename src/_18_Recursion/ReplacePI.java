public class ReplacePI {
    private String replacePI(String str, int index){
        int n = str.length();
        if(index == n) return "";

        if(index < n-1 && str.charAt(index) == 'P' && str.charAt(index+1)=='I'){
            return ("3.14" + replacePI(str, index+2));
        } else {
            return (str.charAt(index) + replacePI(str, index+1));
        }
    }

    void main(){
        String str = "XPIPIX";
        ReplacePI pi = new ReplacePI();
        String res = pi.replacePI(str, 0);
        System.out.println("Update String after Replacing all PI is => " + res);
    }
}
