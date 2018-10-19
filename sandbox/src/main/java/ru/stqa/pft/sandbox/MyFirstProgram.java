package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] agrs) {
        hello("world ");
        hello("Andrey ");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + "=" + r.area());

        Point p = new Point(1,1,1,1);
        System.out.println("Расстояние между двумя точками с координатами " + p.x1 + "," + p.x2 + " и " + p.y1 + "," + p.y2 + " = " + p.area());
    }

    public static void hello(String somebody) {

        System.out.println("Hello" + somebody + "!");
    }
}