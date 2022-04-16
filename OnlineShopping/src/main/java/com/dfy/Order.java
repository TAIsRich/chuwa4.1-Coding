package com.dfy;

import java.util.HashMap;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 3:29 PM
 */
public class Order {
    private int orderId;
    private float orderPrice ;
    private HashMap<Integer, Float> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderPrice = 0.F;
        this.items = new HashMap<>();
    }

    public int getOrderId() {
        return this.orderId;
    }

    public float getOrderPrice() {
        return this.orderPrice;
    }


    public void addItem(Item i) {
        int key = i.getId();
        float value = i.getPrice();
        if (items.containsKey(key)) {
            value += items.get(key);
        }
        items.put(key, value);
        this.orderPrice += i.getPrice();
    }

    public void cancelItem(Item i) {
        int key = i.getId();
        float value = i.getPrice();
        if (!items.containsKey(key)) {
            throw new RuntimeException("There's no such an item.");
        } else {
            value -= items.get(key);
            items.put(key, value);
        }
        this.orderPrice -= i.getPrice();
    }




}
