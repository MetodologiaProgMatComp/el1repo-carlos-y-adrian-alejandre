package es.edu.uah.matcomp.ej6.Mascot;

import es.edu.uah.matcomp.ej6.Mascot.Animal;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
}
