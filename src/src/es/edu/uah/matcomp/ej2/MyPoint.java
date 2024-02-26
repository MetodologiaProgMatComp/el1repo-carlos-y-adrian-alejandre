package es.edu.uah.matcomp.ej2;


public class MyPoint {


    private int x;
    private int y;
    public MyPoint(){
        x=0;
        y=0;
    }
    public MyPoint(int coordx, int coordy){
        x=coordx;
        y=coordy;
    }


    public int getX(){
    return x;}


    public void  setX(int newX) {
        this.x = newX;

    }
    public int getY(){
        return y;
    }
    public void setY(int newY){
        y=newY;
    }
    /*
    public int[] getXY(){
        MyPoint[] coord;
        MyPoint coordx= new MyPoint();
        coordx.setX(x);
        MyPoint coordy=new MyPoint();
        coordy.setY(y);
        coordx




    }
    public void setXY(int newY, int newX){
        y=newY;
        x=newX;
    }
    */


    @Override
    public String toString() {
        return "MyPoint{"+x+","+y+"}";

    }
    public double  distance(int distx, int disty){
        double dist;
        distx=x-distx;
        disty=y-disty;
        dist=Math.sqrt(distx^2+disty^2);


        return (dist);
    }
    public double distance(MyPoint another){
        double distx;
        double disty;
        double x2;
        double y2;
        x2=another.getX();
        y2=another.getY();
        distx=x-x2;
        disty=y-y2;

        double dist = Math.sqrt(Math.pow(distx,2) + Math.pow(disty,2));
        return dist;

    }
    public double distance(){
        double dist= Math.sqrt(x^2+y^2);
        return dist;
    }


}
