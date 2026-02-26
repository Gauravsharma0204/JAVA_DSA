package _08_PatternPrinting;

public class CharacterPatten {
    void main(){
        for(int i = 1; i <= 4; i++){
            for (char j = 'A'; j < 'A' + i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
