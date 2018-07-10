import app.IsRight;
import model.Triangle;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Triangle tr = new Triangle();

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość boku A:");
        double a = input.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = input.nextDouble();
        System.out.println("Podaj długość boku C:");
//        double c = input.nextDouble();

        tr.setSideA(a);
        tr.setSideB(b);
        tr.setSideC(input.nextDouble());

        IsRight isRight = new IsRight();

        if (isRight.isRightTriangle(tr)) {
            System.out.printf("Trójkąt o bokach %s, %s, %s jest prostokątny!", tr.getSideA(), tr.getSideB(), tr.getSideC());
        }
        else {
            System.out.printf("Niestety trójkąt o bokach %s, %s, %s nie jest prostokątny :-(", tr.getSideA(), tr.getSideB(), tr.getSideC());
        }
    }
}
