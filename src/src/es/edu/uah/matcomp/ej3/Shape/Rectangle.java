package es.edu.uah.matcomp.ej3.Shape;

public class Rectangle extends Shape {
    private double widht=1.0;
    private double length=1.0;

    public Rectangle(){
        super("color",true);
        this.length=1.0;
        this.widht=1.0;
    }
    public Rectangle(String c, boolean f, double widht, double length) {
        super(c, f);
        this.widht = widht;
        this.length = length;
    }
    public double getWidht(){
        return widht;
    }
    public void setWidht(double widht){
        this.widht=widht;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return (length*widht);
    }
    public double getPerimeter(){
        return (2*length+2*widht);
    }

    @Override
    public String toString() {

        return "Rectangle{" +  super.toString()+
                "widht=" + widht +
                ", length=" + length +
                '}';
    }
}
