package es.edu.uah.matcomp.ej1;

public class Circle {
    //se establecen los atributos privados los cuales no son accesibles para los usuarios externos

    private double radius;



    private String color;



    public Circle(){
        //Establece los valors prederminados del radio del circulo y el color
        this.radius=1.0;
        color="red";

    }

    //Construye un círculo con un radio y color dados
    public Circle(double r){
        this.radius=radius;
        color="red";
    }

    public Circle(double r, String c) {
        this.radius=r;
        color=c;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String getColor(){
        return color;
    }
    public  void setRadius(double newRadius){
        radius=newRadius;

    }

    public void setColor(String newColor){
        this.color=newColor;
    }

    public String toString(){
        return "es.edu.uah.matcomp.ej1.Circle[radius="+radius+"color="+ color+"]";
    }

    public double getCircumference(){
        return (Math.PI*2*radius);

    }




}
