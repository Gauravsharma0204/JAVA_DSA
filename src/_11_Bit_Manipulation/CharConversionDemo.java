package _11_Bit_Manipulation;

public class CharConversionDemo {
    private char toLower(char ch){
        return (char)(ch | (1 << 5));
    }

    private char toLowerSpecial(char ch){
        return (char)(ch | ' ');
    }

    private char toUpper(char ch){
        return (char)(ch & ~(1 << 5));
    }

    private char toUpperSpecial(char ch){
        return (char)(ch & ~' ');
    }

    private char toggleCase(char ch){
        return (char) (ch ^ (1 << 5));
    }

    private char toggleCaseSpecial(char ch){
        return (char) (ch ^ ' ');
    }

    void main(){
        CharConversionDemo ch = new CharConversionDemo();
        System.out.println("lower : " + ch.toLower('A'));

        System.out.println("Upper : " + ch.toUpper('a'));

        System.out.println("Toggle : " + ch.toggleCase('Z'));

        System.out.println("lower : " + ch.toLowerSpecial('A'));

        System.out.println("Upper : " + ch.toUpperSpecial('a'));

        System.out.println("Toggle : " + ch.toggleCaseSpecial('Z'));
    }
}
