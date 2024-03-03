package es.edu.uah.matcomp.ej3;

public class Point3D extends Point2D{
    private float z ;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){
        super();
        z=0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ( float x , float y , float z){
        this.z=z;
        setX(x);
        setY(y);
    }
    public float[] getXYZ(){
        float[] result = new float[3];
        result[0]=this.getX();
        result[1]=this.getY();
        result[2]=this.getZ();
        return result;
    }
    @Override
    public String toString(){
        return "Staff : subclass of " + super.toString() // use Circle's toString()
                + " z " + z  ;
    }
}
