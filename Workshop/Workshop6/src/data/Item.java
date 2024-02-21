/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author lvhho
 */
public class Item {
    private String itemName;
    private String groupProduct;
    private Double priceOrigin;
    private int itemCode; // is a self-incrementing 8-digit number
    //Constructor
    public Item( int itemCode, String itemName, String groupProduct, Double priceOrigin) {
        this.itemName = itemName;
        this.groupProduct = groupProduct;
        this.priceOrigin = priceOrigin;
        this.itemCode = itemCode;
    }
    //Getter & Setter

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getGroupProduct() {
        return groupProduct;
    }

    public void setGroupProduct(String groupProduct) {
        this.groupProduct = groupProduct;
    }

    public Double getPriceOrigin() {
        return priceOrigin;
    }

    public void setPriceOrigin(Double priceOrigin) {
        this.priceOrigin = priceOrigin;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }
    //show line information of item
    public void showLineInfo() {
        System.out.printf("|%8d|%-15s|%-20s|%5.2f|\n", itemCode, itemName, groupProduct, priceOrigin);
    }
}
