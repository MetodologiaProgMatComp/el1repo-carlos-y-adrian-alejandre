package es.edu.uah.matcomp.ej1;

public class Rectangle {
private float lenght;
private float width;
public Rectangle() {
    this.lenght=1.0f;
    this.width=1.0f;
}

public Rectangle(float l, float w){
    lenght=l;
    width=w;
}
public float getLenght(){
    return lenght;
}
public float getWidth(){
    return width;
}
public float getArea(){
    return lenght*width;
}
public float getPerimeter(){
    return (2*lenght)+(2*width);
}
public void setLenght(float newLenght){
    this.lenght= newLenght;
}
public void setWidth(float newWidht){
    this.width= newWidht;
}
public String toString(){
 return  "es.edu.uah.matcomp.ej1.Circle[lenght="+ lenght+ " width= "+ width+ "]";
}
}

