package es.edu.uah.matcomp.ej6;

public class MovableCircle implements Movable{
    private int radius;
    private  MovablePoint movablePoint;

    public MovableCircle(int radius, MovablePoint movablePoint) {
        this.radius = radius;
        this.movablePoint = movablePoint;
    }
    @Override
    public void movedown() {
        movablePoint.movedown();
    }

    @Override
    public void moveleft() {
        movablePoint.moveleft();
    }

    @Override
    public void moveright() {
        movablePoint.moveright();
    }

    @Override

    public void moveup() {
        movablePoint.moveup();
    }

    public String toString(){
        return " Movable Point , "+ movablePoint + " radius = "+ radius;
    }

}
