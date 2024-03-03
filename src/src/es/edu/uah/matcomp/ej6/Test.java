package es.edu.uah.matcomp.ej6;

import es.edu.uah.matcomp.ej6.Geometric.Circle;
import es.edu.uah.matcomp.ej6.Geometric.ResizableCircle;
import es.edu.uah.matcomp.ej6.Mascot.Cat;
import es.edu.uah.matcomp.ej6.Mascot.Dog;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        System.out.println(c1);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());


        ResizableCircle r1 = new ResizableCircle(2.0);
        System.out.println(r1);
        r1.resize(25);
        System.out.println(r1);

        Cat x1= new Cat("Bigotes");
        System.out.println(x1);
        Dog d1= new Dog("Tobby");
        System.out.println(d1);





    }


}
