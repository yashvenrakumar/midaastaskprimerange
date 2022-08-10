package restapi.com.midass.restapi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dbms")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "Product")
    private int id;

    @Column(name = "Num_A ")
    private int a;

    @Column(name = "Num_B")
    private int b;
    @Column(name = "Range")
    private ArrayList<Integer> range;

    @Column(name = "Starting_TIme")
    private String timestamp;

    @Column(name = "Time_After_Process")
    private String timeelapsed;

    Product() {

    }

    Product(int id, int a, int b, ArrayList<Integer> range, String timestamp, String timeelapsed) {
        this.id = id;
        this.a = a;
        this.b = b;
        this.range = range;
        this.timestamp = timestamp;
        this.timeelapsed = timeelapsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public ArrayList<Integer> getRange() {
        return range;
    }

    public void setRange(ArrayList<Integer> range) {
        this.range = range;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimeelapsed() {
        return timeelapsed;
    }

    public void setTimeelapsed(String timeelapsed) {
        this.timeelapsed = timeelapsed;
    }

}