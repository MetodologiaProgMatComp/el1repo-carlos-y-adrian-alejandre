package es.edu.uah.matcomp.ej3.Animal;

public class Mammal extends Xnimal {
    public Mammal(String name){
        super(name);
    }
    public String toString(){
        return "Mammal:"+ super.toString();
    }
}
