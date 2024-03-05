package es.edu.uah.matcomp.ej6;

import es.edu.uah.matcomp.ej6.Geometric.GeometricObject;

public class Circle62 implements GeometricObject{
    protected double radius;

    public Circle62(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return " Circle [ radius ="+ radius;
    }
    @Override
    public double getArea() {
        return radius*radius*Math.PI ;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
