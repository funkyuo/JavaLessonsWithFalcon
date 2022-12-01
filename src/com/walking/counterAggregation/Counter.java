package com.walking.counterAggregation;

class Counter {
    static private final String DEFAULT_UNIT = "m3";
    static private final int DEFAULT_VALUE = 0;
    private final String NAME;
    private final String UNIT;
    private int value;

    Counter(String name) {
        this(name, DEFAULT_VALUE, DEFAULT_UNIT);
    }

    Counter(String name, int value) {
        this(name, value, DEFAULT_UNIT);
    }

    Counter(String name, int value, String unit) {
        NAME = name;
        this.value = value;
        UNIT = unit;
    }

    String getName() {
        return NAME;
    }

    String getUnit() {
        return UNIT;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }
}
