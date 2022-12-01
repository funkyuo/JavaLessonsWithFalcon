package com.walking.counterAggregation;

class CounterService {
    private static final String[] AVAIL_COUNTERS = {"Газ", "Холодная вода", "Горячая вода", "Электричество"};
    private static final int TOTAL_COUNTERS = AVAIL_COUNTERS.length;
    private static final Counter[] COUNTERS_IN_USE = new Counter[TOTAL_COUNTERS];
    private static int counterIndex = 0;

    Counter getCounterById(int counterIndex) {
        return COUNTERS_IN_USE[counterIndex];
    }

    Counter getCounterByName(String name) {
        int i = 0;
        while (COUNTERS_IN_USE[i].getName() != name) {
            i++;
        }
        return COUNTERS_IN_USE[i];
    }

    /**Counter incrementByName(String name) {
        int i = 0;
        while (COUNTERS_IN_USE[i].getName() != name) {
            i++;
        }
        return COUNTERS_IN_USE[i];
    }
    Counter resetByName(String name) {
        int i = 0;
        while (COUNTERS_IN_USE[i].getName() != name) {
            i++;
        }
        return COUNTERS_IN_USE[i];
    }*/

    void addCounter(Counter counter) {
        if (counterIndex == TOTAL_COUNTERS) {
            System.out.println("Все счетчики использованы");
        } else {
            COUNTERS_IN_USE[counterIndex] = counter;
            counterIndex++;
        }
    }

    void Stat() {
        int i = 0;
        while (i < counterIndex) {
            System.out.println(COUNTERS_IN_USE[i].getName() + "\t" + COUNTERS_IN_USE[i].getValue() + "\t" + COUNTERS_IN_USE[i].getUnit());
            i++;
        }
    }
}
