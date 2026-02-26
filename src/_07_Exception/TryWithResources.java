package _07_Exception;


//Try without Resources => Before Java 7, we had to manually close resources in the finally block:

//FileInputStream fis = null;
//try {
//fis = new FileInputStream("file.txt");

import java.util.Scanner;

//// read file
//} catch (Exception e) {
//        e.printStackTrace();
//} finally {
//        try {
//        if (fis != null) {
//        fis.close();
//        }
//                } catch (IOException e) {
//        e.printStackTrace();
//    }
//            }

//Try with Resources =>
//    ✔ Resource automatically closes after try block
//    ✔ No need for finally block

public class TryWithResources {

    public void tryWithResource(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello " + name);
        } catch (Exception e){
            System.out.println("Error : " + e);
        }
//        No Finally Needed
        System.out.println("Scanner closed AutoMatically : ");
    }
    public static void main(String[] args){
        TryWithResources twr = new TryWithResources();
        twr.tryWithResource();
    }

}
