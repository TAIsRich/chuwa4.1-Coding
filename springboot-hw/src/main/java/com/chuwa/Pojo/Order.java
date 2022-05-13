package com.chuwa.Pojo;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "PRODUCT_NAME")
    String product_name;

    @Column(name = "AMOUNT")
    Double amount;

    @Column(name = "UNIT_PRICE")
    Double unit_price;

    @Column(name = "CREATE_DATE")
     @CreationTimestamp
    Date create_date;

    @Column(name = "UPDATE_DATE")
    @CreationTimestamp
    Date update_date;

    public Order() {
    }

    public Order(Long id, String product_name, Double amount, Double unit_price, Date create_date, Date update_date) {
        this.id = id;
        this.product_name = product_name;
        this.amount = amount;
        this.unit_price = unit_price;
        this.create_date = create_date;
        this.update_date = update_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
}
