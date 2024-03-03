package es.edu.uah.matcomp.ej3;

public class Test {
    public class TestPerson {
        public static void main (String[] args) {
            // Declare and allocate a new instance of cylinder
            // with default color, radius, and height
            Person c1 = new Person("España", "caudillo");
            System.out.println("Person:"
                    + " Name =" + c1.getName()
                    + " Address=" + c1.getAdress());

        }
    }
    public class TestPoint2D {
        public static void main (String[] args) {
            // Declare and allocate a new instance of cylinder
            // with default color, radius, and height
            Point2D c1 = new Point2D();
            System.out.println("Cylinder:"
                    + " x =" + c1.getX()
                    + " y =" + c1.getY()
                    + "xy =" + c1.getXY());

            // Declare and allocate a new instance of cylinder
            // specifying radius and height, with default color
            Point2D c3 = new Point2D(2.0f, 10.0f);
            System.out.println("Point2D:"
                    + " x =" + c3.getX()
                    + " y=" + c3.getY()
                    + " xy ="+ c3.getXY()                    );
        }
    }
    public class TestCylinder {
        // save as "TestCylinder.java"
        public static void main (String[] args) {
            // Declare and allocate a new instance of cylinder
            // with default color, radius, and height
            Cylinder c1 = new Cylinder();
            System.out.println("Cylinder:"
                    + " radius=" + c1.getRadius()
                    + " height=" + c1.getHeight()
                    + " base area=" + c1.getArea()
                    + " volume=" + c1.getVolume());

            // Declare and allocate a new instance of cylinder
            // specifying height, with default color and radius
            Cylinder c2 = new Cylinder(10.0);
            System.out.println("Cylinder:"
                    + " radius=" + c2.getRadius()
                    + " height=" + c2.getHeight()
                    + " base area=" + c2.getArea()
                    + " volume=" + c2.getVolume());

            // Declare and allocate a new instance of cylinder
            // specifying radius and height, with default color
            Cylinder c3 = new Cylinder(2.0, 10.0);
            System.out.println("Cylinder:"
                    + " radius=" + c3.getRadius()
                    + " height=" + c3.getHeight()
                    + " base area=" + c3.getArea()
                    + " volume=" + c3.getVolume());
        }
    }
    public class TestStudent {
        public static void main (String[] args) {
            // Declare and allocate a new instance of cylinder
            // with default color, radius, and height
            Student c1 = new Student("España", "caudillo","Matematicas", 7, 150.5);
            System.out.println("Staff:"
                    + " Program =" + c1.getProgram()
                    + " Fee =" + c1.getFee()
                    + " Name =" + c1.getName()
                    + "Year  =" + c1.getYear()
                    + " Address=" + c1.getAdress());

        }
    }
    public class TestPoint3D {
        public static void main (String[] args) {
            // Declare and allocate a new instance of cylinder
            // with default color, radius, and height
            Point3D c1 = new Point3D();
            System.out.println("Cylinder:"
                    + " x =" + c1.getX()
                    + " y =" + c1.getY()
                    + "xyz =" + c1.getXYZ());

            // Declare and allocate a new instance of cylinder
            // specifying radius and height, with default color
            Point3D c3 = new Point3D(2.0f,3.0f,5.0f);
            System.out.println("Point3D:"
                    +"xyz= " + c3.getXYZ()       );
        }
    }
    public class TestStaff {
        public static void main (String[] args) {
            // Declare and allocate a new instance of cylinder
            // with default color, radius, and height
            Staff c1 = new Staff("España", "caudillo","San gabriel ", 200);
            System.out.println("Staff:"
                    + " School=" + c1.getSchool()
                    + " Pay =" + c1.getPay()
                    + " Name =" + c1.getName()
                    + " Address=" + c1.getAdress());

        }
    }
}
