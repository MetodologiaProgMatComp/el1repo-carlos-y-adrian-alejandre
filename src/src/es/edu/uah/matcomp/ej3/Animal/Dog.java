package es.edu.uah.matcomp.ej3.Animal;

public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Wooof");
    }
    public void greets(Dog another){
        System.out.println("Woooooooooof");
    }
    public String toString(){
        return "Dog: "+ super.toString();
    }
}
