package Task2;

import java.util.concurrent.atomic.AtomicBoolean;

public class FizzBuzz extends Thread{
     int n;
     volatile int currentNumber;

    public FizzBuzz(int n) {
        this.n = n;
        this.currentNumber = 1;
    }

    public synchronized void fizz() {
        print("fizz");
        currentNumber++;
        notifyAll();
    }

    public synchronized void buzz() {
        print("buzz");
        currentNumber++;
        notifyAll();
    }

    public synchronized void fizzbuzz() {
        print("fizzbuzz");
        currentNumber++;
        notifyAll();
    }

    public synchronized void number() {
        print(Integer.toString(currentNumber));
        currentNumber++;
        notifyAll();
    }

    private void print(String value) {
        System.out.print(value + " ");
    }
}
