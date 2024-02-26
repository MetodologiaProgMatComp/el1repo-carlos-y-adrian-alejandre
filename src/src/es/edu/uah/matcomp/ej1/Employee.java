package es.edu.uah.matcomp.ej1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(){
        id=0;
        firstName="...";
        lastName="...";
        salary=99999;
    }
    public Employee(int i, String f, String l, int s){
        this.id = i;
        this.firstName= f;
        this.lastName=l;
        this.salary=s;
    }
    public int getId(){
        return id;
    }
    public String getFirsName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return " "+firstName+" "+ lastName;
    }
    public int getSalary(){
        return salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public void setSalary(int newSalary){
        salary= newSalary;
    }
    public int  raiseSalary( int percent){
        salary=salary+(salary*percent);
        return salary;
    }
    public String toString(){
        return ("es.edu.uah.matcomp.ej1.Employee[id is:"+id+"name is: "+ firstName+ lastName+ "salary is: "+ salary+"]");
    }
}
