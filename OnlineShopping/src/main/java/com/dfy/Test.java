package com.dfy;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 4:27 PM
 */
public class Test {


    public static void test1(){

        Item i1 = new Item(101, 10.0F, "hat");
        Item i2 = new Item(102, 20.0F, "skirt");
        Item i3 = new Item(103, 15.7F, "top");
        Item i4 = new Item(104, 38.9F, "glass");
        Item i5 = new Item(105, 26.5F, "book");
        Item i6 = new Item(106, 12.3F, "cream");

        Order order1= new Order(2067);
        order1.addItem(i1);
        order1.addItem(i4);
        order1.addItem(i3);
        order1.cancelItem(i3);
        System.out.println("order price: " + order1.getOrderPrice());
    }


    public static void main(String[] args) {
        test1();

    }

}


