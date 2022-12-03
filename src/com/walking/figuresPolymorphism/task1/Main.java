package com.walking.figuresPolymorphism.task1;




import com.walking.figuresPolymorphism.task1.model.Triangle;
import com.walking.figuresPolymorphism.task1.model.Square;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину стороны: ");
        int side = scanner.nextInt();
        System.out.println("Выберите( 1 - Треугольник, 2 - Квадрат): ");
        int figure = scanner.nextInt();
        scanner.close();
        switch (figure) {
            case 1:
                new Triangle(side);
                break;
            case 2:
                new Square(side);
                break;
            default:
                System.out.println("Си ю некст тайм:)");
                break;
        }

    }
}
