package app;

import model.Triangle;

public class IsRight {

    public boolean isRightTriangle(Triangle triangle) {
        double a = triangle.getSideA();
        double b = triangle.getSideB();
        double c = triangle.getSideC();

        if (a * a + b * b == c * c) {
            return true;
        }

        else if (a * a + c * c == b * b) {
            return true;
        }
        else if (b * b + c * c == a * a) {
            return true;
        }
        else {
            return false;
        }

    }

}
