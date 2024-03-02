package es.edu.uah.matcomp.ej2;



public class Customer2 {
    private Integer id;
    private String name;
    private char gender ;

    public Customer2(Integer id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return "name= "+name +""+id;
    }

}