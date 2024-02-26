package es.edu.uah.matcomp.ej2;

public class BookISBN {
    private String isbn;
    private AuthorISBN author;
    private double price;
    private String name;
    private int qty=0;

    public BookISBN(String i, String n, AuthorISBN a, double p  ){
        isbn=i;
        name=n;
        author=a;
        price =p;

    }
    public BookISBN(String i, String n, AuthorISBN a, double p, int q  ){
        isbn=i;
        name=n;
        author=a;
        price =p;
        qty=q;

    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public AuthorISBN getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookISBN{" +
                "isbn='" + isbn + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                '}';
    }
    public String getAuthorName(){
        return author.getName();
    }

}
