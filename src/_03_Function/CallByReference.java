package _03_Function;

class Test {
    int value = 10;
}

class Demo {
    static void change(Test obj) {
        obj.value = 50;
    }

    public static void main(String[] args) {
        Test t = new Test();
        change(t);
        System.out.println(t.value);
    }
}

