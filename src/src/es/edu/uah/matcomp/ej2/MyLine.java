package es.edu.uah.matcomp.ej2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
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
    /*
    public double getGradients(){


    }

     */

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
