package _08_PatternPrinting;

public class FloydsTriangle {
    int num = 1;
    void main(String[] args){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(num + " ") ;
                num++;
            }
            System.out.println();
        }
    }
}
