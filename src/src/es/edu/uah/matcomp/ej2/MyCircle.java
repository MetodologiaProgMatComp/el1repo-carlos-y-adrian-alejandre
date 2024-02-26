package es.edu.uah.matcomp.ej2;

public class MyCircle {
    private MyPoint center;
    private int radius;
    public MyCircle(int x, int y, int r){
        center.setX(x);
        center.setY(y);
        radius=r;
    }
    public MyCircle(MyPoint c, int r){
        center.setX(c.getX());
        center.setY(c.getY());
        radius=r;

    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterY(int y){
        center.setY(y);

    }

    @Override
    public String toString() {
        return "MyCircle{" +
                center.toString() +
                ", radius=" + radius +
                '}';
    }

    public int getCentery(){
        return center.getY();
    }
    public void setCenterX(int x){
        center.setX(x);

    }

    public int getRadius() {
        return radius;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;


    }
    public double getCircumference(){
        double circumference=2*Math.PI*radius;
        return circumference;
    }
    public double distance(MyCircle another){
        return (center.distance(another.getCenter()));
    }

}
