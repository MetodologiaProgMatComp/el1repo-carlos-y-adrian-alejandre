package es.edu.uah.matcomp.ej3.Animal;

public class Xnimal {
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Xnimal(String name){
        this.name=name;
    }
}
