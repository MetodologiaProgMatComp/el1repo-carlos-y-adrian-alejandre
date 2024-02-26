package es.edu.uah.matcomp.ej1;

public class InvoiceItem {
    private Integer qty;
    private double unitPrice;

    private String id;
    private String desc;
    public InvoiceItem(){
        id="1";
        desc="x";
        qty=2;
        unitPrice=2.0;
    }

    public InvoiceItem(String i , String d, Integer q, double u ){
        id=i;
        desc=d;
        qty=q;
        unitPrice=u;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public Integer getQty(){
        return qty;
    }
    public void setQty(Integer newQty){
        qty=newQty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double newUnitprice){
        unitPrice=newUnitprice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "InvoiceItem[Id= "+id+" desc = "+desc+"qty = "+qty+"unitPrice = "+unitPrice+"]";
}
}
