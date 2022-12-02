package com.walking.counterAggregation;

class CounterService {
    private static final String[] AVAIL_COUNTERS = {"Газ", "Холодная вода", "Горячая вода", "Электричество"};
    private static final int TOTAL_COUNTERS = AVAIL_COUNTERS.length;
    private Counter[] COUNTERS_IN_USE;
    private int counterIndex = 0;

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

    /**
     * Counter incrementByName(String name) {
     * int i = 0;
     * while (COUNTERS_IN_USE[i].getName() != name) {
     * i++;
     * }
     * return COUNTERS_IN_USE[i];
     * }
     * Counter resetByName(String name) {
     * int i = 0;
     * while (COUNTERS_IN_USE[i].getName() != name) {
     * i++;
     * }
     * return COUNTERS_IN_USE[i];
     * }
     */

    void addCounter(Counter... counters) {

        if (counterIndex == 0) {
            COUNTERS_IN_USE = new Counter[counters.length];
            for (Counter counter : counters) {
                COUNTERS_IN_USE[counterIndex] = counter;
                counterIndex++;
            }
        } else {
            Counter[] NEW_COUNTERS_IN_USE = new Counter[COUNTERS_IN_USE.length + counters.length];
            for (int i = 0; i < counterIndex; i++) {
                NEW_COUNTERS_IN_USE[i] = COUNTERS_IN_USE[i];
            }
            for (int i = counterIndex; i < counterIndex + counters.length; i++) {
                NEW_COUNTERS_IN_USE[i] = counters[i - counterIndex];
            }
            counterIndex += counters.length;
            COUNTERS_IN_USE = NEW_COUNTERS_IN_USE;
        }

    }

    void Stat() {
        for (Counter counter : COUNTERS_IN_USE) {
            System.out.println(counter.getName() + "\t" + counter.getValue() + "\t" + counter.getUnit());
        }
    }
}
