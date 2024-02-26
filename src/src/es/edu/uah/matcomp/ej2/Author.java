package es.edu.uah.matcomp.ej2;

public class Author {
    private String name;
    private String email;
    private char gender;


    public Author(String n, String e, char g){
        name=n;
        email=e;
        gender=g;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;

    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String newEmail){
        email=newEmail;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
