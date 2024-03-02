package es.edu.uah.matcomp.ej3.Shape;

public class Square extends Rectangle {
    public Square(){
        super("coler",true,1.0,1.0);
    }

    public Square(double side){
        super("red",true,side,side);

    }
    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }
    public double getSide(){

        return getLength();
    }
    public void setSide(double side){
        super.setWidht(side);
        super.setLength(side);

    }
    public void setWidht(double side){
        this.setWidht(side);
    }
    public void setLength(double side){
        this.setLength(side);
    }
    public String toString(){
        return "Square["+super.toString();
    }
}
