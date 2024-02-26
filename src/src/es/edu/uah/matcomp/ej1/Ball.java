package es.edu.uah.matcomp.ej1;

public class Ball {


        private float x;
        private float y;
        private int radius;
        private float xDelta;
        private float yDelta;

        public Ball(float coordx, float coordy, int r, float inx, float iny){
            x=coordx;
            y=coordy;
            radius=r;
            xDelta=inx;
            yDelta=iny;



        }
        public Ball(){
            x=0;
            y=0;
            radius=1;
            xDelta=0;
            yDelta=0;

        }

        public float getX(){
            return x;
        }
        public float getY(){
            return y;
        }
        public int getRadius(){
            return radius;
        }
        public float getXDelta(){
            return xDelta;
        }

        public float getYDelta(){
            return yDelta;
        }


        public  void setX(float newCoordx){
            x=newCoordx;

        }
        public  void setY(float newCoordy){
            y=newCoordy;
        }

        public  void setRadius(int newRadius){
            radius=newRadius;    }


        public  void setXDelta(float newDeltax){
            xDelta=newDeltax;
        }
        public  void setYDelta(float newDeltay){
            yDelta=newDeltay;
        }
        public void move(){
            x+=xDelta;
            y+=yDelta;

        }
        public void reflectHorizontal(){
            xDelta=-yDelta;
        }
        public  void reflectVertical(){
            yDelta=-xDelta;
        }
        public String toString(){
            return ("[Ball[("+x+","+y+"),"+"speed=("+ xDelta+","+yDelta+")]");
        }
    }


