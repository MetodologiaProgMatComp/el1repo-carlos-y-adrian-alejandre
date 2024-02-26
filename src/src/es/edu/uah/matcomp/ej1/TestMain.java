package es.edu.uah.matcomp.ej1;/*
public class es.edu.uah.matcomp.ej1.TestMain {
    public static void main(String[] args) {
        es.edu.uah.matcomp.ej1.Circle c1 = new es.edu.uah.matcomp.ej1.Circle(1.1);
        System.out.println(c1);
        es.edu.uah.matcomp.ej1.Circle c2 = new es.edu.uah.matcomp.ej1.Circle();
        System.out.println(c2);
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n" , c1.getCircumference());
    }
}
 es.edu.uah.matcomp.ej1.Circle[radius=2.2color=red] sale esto en vez de solo el radio*/
/*
public class es.edu.uah.matcomp.ej1.TestMain{
    public static void main(String[] args){
        es.edu.uah.matcomp.ej1.Rectangle r1= new es.edu.uah.matcomp.ej1.Rectangle(1.2f, 3.4f);
        System.out.println(r1);
        es.edu.uah.matcomp.ej1.Rectangle r2= new es.edu.uah.matcomp.ej1.Rectangle();
        System.out.println(r2);

        r1.setLenght(5.6f);
        r1.setWidth(7.8f);
        System.out.println("Lenght is: "+ r1.getLenght());
        System.out.println("Width is: "+ r1.getWidth());

        System.out.printf("Area is: %.2f%n", r1.getArea());
        System.out.printf("Perimeter is: %2f%n", r1.getPerimeter());

    }
}

public class es.edu.uah.matcomp.ej1.TestMain{
    public static void main(String[] args){
        es.edu.uah.matcomp.ej1.Employee e1= new es.edu.uah.matcomp.ej1.Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is: "+ e1.getId());
        System.out.println("firsname is: "+ e1.getFirsName());
        System.out.println("lastname is: "+e1.getLastName());
        System.out.println("salary is: "+ e1.getSalary());
        System.out.println("name is: "+ e1.getName());
        System.out.println("annual salary is: "+ e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}

public class es.edu.uah.matcomp.ej1.TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        es.edu.uah.matcomp.ej1.Date d1 = new es.edu.uah.matcomp.ej1.Date(1, 2, 2014);
        System.out.println(d1);  // toString()
        // Test Setters and Getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);  // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());
        // Test setDate()
        d1.setDate(3, 4, 2016);
        System.out.println(d1);  // toString()
    }
}


import es.edu.uah.matcomp.ej1.Time;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()
        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        // Test setTime()
        t1.setTime(23, 58, 59);
        System.out.println(t1);  // toString()
        // Test nextSecond();

        System.out.println(t1.nextSecond());

        System.out.println(t1.nextSecond());
        // Test previousSecond()

        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond());

    }

}




public class TestMain {
    public static void main(String[] args) {
                // Test constructor and toString()
                Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
                System.out.println(ball);  // toString()
                // Test Setters and Getters
                ball.setX(80.0f);
                ball.setY(35.0f);
                ball.setRadius(5);
                ball.setXDelta(4.0f);
                ball.setYDelta(6.0f);
                System.out.println(ball);  // toString()
                System.out.println("x is: " + ball.getX());
                System.out.println("y is: " + ball.getY());
                System.out.println("radius is: " + ball.getRadius());
                System.out.println("xDelta is: " + ball.getXDelta());
                System.out.println("yDelta is: " + ball.getYDelta());
                // Bounce the ball within the boundary
                float xMin = 0.0f;
                float xMax = 100.0f;
                float yMin = 0.0f;
                float yMax = 50.0f;
                for (int i = 0; i < 15; i++) {
                    ball.move();
                    System.out.println(ball);
                    float xNew = ball.getX();
                    float yNew = ball.getY();
                    int radius = ball.getRadius();
                    // Check boundary value to bounce back
                    if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                        ball.reflectHorizontal();
                    }
                    if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                        ball.reflectVertical();
                    }
                }
            }
        }


 public class TestMain {
   public static void main(String[] args) {
      // Test constructor and toString()
      Account a1 = new Account("A101", "Tan Ah Teck", 88);
      System.out.println(a1);  // toString();
      Account a2 = new Account("A102", "Kumar"); // default balance
      System.out.println(a2);
      // Test Getters
      System.out.println("ID: " + a1.getID());
      System.out.println("Name: " + a1.getName());
      System.out.println("Balance: " + a1.getBalance());
      // Test credit() and debit()
      a1.credit(100);
      System.out.println(a1);
      a1.debit(50);
      System.out.println(a1);
      a1.debit(500);  // debit() error
      System.out.println(a1);
      // Test transfer()
      a1.transferTo(a2, 100);  // toString()
      System.out.println(a1);
      System.out.println(a2);
   }
    public class TestMain {
   public static void main(String[] args) {
      // Test constructor and toString()
      InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
      System.out.println(inv1);  // toString();
      // Test Setters and Getters
      inv1.setQty(999);
      inv1.setUnitPrice(0.99);
      System.out.println(inv1);  // toString();
      System.out.println("id is: " + inv1.getId());
      System.out.println("desc is: " + inv1.getDesc());
      System.out.println("qty is: " + inv1.getQty());
      System.out.println("unitPrice is: " + inv1.getUnitPrice());
      // Test getTotal()
      System.out.println("The total is: " + inv1.getTotal());
   }
 }

*/