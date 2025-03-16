public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean printNumber = true;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                printNumber = false;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                printNumber = false;
            }
            if (!printNumber) {
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}