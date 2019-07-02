package jvm4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(recursiveFactorial(10000));
    }

    static int recursiveFactorial(int number) throws InterruptedException {
        if (number > 1) {
            Thread.sleep(10);
            return recursiveFactorial(number - 1) * number;
        } else {
            return 1;
        }
    }
}
