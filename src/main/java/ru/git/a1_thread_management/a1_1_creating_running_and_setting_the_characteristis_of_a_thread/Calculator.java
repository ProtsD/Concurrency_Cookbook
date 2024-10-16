package ru.git.a1_thread_management.a1_1_creating_running_and_setting_the_characteristis_of_a_thread;

public class Calculator implements Runnable {

    //    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(20,
//            () -> System.out.println("Release Barrier"));
    @Override
    public void run() {
//        try {
//            cyclicBarrier.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (BrokenBarrierException e) {
//            throw new RuntimeException(e);
//        }
        long current = 1L;
        long max = 20000L;
        long numPrimes = 0L;

        System.out.printf("Thread '%s': START\n", Thread.currentThread().getName());
        while (current <= max) {
            if (isPrime(current)) {
                numPrimes++;
            }
            current++;
        }
        System.out.printf("Thread '%s': END. Number of Primes: %d\n",
                Thread.currentThread().getName(), numPrimes);
    }

    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }
        for (long i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
