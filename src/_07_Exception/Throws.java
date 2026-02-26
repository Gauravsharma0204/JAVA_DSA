package _07_Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void main(String[] args){
        try{
            readFile();
        } catch (IOException e){
            System.out.println("Caught Exception : " + e.getMessage());
        }
    }

    static void readFile() throws IOException {
        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
}
