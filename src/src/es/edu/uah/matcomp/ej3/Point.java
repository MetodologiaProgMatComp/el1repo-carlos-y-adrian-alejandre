package es.edu.uah.matcomp.ej3;

public class Point {
    private float x=0.0f;
    private float y=0.0f;
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        x=0;
        y=0;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;

    }
    public float[] getXY(){
        float[] coord = new float[2];
        coord[0]=this.x;
        coord[1]=this.y;

        return coord;
    }


    public  String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
