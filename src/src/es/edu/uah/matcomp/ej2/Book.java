package es.edu.uah.matcomp.ej2;


public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty=0;
    public Book( String n, Author a, double p, int q, Author as){
        name=n;
        author=a;
        price=p;
        qty=q;
        author=as;

    }
    public Book(String n, Author a, double p, int as){
        name=n;
        author=a;
        price=p;



    }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    public void setPrice(double newPrice){
        price=newPrice;

    }
    public void setQty(int newQty){
        qty=newQty;
    }

    @Override
    public String toString() {

        return ("Book[name= "+ name+ " ,"+author.toString() );

    }

    //EXTRA

    public String getAuthorNames(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }
}

