package es.edu.uah.matcomp.ej2;

import java.util.Arrays;

public class BookArrays  {



    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;
    public BookArrays( String n, Author[] a, double p, int q){
        name=n;
        authors=a;
        price=p;
        qty=q;


    }


    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public void setPrice(double newPrice){
        price=newPrice;

    }
    public void setQty(int newQty){
        qty=newQty;
    }

    @Override
    public String toString() {
        String autores = "";
        //
        //Recorrer el array de autores para extraer el nombre de cada uno y concatenarlo en "autores"

        return ("Book[name= " + name+ "autor= "+ Arrays.toString(authors)+ "price= "+price+"qty= "+ qty );
    }

    //EXTRA

    public String getAuthorNames(){

        return authors[0].getName()+authors[1].getName();

    }
    public String getAuthorEmail(){
        return authors[0].getEmail()+authors[1].getEmail();

    }


}




