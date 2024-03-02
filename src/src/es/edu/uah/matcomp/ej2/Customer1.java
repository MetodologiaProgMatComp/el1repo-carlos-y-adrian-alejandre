package  es.edu.uah.matcomp.ej2;

public class Customer1 {
    private Integer id;
    private String name;
    private Integer discount;

    public Customer1(Integer i,String n,Integer d){
        id=i;
        name=n;
        discount=d;
    }

    public  Integer getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public String toString(){
        return "name :"+id+""+discount+"%";
    }
}
