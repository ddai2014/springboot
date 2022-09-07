package com.ddai.order;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id private final int id;
    private final String name;
    private final int quantity;
    private final double price;

    public Order() {
        this (1, "default", 1, 1.99);
    }

    public Order(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }    

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Order: {name=").append(name).
        append(", id=").append(id).
        append(", quantity=").append(quantity).
        append(", price=").append(price).append('}');

        return sb.toString();
    }
}
