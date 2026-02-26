package _07_Exception;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExcep {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("text.txt");
        } catch (IOException e){
            System.out.println("File not Find : " );
        }

        System.out.println(5/0);
    }
}
