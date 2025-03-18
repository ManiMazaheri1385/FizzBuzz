public class Main {
    static boolean printNumber;
    static int i;

    public static void printStringInsteadNumber(int number, String str) {
        if (i % number == 0) {
            System.out.print(str);
            printNumber = false;
        }
    }

    public static void main(String[] args) {
        for (i = 1; i <= 100; i++) {
            printNumber = true;
            printStringInsteadNumber(3, "Fizz");
            printStringInsteadNumber(5, "Buzz");
            if (printNumber) {
                System.out.println(i);
                continue;
            }
            System.out.println();
        }
    }

}