package es.edu.uah.matcomp.ej3;

public class Staff extends Person{
    private String school ;
    private double pay;
    public Staff(){
        super("Pepe","Bernabeu");
        school="San Gabriel";
        pay=25;


    }

    public Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString(){
        return "Staff : subclass of " + super.toString() // use Circle's toString()
                + " school = " + school + " pay = " + pay ;
    }


}
