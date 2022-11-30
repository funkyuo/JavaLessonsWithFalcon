package Lesson10.Task1;

import java.util.Scanner;

public class Main {

    final static String EMPT = "  ";
    final static String HL = "==";
    final static String VL = "||";
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int length = requireInt("Enter rectangle's length: ");
        int width = requireInt("Enter rectangle's width: ");

        SCANNER.close();

        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(String requiringMessage) {
        System.out.print(requiringMessage);

        return SCANNER.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = EMPT;

        for (int i = 0; i < length; i++) {
            horizontalLine += HL;
        }

        horizontalLine += EMPT + "\n";

        return horizontalLine;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = VL;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += EMPT;
        }

        verticalLinesUnit += VL + "\n";
        return verticalLinesUnit;
    }
}