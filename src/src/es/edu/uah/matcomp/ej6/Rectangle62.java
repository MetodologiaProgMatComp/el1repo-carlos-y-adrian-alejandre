package es.edu.uah.matcomp.ej6;

import es.edu.uah.matcomp.ej6.Geometric.GeometricObject;

public class Rectangle62 implements GeometricObject{
    protected double widht;
    protected double lenght;

    public Rectangle62(double widht, double lenght) {
        this.widht = widht;
        this.lenght = lenght;
    }
    public String toString(){
        return " Rectangle [ width = "+ widht + ", lenght = "+ lenght;
    }
    @Override
    public double getArea() {
        return widht*lenght ;
    }

    @Override
    public double getPerimeter() {
        return 2*lenght+2*widht;
    }
}
