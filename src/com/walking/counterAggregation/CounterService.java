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
                System.out.println("Current Index: " + counterIndex);
                System.out.println("Init: " + COUNTERS_IN_USE[counterIndex].getName());

                counterIndex++;
            }
        } else {
            Counter[] NEW_COUNTERS_IN_USE = new Counter[COUNTERS_IN_USE.length + counters.length];

            for (int i = 0; i < counterIndex; i++) {
                NEW_COUNTERS_IN_USE[i] = COUNTERS_IN_USE[i];

                System.out.println("Current Arr Is Null? :" + COUNTERS_IN_USE[i].getName());
               System.out.println("New Arr Is Null? :" + NEW_COUNTERS_IN_USE[i].getName());

            }
            for (int i = counterIndex; i < counterIndex + counters.length; i++) {
                NEW_COUNTERS_IN_USE[i] = counters[i - counterIndex];
                System.out.println("Current Index: " + i);
                System.out.println("Add New Element: " + NEW_COUNTERS_IN_USE[counterIndex].getName());
            }
            counterIndex += counters.length;
            System.out.println("Update Index: " + counterIndex);
            COUNTERS_IN_USE = NEW_COUNTERS_IN_USE;
            System.out.println("Array Length :" + COUNTERS_IN_USE.length);

           for(Counter counter: COUNTERS_IN_USE){
                System.out.println("Saved: "+counter.getName() + "\t" + counter.getValue() + "\t" + counter.getUnit());
            }
        }

    }

    void Stat() {

        for (Counter counter : COUNTERS_IN_USE) {
            if (counter == null) {
                System.out.println("null");
            } else {
                System.out.println(counter.getName() + "\t" + counter.getValue() + "\t" + counter.getUnit());
            }
        }
        /*int i = 0;
        while (i < counterIndex - 1) {
            System.out.println("Stat Index :" + i);
            System.out.println(COUNTERS_IN_USE[i].getName() + "\t" + COUNTERS_IN_USE[i].getValue() + "\t" + COUNTERS_IN_USE[i].getUnit());
            i++;
        }*/
    }
}
