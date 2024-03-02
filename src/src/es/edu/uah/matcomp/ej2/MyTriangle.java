package es.edu.uah.matcomp.ej2;

public class MyTriangle {
    private MyPoint v1= new MyPoint();
    private MyPoint v2= new MyPoint();
    private MyPoint v3= new MyPoint();

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
    }
    public MyTriangle(MyPoint x1, MyPoint x2, MyPoint x3){
        v1.setX(x1.getX());
        v2.setX(x2.getX());
        v3.setX(x3.getX());
        v1.setY(x1.getY());
        v1.setY(x1.getY());
        v1.setY(x1.getY());
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
    public double getPerimeter(){
        double lado1= new MyLine(v1,v2).getLength();
        double lado2= new MyLine(v1,v3).getLength();
        double lado3= new MyLine(v2,v3).getLength();
;
       double i= lado3+lado2+lado1;
        return i;

    }
    public String getType(){
        double lado1= new MyLine(v1,v2).getLength();
        double lado2= new MyLine(v1,v3).getLength();
        double lado3= new MyLine(v2,v3).getLength();

        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero"; // Todos los lados son iguales
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles"; // Al menos dos lados son iguales
        } else {
            return "escaleno"; // Todos los lados son diferentes
        }
    }

    }

