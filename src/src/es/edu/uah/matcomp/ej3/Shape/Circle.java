package es.edu.uah.matcomp.ej3.Shape;

public  class Circle extends Shape {
    private double radius=1.0;

    public Circle(){
        super("red",true);
        this.radius=1.0;
    }
    public Circle(double radius){
        super("circle",true);

        this.radius=radius;

    }
    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString()+
                "radius=" + radius +
                '}';
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
