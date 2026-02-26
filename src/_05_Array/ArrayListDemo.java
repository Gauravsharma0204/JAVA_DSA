package _05_Array;
import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(25);
        arrayList.add(30);
        arrayList.add(35);

//      Print The the Array
        System.out.println("Display the Array : ");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }


        System.out.println("Display the Array After Remove: ");
        arrayList.remove(1);
        arrayList.remove(2);
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }


        System.out.println("Display the Array After Inster Element on Particular Idnex : ");
        arrayList.add(1, 40);
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }


        System.out.print("Array List : " + arrayList + " ");
    }
}
