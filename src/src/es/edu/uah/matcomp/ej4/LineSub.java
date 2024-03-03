package es.edu.uah.matcomp.ej4;

import javax.swing.event.MenuDragMouseEvent;
/*
public class LineSub extends Point {
    private Point end;
    // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point

    @Override
    public String toString() {
        return "LineSub{ begin= "+ super.toString() +
                "end=" + end +
                '}';
    }

    public Point getBegin() {


        return Point.getX()+Point.getY();
    }
    public Point getEnd() {

        return end;
    }
    public void setBegin(int x,int y) {
       super(x,y);

    }
    public void setEnd(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public int getBeginX() {
        return
    }
    public int getBeginY() { ... }
    public int getEndX() { return end.getX(); }
    public int getEndY() { return end.getY(); }

    public void setBeginX(int x) { Point.setX(x); }
    public void setBeginY(int y) {Point.setY(y); }
    public void setBeginXY(...) { ... }
    public void setEndX(int x) {end.setX(x); }
    public void setEndY(int y) {end.setY(y);}
    public void setEndXY(int x, int y) {end.setX(x);
    end.setY(y);}

     public double getLength() {
        // Length of the line
        int xDiff;
        int yDiff;
        xDiff=begin.getX()-end.getX();
        yDiff=begin.getX()-end.getY();
        return( Math.sqrt(xDiff*xDiff +yDiff*yDiff));
    } }       // Length of the line
    public double getGradient() {
        int xDiff;
        int yDiff;
        xDiff=begin.getX()- end.getX();
        yDiff=begin.getX()-end.getY();
        return Math.atan2(yDiff, xDiff);
    }

}
*/