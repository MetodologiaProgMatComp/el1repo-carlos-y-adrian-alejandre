package es.edu.uah.matcomp.ej6.Geometric;

import es.edu.uah.matcomp.ej6.Geometric.Circle;
import es.edu.uah.matcomp.ej6.Geometric.Resizable;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);


    }

    public String toString(){
        return "ResizableCircle[ Circle[radius= "+radius;
    }
    @Override
    public void resize(int percent){
        radius*=percent/100.0;
    }



}
