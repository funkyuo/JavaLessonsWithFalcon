package Lesson10.Task3;

public class PrimeFinder {
    public static final int DEFAULT_HOW_MANY_PRIMES_NEEDED = 10;
    public final int HOW_MANY_PRIMES_NEEDED;
    public final int[] PRIMES;
    public final int FIRST_PRIME = 2;

    public int currentIndex = 0;
    public int currentNumber;

    public PrimeFinder() {
        this(DEFAULT_HOW_MANY_PRIMES_NEEDED);
    }

    public PrimeFinder(int howManyPrimesNeeded) {
        HOW_MANY_PRIMES_NEEDED = howManyPrimesNeeded;
        PRIMES = new int[HOW_MANY_PRIMES_NEEDED];
        PRIMES[0] = FIRST_PRIME;
    }


    public int[] getPrimes() {
        for (; currentIndex < PRIMES.length; currentIndex++) {
            if (currentIndex == 0) {
                PRIMES[currentIndex] = 2;
            } else {
                int addingValue = currentIndex == 1 ? 1 : 2;
                currentNumber = PRIMES[currentIndex - 1] + addingValue;


                PRIMES[currentIndex] = findNextPrimeNumber();
            }
        }
        return PRIMES;
    }


    public int findNextPrimeNumber() {
        boolean isPrime = isPrime();
        if (isPrime) {
            return currentNumber;
        }
        currentNumber += 2;
        return findNextPrimeNumber();
    }

    public boolean isPrime() {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && currentNumber / PRIMES[j] > 1) {
            if (currentNumber % PRIMES[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

}


