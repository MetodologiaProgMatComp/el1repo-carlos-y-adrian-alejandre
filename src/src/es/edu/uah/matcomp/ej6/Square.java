package es.edu.uah.matcomp.ej6;

public class Square extends Rectangle  {

    public Square(double side) {
        super(side,side );
    }
    public Square(){
        super(0,0);
    }
    public Square(double side , String color, Boolean filled){
        super(color,filled,side,side);
    }
    public double getSide(){
        return(getWidth());
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public String toString(){
        return "Square["+super.toString();
    }
}
