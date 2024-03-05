package es.edu.uah.matcomp.ej6;

public class TestMovablePoint {
    public static void main (String[] args) {
        MovablePoint c3 = new MovablePoint(2,3,5,6);
        System.out.println("Movable Point:"+c3);
        c3.movedown();
        System.out.println("Movable Point:"+c3);
        c3.moveleft();
        System.out.println("Movable Point:"+c3);
        c3.moveright();
        System.out.println("Movable Point:"+c3);
        c3.moveup();
        System.out.println("Movable Point:"+c3);
    }

}
