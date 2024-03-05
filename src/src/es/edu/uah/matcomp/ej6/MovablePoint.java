package es.edu.uah.matcomp.ej6;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "("+x+","+y+")"+"Speed = ( "+ xSpeed+","+ySpeed+")";
    }

    @Override
    public void movedown() {
        y+=ySpeed;
    }

    @Override
    public void moveleft() {
        x-=xSpeed;
    }

    @Override
    public void moveright() {
        x+=xSpeed;
    }

    @Override
    public void moveup() {
        y=-ySpeed;
    }
}
