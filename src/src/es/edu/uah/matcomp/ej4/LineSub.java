package es.edu.uah.matcomp.ej4;

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
    public int getEndX() { ... }
    public int getEndY() { ... }

    public void setBeginX(...) { ... }
    public void setBeginY(...) { ... }
    public void setBeginXY(...) { ... }
    public void setEndX(...) { ... }
    public void setEndY(...) { ... }
    public void setEndXY(...) { ... }

    public int getLength() { ... }       // Length of the line
    public double getGradient() { ... }

}
