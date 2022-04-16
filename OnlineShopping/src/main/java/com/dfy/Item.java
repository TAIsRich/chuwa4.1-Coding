package com.dfy;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 3:28 PM
 */
public class Item {
    int itemId;
    float itemPrice;
    String description;

    public Item(int itemId, float itemPrice, String description) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.description = description;
    }

    public int getId() {
        return itemId;
    }

    public float getPrice() {
        return itemPrice;
    }

    public String getDescription() {
        return description;
    }

}
