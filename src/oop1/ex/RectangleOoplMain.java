package oop1.ex;
/*
절차 지형 직사각형 프로그램을 객체 지향으로 변경하기
 */
public class RectangleOoplMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        System.out.println("넓이: " + rectangle.calculaterArea());

        System.out.println("둘레 길이: " + rectangle. calculaterPerimeter());

        System.out.println("정사각형 여부: " + rectangle.isSquare());
    }
}
