package es.edu.uah.matcomp.ej3.Shape;

public class Shape {
    private String color="red";
    private boolean filled=true;
    public Shape(String c, boolean f){
        this.color=c;
        this.filled=f;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void isFilled(boolean filled){
        this.filled=filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
