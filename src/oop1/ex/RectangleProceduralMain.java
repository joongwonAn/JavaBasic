package oop1.ex;
/*
- 절차 지형 직사각형 프로그램을 객체 지향으로 변경하기
 */
public class RectangleProceduralMain {

    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculaterArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculaterPerimeter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }

    static int calculaterArea(int width, int height) {
        return width * height;
    }

    static int calculaterPerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
