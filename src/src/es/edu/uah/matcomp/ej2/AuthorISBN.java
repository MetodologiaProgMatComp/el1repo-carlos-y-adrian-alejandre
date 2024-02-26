package es.edu.uah.matcomp.ej2;

public class AuthorISBN {
    private String name;
    private String email;

    public AuthorISBN( String n, String e){
         name=n;
         email=e;

    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AuthorISBN{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
