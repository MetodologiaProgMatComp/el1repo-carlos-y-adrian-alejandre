package es.edu.uah.matcomp.ej6;

public abstract class Shape {
    protected String color ;
    protected Boolean filled ;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape (){
        color="red";
        filled = Boolean.TRUE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public Boolean isFilled(){
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape [ "+ color +" , "+ filled+" ]";
    }


}
