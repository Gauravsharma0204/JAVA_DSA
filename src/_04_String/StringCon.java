package _04_String;

public class StringCon {
    public static void main(String[] args){

        System.out.println(50 + 50 + " String");
        System.out.println("String " + 50 + 50 + (50 + 50) + 50 + 50);
        System.out.println(50 + " String " + 50 );


        float num = 56.55725f;
        System.out.printf("Floating Number is %.2f " , num);

        String formate = String.format("\nFloating Number is %.2f " , num);

        System.out.println(formate);



    }
}
