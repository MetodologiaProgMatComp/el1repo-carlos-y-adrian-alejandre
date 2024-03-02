package es.edu.uah.matcomp.ej4;

public class Line {

    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line(Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;

    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);// construct the Points here
    }

    // Public methods


    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point p) {
        this.begin = p;
    }

    public void setEnd(Point p) {
        this.end = p;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public double getLength() {
     // Length of the line
        int xDiff;
        int yDiff;
        xDiff=begin.getX()-end.getX();
        yDiff=begin.getX()-end.getY();
        return( Math.sqrt(xDiff*xDiff +yDiff*yDiff));
    }
    public double getGradient() {
        // Gradient in radians
        int xDiff;
        int yDiff;
        xDiff=begin.getX()-end.getX();
        yDiff=begin.getX()-end.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
