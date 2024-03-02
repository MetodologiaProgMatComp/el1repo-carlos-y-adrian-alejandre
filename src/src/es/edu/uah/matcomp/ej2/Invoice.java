package  es.edu.uah.matcomp.ej2;

public class Invoice {
    private Integer id;
    private Customer1 cliente;
    private double amount;

    public Invoice(Integer i,Customer1 c,double a){
        id=i;
        cliente=c;
        amount=a;
    }

    public Integer getId() {
        return id;
    }

    public Customer1 getCliente() {
        return cliente;
    }

    public void setCliente(Customer1 newCliente){
        cliente=newCliente;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Integer getCustomerId(){
        return cliente.getId();
    }
    public String getCustomerName(){
        return cliente.getName();

    }
    public Integer getCustomerDiscount(){
        return cliente.getDiscount();
    }
    public double getAmountAfterDiscount(){
        amount-= cliente.getDiscount();
        return amount;
    }
    public String toString(){
        return "Invoice [ id = "+id+" , customer = "+getCustomerName()+"("+ getCustomerId()+ getCustomerDiscount() + "amount= "+amount;
    }

}