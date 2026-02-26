package _01_Basic;

import java.util.Scanner;
class ScannerClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Name : " + name);
    }
}