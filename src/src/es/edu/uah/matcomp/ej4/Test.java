package es.edu.uah.matcomp.ej4;

public class Test
{
    public class TestPoint {
        public static void main(String[] args) {
            Point p1 = new Point(10, 20);   // Construct a Point
            System.out.println(p1);
            // Try setting p1 to (100, 10).

        }
    }

    public static class TestLine {
        public static void main(String[] args) {
            Line l1 = new Line(0, 0, 3, 4);
            System.out.println(l1);

            Point p1 = new Point(0,0);
            Point p2 = new Point(1,1);
            Line l2 = new Line(p1, p2);
            System.out.println(l2);

        }
    }
}
