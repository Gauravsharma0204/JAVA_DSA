package _04_String;

import java.util.Scanner;

public class StrinngLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String name2 = sc.nextLine();
        System.out.println("Enter the String : ");
        String name3 = sc.nextLine();


        System.out.println("Enter the String : ");
        String name = sc.next();
        System.out.println("Enter the String : ");
        String name1 = sc.next();


        System.out.println("Name -->  " + name);
        System.out.println("Name1 -->  " + name1);
        System.out.println("Name2 -->  " + name2);
        System.out.println("Name3 -->  " + name3);
    }
}
