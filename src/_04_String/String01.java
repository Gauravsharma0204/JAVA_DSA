package _04_String;

public class String01 {
    public static void main(String[] args){
        String str = "Gaurav";
        System.out.println("Name --> " + str);

        String name1 = new String("Gaurav");
        String name2 = new String("Gaurav");
        String name3 = new String("Gaurav");
        String name4 = new String("Gaurav");
        String name5 = name1;

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println(name4 == name5);
        System.out.println(name5 == name1);

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name5));


    }

}
