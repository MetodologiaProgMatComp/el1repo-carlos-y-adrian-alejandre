package es.edu.uah.matcomp.ej2;

public class TestMain{
    public static void main(String[] args) {
        /*
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());
// Test getter
        System.out.println("eamil is: " + ahTeck.getEmail());
// Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test
    }




        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()
        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()

        //Prueba para ver como obtener informacion concreta
        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getEmail());


    }
}

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        BookArrays javaDummy = new BookArrays("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }


        AuthorISBN a1 = new AuthorISBN("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);
        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());
        // Test Book class
        BookISBN b1 = new BookISBN("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);
        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());  // Author's toString()
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());
    }
     */
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint();  // Test constructor
        System.out.println(p1);
// Test toString()
        p1.setX(8);
        p1.setY(6);
        // Test setters
        System.out.println("x is: " + p1.getX());  // Test getters
        System.out.println("y is: " + p1.getY());

        p1.setXY(3, 0);
// Test setXY()
        System.out.println(p1.getXY()[0]);  // Test getXY()
        System.out.println(p1.getXY()[1]);


        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));
// which version? version: distance(MyPoint another)
        System.out.println(p2.distance(p1));
// which version? misma version que la anterior
        System.out.println(p1.distance(5, 6));  // which version? verison: distance(int distx, int disty)
        System.out.println(p1.distance());
// which version? version : public double distance(){
//        double dist= Math.sqrt(x^2+y^2)
        System.out.println(p2.MatrizDistancia());



// Test toString()

        MyLine l1= new MyLine(8,6,4,5);
        // Test setters
        System.out.println("begin is: " + l1.getBeginXY());  // Test getters
        System.out.println("end is: " + l1.getEndXY());
        l1.setBeginXY(3, 0);
        l1.setEndXY(4,5);
// Test setXY()
        System.out.println(l1.getBeginXY()[0]);
        System.out.println(l1.getEndXY()[0]);// Test getXY()
        System.out.println(l1.getBeginXY()[1]);
        System.out.println(l1.getEndXY()[1]);
        System.out.println(l1);
        MyLine l2 = new MyLine(0,4,8,6);  // Test another constructor
        System.out.println(l2);
        // Testing the overloaded methods distance()
        System.out.println(l1.getLength());
        System.out.println(l1.getGradients());

// which version?

// Test toString()
        MyCircle c1= new MyCircle(1,1,0);
        System.out.println(c1);
        c1.setCenterX(8);
        c1.setCenterY(6);
        c1.setRadius(3);
        // Test setters
        System.out.println("x is: " + c1.getCenterX());  // Test getters
        System.out.println("y is: " + c1.getCenterY());
        System.out.println("radius is: "+ c1.getRadius());

        c1.setCenterXY(3, 0);
// Test setXY()
        System.out.println(c1.getCenterXY()[0]);  // Test getXY()
        System.out.println(c1.getCenterXY()[1]);



        MyCircle c2 = new MyCircle(0,1, 4);  // Test another constructor

        // Testing the overloaded methods distance()
        System.out.println(c2.getCircumference());
// which version?
        System.out.println(c2.distance(c1));


        MyTriangle t1 = new MyTriangle(1,1,2,2,3,3);  // Test constructor

// Test toString()
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());






}}





