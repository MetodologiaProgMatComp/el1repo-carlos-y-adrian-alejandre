package es.edu.uah.matcomp.ej1;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }
    public Time(){
        hour=1;
        minute=1;
        second=1;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

    public void setMinute(int newMinute) {
        this.minute = newMinute;
    }

    public void setSecond(int newSecond) {
        this.second = newSecond;
    }

    public void setTime(int newHour, int newSecond, int newMinute) {
        hour = newHour;
        minute = newMinute;
        second = newSecond;
    }

    public String toString() {

        if (hour>=10){
            if (minute>=10)
            {
                if (second>=10){
                    return (hour + ":" + minute + ":" + second);
                }
                else {
                    return (+hour + ":" +minute + ":" + "0"+second);
                }
            }
            else{
                if (second>=10){
                    return (hour + ":" + "0"+minute + ":" + second);
                }
                else{
                    return (hour + ":" + "0"+minute + ":" + "0"+second);
                }


            }
        }
        else {
            if (minute>=10)
            {
                if (second>=10){
                    return ("0"+hour + ":" + minute + ":" + second);
                }
                else {
                    return ("0"+hour + ":" +minute + ":" + "0"+second);
                }
            }
            else{
                if (second>=10){
                    return ("0"+hour + ":" + "0"+minute + ":" + second);
                }
                else{
                    return ("0"+hour + ":" + "0"+minute + ":" + "0"+second);
                }


            }

        }


    }
    public String nextSecond(){
        if (second+1==60){
            second=0;

            if (minute+1==60) {
                minute=0;
                hour += 1;
            }
            else{
                minute+=1;
            }


        }
        else{
            second+=1;

        }
        if (hour>=10){
            if (minute>=10)
            {
                if (second>=10){
                    return (hour + ":" + minute + ":" + second);
                }
                else {
                    return (+hour + ":" + "0"+minute + ":" + second);
                }
            }
            else{
                if (second>=10){
                    return (hour + ":" + "0"+minute + ":" + second);
                }
                else{
                    return (hour + ":" + "0"+minute + ":" + "0"+second);
                }


            }
        }
        else {
            if (minute>=10)
            {
                if (second>=10){
                    return (hour + ":" + minute + ":" + second);
                }
                else {
                    return (+hour + ":" + "0"+minute + ":" + second);
                }
            }
            else{
                if (second>=10){
                    return (hour + ":" + minute + ":" + second);
                }
                else{
                    return (hour + ":" + minute + ":" + "0"+second);
                }


            }

        }

    }
    public String previousSecond(){
        if (second-1==-1){
            second=59;

            if (minute-1==-1){
                minute=59;
                hour-=1;
            }
            else{
                minute=minute-1;
            }

        }
        else{
            second-=1;
        }

        if (hour>=10){
            if (minute>=10)
            {
                if (second>=10){
                    return (hour + ":" + minute + ":" + second);
                }
                else {
                    return (+hour + ":" + "0"+minute + ":" + second);
                }
            }
            else{
                if (second>=10){
                    return (hour + ":" + "0"+minute + ":" + second);
                }
                else{
                    return (hour + ":" + "0"+minute + ":" + "0"+second);
                }


            }
        }
        else {
            if (minute>=10)
            {
                if (second>=10){
                    return (hour + ":" + minute + ":" + second);
                }
                else {
                    return (+hour + ":" + "0"+minute + ":" + second);
                }
            }
            else{
                if (second>=10){
                    return (hour + ":" + minute + ":" + second);
                }
                else{
                    return (hour + ":" + minute + ":" + "0"+second);
                }


            }

        }

    }
}
