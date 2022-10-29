package de.hsaa.projektseminar.usermanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_TABLE")
public class Product {

    @Id
    private int id;
    private String name;
    private String currency;
    private int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public int getPrice() {
        return price;
    }
}
