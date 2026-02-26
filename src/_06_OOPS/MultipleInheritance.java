package _06_OOPS;

interface Printer{
    void print(String document);
}
interface Scanner{
    void scan(String document);
}

class MultiInheritance implements Printer, Scanner{
    @Override
    public void print(String document){
        System.out.println("Printing : " + document);
    }

    @Override
    public void scan(String document){
        System.out.println("Scanning : " + document);
    }
}



public class MultipleInheritance {
    public static void main(String[] args){
        MultiInheritance m = new MultiInheritance();
        m.print("Report.pdf");
        m.scan("Id card");
    }
}


