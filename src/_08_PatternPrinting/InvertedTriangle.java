package _08_PatternPrinting;

public class InvertedTriangle {
    void main(){
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
