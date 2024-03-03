package es.edu.uah.matcomp.ej6.Geometric;

public class Circle implements GeometricObject {
    protected double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*radius*2;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Circle[radius= "+radius+"]";
    }


}
