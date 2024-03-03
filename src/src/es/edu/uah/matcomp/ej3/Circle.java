package es.edu.uah.matcomp.ej3;

public class Circle {
    private double radius ;
    private String color ;



    public Circle(double r , String c ){
        color=c;
        radius=r;

    }
    public Circle(double r){
        radius=r;
        color="red";
    }
    public Circle(){
        radius=1.0;
        color="red";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "Circle [ "+ "radius "+radius+ ", color = "+ color;
    }
}
