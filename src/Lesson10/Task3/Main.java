package Lesson10.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько простых чисел найти? ");
        int userInput = scanner.nextInt();
        scanner.close();

        PrimeFinder primeFinder;

        if (userInput <= 0) {
            System.out.println("Ищем первые 10 простых чисел");
            primeFinder = new PrimeFinder();
        } else {
            primeFinder = new PrimeFinder(userInput);
        }
        System.out.println(primeFinder.getPrimes().length);
        for (int prime : primeFinder.PRIMES) System.out.print(prime + " ");
        System.out.println("\n" + sum(primeFinder.PRIMES));

    }



    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }
}
