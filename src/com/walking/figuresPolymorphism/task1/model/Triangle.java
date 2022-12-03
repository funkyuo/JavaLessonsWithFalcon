package com.walking.figuresPolymorphism.task1.model;
import com.walking.figuresPolymorphism.task1.printer.TrianglePrinter;
public class Triangle extends EquilateralPolygon {
    public Triangle(int side){
        draw(side);
    }
    @Override
    public void draw(int side){
        TrianglePrinter.DesignTriangle('/', '\\', '_', 5);
    }
}
