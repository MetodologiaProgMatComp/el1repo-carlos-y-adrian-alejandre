package es.edu.uah.matcomp.ej2;

public class MyLine {
    private MyPoint begin= new MyPoint();
    private MyPoint end= new MyPoint();
    public MyLine(int x1, int y1, int x2, int y2){
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);


    }
    public MyLine(MyPoint b, MyPoint e){
        begin.setX(b.getX());
        begin.setY(b.getY());
        end.setX(b.getX());
        end.setY(b.getY());

    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public MyPoint getBegin() {
        return begin;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public void setBeginY(int y){
        begin.setX(y);
    }
    public int getENdX() {
        return begin.getX();
    }
    public int getEndY() {
        return begin.getY();
    }
    public void setEndX(int x){
        begin.setX(x);
    }
    public void setEndY(int y){
        begin.setX(y);
    }
    public double getLength(){
        return begin.distance(end);
    }

    public int[] getBeginXY(){
        int[] XY= new int[2];
        XY[0]=this.getBeginX();
        XY[1]=this.getBeginY();
        return XY;


    }
    public void setBeginXY(int newX, int newY){
        setBeginX(newX);
        setBeginY(newY);
    }
    public int[] getEndXY(){
        int[] XY= new int[2];
        XY[0]=this.getBeginX();
        XY[1]=this.getBeginY();
        return XY;


    }
    public void setEndXY(int newX, int newY){
        setBeginX(newX);
        setBeginY(newY);
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
    public double getGradients(){
        double difX;
        double difY;
        difX=getBeginX()-getENdX();
        difY=getBeginY()-getEndY();
        return Math.atan2(difX,difX);
    }
}
