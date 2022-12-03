package com.walking.figuresPolymorphism.task1.model;

import PreviousLessons.Decompose_Rectangle;

public class Square extends EquilateralPolygon {
    public Square(int side) {
        draw(side);
    }

    @Override
    public void draw(int side) {
        Decompose_Rectangle.designRectangle(' ', '|', '-', side, side);
    }
}
