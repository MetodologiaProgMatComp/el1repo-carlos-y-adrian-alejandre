package es.edu.uah.matcomp.ej1;

public class TestCirculo{
    public static void main(String[] args){
        //Se crea una nueva variable asociada al círculo
        Circle c1=new Circle();

        //Se otra nueva varaiable asociada al círculo

        System.out.println("The circle has radius of"+ c1.getRadius()+"and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + "and area of "+ c2.getArea());

        Circle c3=new Circle(3.0,"blue");
        System.out.print("The circle has raidus of "+ c3.getRadius()+ "area of " + c3.getArea()+ "and it´s color is"+ c3.getColor());

        Circle c4= new Circle();
        c4.setRadius(5.5);
        System.out.println("radius is: "+ c4.getRadius());
        c4.setColor("green");
        /* System.out.println(c4.setRadius(4.4));*/

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator "+ "invokes toString() too: "+ c6 );





    }
}