package es.edu.uah.matcomp.ej3;

public class Person {
    private String name;
    private String adress;
    public Person(){
        name="Pepe";
        adress="Santiago Bernabeu";
    }

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;

    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String toString(){
        return "Person [ name = "+ name +", address = "+ adress;
    }
}
