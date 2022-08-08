package aa.aswe.eww;

import java.util.*;
// import java.time.LocalDateTime;

public class user {
    int a;
    int b;
    int noofprime;
    ArrayList<Integer> listofprime;
    String timestamp;
    String timeelapsed;

    user(int a, int b, int noofprime, ArrayList<Integer> listofprime, String timestamp, String timeelapsed) {
        this.a = a;
        this.b = b;
        this.noofprime = noofprime;
        this.listofprime = listofprime;
        this.timestamp = timestamp;
        this.timeelapsed = timeelapsed;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getNoofprime() {
        return noofprime;
    }

    public ArrayList<Integer> getListofprime() {
        return listofprime;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTimeelapsed() {
        return timeelapsed;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setNoofprime(int noofprime) {
        this.noofprime = noofprime;
    }

    public void setListofprime(ArrayList<Integer> listofprime) {
        this.listofprime = listofprime;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setTimeelapsed(String timeelapsed) {
        this.timeelapsed = timeelapsed;
    }
    // public static void main(String[] args) {
    // LocalDateTime myObj = LocalDateTime.now();

    // long startTime = System.currentTimeMillis();
    // System.out.println(myObj + ":::" + startTime);

    // for (int i = 0; i < 1000000000; i++) {
    // for (int j = 0; j < 1000000000; j++) {

    // continue;

    // }
    // }
    // long current = System.currentTimeMillis();
    // System.out.println(current);
    // long estimatedTime = System.currentTimeMillis() - startTime;
    // System.out.println(myObj + " :: " + estimatedTime);
    // }
}
