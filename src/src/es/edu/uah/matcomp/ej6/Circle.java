package es.edu.uah.matcomp.ej6;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        super();
        radius=1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius*radius*Math.PI ;
    }


    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Circle : subclass of " + super.toString() // use Circle's toString()
                + " radius =" + radius  ;
    }
}
