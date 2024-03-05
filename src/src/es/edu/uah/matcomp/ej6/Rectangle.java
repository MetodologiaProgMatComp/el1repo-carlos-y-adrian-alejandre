package es.edu.uah.matcomp.ej6;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        super();
        width=1.0;
        length=1.0;
    }

    public Rectangle(String color, Boolean filled, double widht, double lenght) {
        super(color, filled);
        this.width = widht;
        this.length = lenght;
    }

    public Rectangle(double widht, double lenght) {
        super();
        this.width = widht;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double widht) {
        this.width = widht;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lenght) {
        this.length = lenght;
    }
    @Override
    public double getArea() {
        return width*length ;
    }

    @Override
    public double getPerimeter() {
        return length+length+width+width;
    }
    @Override
    public String toString(){
        return "Rectangle : subclass of " + super.toString() // use Circle's toString()
                + " width =" + width + " lenght "+ length  ;
    }
}

