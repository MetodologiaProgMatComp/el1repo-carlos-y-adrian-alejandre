package es.edu.uah.matcomp.ej1;

public class Account {
    private String id ;
    private String name;
    private Integer balance;
    public Account(){
        id="1119";
        name="Pepe";
        balance=999;
    }

    public Account(String i , String n){
        id=i;
        name=n;
        balance=0;
    }
    public Account(String i , String n , Integer b){
        id=i;
        name=n;
        balance=b;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name ;
    }
    public Integer getBalance(){
        return balance;
    }
    public Integer credit(Integer amount){
        this.balance=balance+amount;
        return this.balance;
    }
    public Integer debit(Integer amount){
        if (amount<=balance){
            this.balance=balance-amount;
            return this.balance ;
        } else{
            System.out.println("No se puede");
            return balance ;
        }
    }
    public Integer transferTo(Account another,Integer amount){
        if (amount<=balance){
            balance-=amount ;
            another.balance+=amount;
            return balance;

        } else{
            System.out.println("No se puede");
            return balance ;
        }

    }
    public String toString(){
        return "InvoiceItem[Id= "+id+" name = "+name+"balance = "+balance+"]";
    }
}

