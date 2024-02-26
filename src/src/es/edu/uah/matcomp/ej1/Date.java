package es.edu.uah.matcomp.ej1;

public class Date {

    private int day;
    private int month;
    private int year;
    public Date(){
        day=1;
        month=1;
        year=1;
    }
    public Date(int d, int m, int y){
        this.day=d;
        this.month=m;
        this.year=y;

    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public void setDay(int newDay){
        day= newDay;
    }
    public void setMonth( int newMonth){
        month=newMonth;
    }
    public void setYear(int newYear){
        year=newYear;
    }
    public void setDate(int newDay, int newMonth, int newYear){
        day=newDay;
        month=newMonth;
        year=newYear;
    }

    public String toString(){
        return (day+"/"+month+"/"+year);
    }

}


