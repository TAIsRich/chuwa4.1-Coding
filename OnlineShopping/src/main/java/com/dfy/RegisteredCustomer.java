package com.dfy;

import java.util.HashMap;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 3:22 PM
 */
public class RegisteredCustomer extends Customer {

    private String userID;
    private String passWord;
    private HashMap<Integer, Order> orderMap;

    public RegisteredCustomer(String userID, String passWord) {
        this.userID = userID;
        this.passWord = passWord;
        this.orderMap = new HashMap<>();
    }

    public void placeOrder(Order order) {
        int id = order.getOrderId();
        orderMap.put(id, order);
    }

    public void removeOrder(Order order) {
        int id = order.getOrderId();
        boolean b = orderMap.remove(id, order);
        if (b) {
            System.out.println("The order has been removed.");
        } else throw new RuntimeException("There's no such an order.");
    }








}
