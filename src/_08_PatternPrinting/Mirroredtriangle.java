package _08_PatternPrinting;

public class Mirroredtriangle {
    void main(){
        for (int i = 0; i <= 4; i++){
            for (int j = 0; j < (4 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
