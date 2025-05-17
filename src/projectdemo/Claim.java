package projectdemo;

import java.io.Serializable;
import java.time.LocalDate;

public class Claim implements Serializable {
    private String name;
    private String location;
    private double amount;
    private LocalDate date;
    private String description;
    private String type;


   public Claim(String name, String location, double amount, LocalDate date, String description, String type) {
        this.name = name;
        this.location = location;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.type = type;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
