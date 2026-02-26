public class Question {
    public static void main(String[] args){
        String gmail = "gaurav@gmail.com";

        int gm = gmail.lastIndexOf('@');
        int gm1 = gmail.lastIndexOf('.');

        System.out.println(gmail.substring(gm + 1, gm1));

    }
}
