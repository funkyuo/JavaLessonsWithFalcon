package com.walking.figuresPolymorphism.printer;


public class TrianglePrinter {

    public static void DesignTriangle(char left, char right, char bottom, int side) {
        int bottomIndex = 0;
        int i = 1;
        String line = "";
        String btm = String.valueOf(bottom);

        while (i <= side) {
            line = " ".repeat(side - i) + "/";
            if (i == side) {
                line += String.valueOf(bottom).repeat(bottomIndex) + "\\";
            } else {
                line += " ".repeat(bottomIndex) + "\\";
            }
            System.out.println(line);
            i++;
            bottomIndex += 2;
        }

    }
}
