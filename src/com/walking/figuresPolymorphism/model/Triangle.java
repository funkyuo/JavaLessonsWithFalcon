package com.walking.figuresPolymorphism.model;
import com.walking.figuresPolymorphism.printer.TrianglePrinter;
public class Triangle extends EquilateralPolygon {
    public Triangle(int side){
        draw(side);
    }
    @Override
    public void draw(int side){
        TrianglePrinter.DesignTriangle('/', '\\', '_', 5);
    }
}
