package _04_String;

public class StringFunction {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Line : ");
//        String  name1 = sc.nextLine();
//
//        System.out.println("Enter the Name : ");
//        String name = sc.next();

        String name = "Gaurav";

        System.out.println("Length : " + name.length());
        System.out.println("Lower Case : " + name.toLowerCase());
        System.out.println("Upper Case : " + name.toUpperCase());
        System.out.println("Char At : " + name.charAt(1));
        System.out.println("Index of : " + name.indexOf('G'));
        System.out.println("Last Index : " + name.lastIndexOf('v'));
        System.out.println("Start With : " + name.startsWith("Gau"));
        System.out.println("End With : " + name.endsWith("Gau"));
        System.out.println("            Gaurav Kumar     ".trim());// Remove Space
        System.out.println("Substring : " + name.substring(1,5));



//        char ch[] = name.toCharArray();
//        for (int i = 0; i < ch.length; i++){
//            System.out.println(ch[i]);
//        }
//
//        System.out.println("Gaurav".compareTo("Gaur"));
//        System.out.println("Gaur".compareTo("Gaurav"));
//        System.out.println("Gaurav".compareTo("Gaurav"));
//
//        System.out.println(name);



        //String to Array

        String location = " Delhi, MayurVihar, Noida, Kerla, Jammu";
        String locationList[] = location.split(",");

        for(int i = 0; i < locationList.length; i++){
            System.out.println(locationList[i ]);
        }






    }
}
