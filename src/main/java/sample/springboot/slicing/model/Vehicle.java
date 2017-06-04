package sample.springboot.slicing.model;

import javax.persistence.*;

/**
 * Created by imran on 6/4/17.
 */
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;


    public Vehicle(){}

    public Vehicle(String make,String model){
        this.make=make;
        this.model=model;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
