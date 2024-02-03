package Task2;

public class Main {
    public static void main(String[] args) {
        int n = 30;
        FizzBuzz fizzBuzz = new FizzBuzz(n);

        Thread threadA = new Thread(() -> {
            while (fizzBuzz.currentNumber <= fizzBuzz.n) {
                if (fizzBuzz.currentNumber % 3 == 0 && fizzBuzz.currentNumber % 5 != 0) {
                    fizzBuzz.fizz();
                }
            }
        });

        Thread threadB = new Thread(() -> {
            while (fizzBuzz.currentNumber <= fizzBuzz.n) {
                if (fizzBuzz.currentNumber % 3 != 0 && fizzBuzz.currentNumber % 5 == 0) {
                    fizzBuzz.buzz();
                }
            }
        });

        Thread threadC = new Thread(() -> {
            while (fizzBuzz.currentNumber <= fizzBuzz.n) {
                if (fizzBuzz.currentNumber % 3 == 0 && fizzBuzz.currentNumber % 5 == 0) {
                    fizzBuzz.fizzbuzz();
                }
            }
        });

        Thread threadD = new Thread(() -> {
            while (fizzBuzz.currentNumber <= fizzBuzz.n) {
                if (fizzBuzz.currentNumber % 3 != 0 && fizzBuzz.currentNumber % 5 != 0) {
                    fizzBuzz.number();
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

    }
}
