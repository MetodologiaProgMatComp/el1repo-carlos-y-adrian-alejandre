package es.edu.uah.matcomp.ej6;

public class TestMovableCircle {
    public static void main (String[] args) {
        MovablePoint p1=new MovablePoint(7,4,5,3);
        MovableCircle c3 = new MovableCircle(2,p1);
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
