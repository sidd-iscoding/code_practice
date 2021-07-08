
class Sum {

    int add(int a, int b) {
        return (a+b);   
    }

    public static void main (String args[]) {
        System.out.println(" using Sum class");
        Sum a = new Sum();
        System.out.println("Sum is :" + a.add(5, 10));
    }
    public static void main(double x) {
        System.out.println("2nd main method()");
    }

    public static void main (int i) {
        System.out.println(" Using Sum class main function with integer argument");
        Sum a = new Sum();
        System.out.println("Sum is :" + a.add(20, 10));
    }
}

class DefClass {

    public static void main (String args[]) {
        System.out.println(" using DefClass");
        Sum a = new Sum();
        System.out.println("Sum is :" + a.add(5, 10));
        Sum.main(null);
        Sum.main(1);
        Sum.main(1.2);
    }
}