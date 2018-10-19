package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] agrs) {
        hello("world ");

        Square s = new Square();
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle();
        r.a = 4;
        r.b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + "=" + area(r));

        Point p = new Point();
        p.p1 = 1;
        p.p2 = 2;
        System.out.println("Расстояние между двумя точками с координатами " + p.p1 + " и " + p.p2 + " = " + area(p));
    }

    public static void hello(String somebody) {

        System.out.println("Hello" + somebody + "!");
    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }

    public static double area(Point p) {
        return p.p1 * p.p2;
    }
}