package com.walking.counterAggregation;

import java.util.Scanner;

public class Main {
    private static final  CounterService SERVICE = new CounterService();

    public static void main(String[] args) {
        createCounter("Газ");
        createCounter("Холодная вода", 10);
        createCounter("Горячая вода", 15, "литр(а/ов)");
        createCounter("Горячая вода", 15, "литр(а/ов)");
        createCounter("Горячая вода", 15, "литр(а/ов)");
        createCounter(new Counter("Электричество",200,"kW"));



        //System.out.println(SERVICE.getCounterByName("Газ").getValue());
        displayCounters();

    }
    private static void displayCounters() {
        SERVICE.Stat();
    }

    private static void  createCounter(Counter counter){
        SERVICE.addCounter(counter);

    }
    private static void createCounter(String name) {
        SERVICE.addCounter(new Counter(name));
    }
    private static void createCounter(String name, int value) {
        SERVICE.addCounter(new Counter(name, value));
    }
    private static void createCounter(String name, int value, String unit) {
        SERVICE.addCounter(new Counter(name, value, unit));
    }
}
