package _07_Exception;

import java.util.Scanner;

public class TryCatch {

    public int getUserInput(){
        Scanner sc = new Scanner(System.in);
        int val = 0;

        try{
            val = sc.nextInt();
        } catch (Exception e){
            System.out.println("Failed : " + e);
        }
        return val;
    }



    public static void main(String[] args){
        TryCatch tc = new TryCatch();
        System.out.println("Insert a Number : ");
        int val = tc.getUserInput();
        System.out.println("Inserted Values : " + val);
    }
}


