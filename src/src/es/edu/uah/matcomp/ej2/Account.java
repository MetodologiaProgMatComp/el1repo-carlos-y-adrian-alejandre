package es.edu.uah.matcomp.ej2;



public class Account {
    private Integer id;
    private Customer2 customer2;
    private double balance;

    public Account(Integer id, Customer2 customer2, double balance) {
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }

    public Account(Integer id, Customer2 customer2) {
        this.id = id;
        this.customer2 = customer2;
        balance=0.0;
    }

    public Integer getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return "name = "+ customer2.getName()+" balance = "+ getCustomer2();
    }
    public String getCustomerName(){
        return customer2.getName();
    }
    public double deposit(double amount){
        balance= amount+balance;

    return balance;
    }
    public Account (double amount){
        if ( balance>=amount){
            balance=amount-balance ;
        }else{
            System.out.println("amount withdrawn exceeds the current balance");
        }
    }
}