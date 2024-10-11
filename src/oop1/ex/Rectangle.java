package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculaterArea() {
        return width * height;
    }

    int calculaterPerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
