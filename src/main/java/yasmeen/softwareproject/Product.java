/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yasmeen.softwareproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Product {

    private Date stringToDate(String dateString) {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return DATE_FORMAT.parse(dateString);
        } catch (ParseException e) {

            return null;
        }
    }

    public String dateToString(Date date) {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        return DATE_FORMAT.format(date);
    }

    private int price;
    private final String name;
    private Date expire;
    private int quantity;
    int discount;
    String discription;
String path;
    public Product(String name, int price, int quantity, String date, int discount,String description,String path) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.expire = stringToDate(date);
        this.discount = discount;
        this.discription=description;
        this.path=path;
    }
public String getpath(){
    return path;
}
    public String getname() {
        return name;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int newquantity) {
        quantity = newquantity;
    }

    public void updateexpire(String expire) {
        this.expire = stringToDate(expire);
    }

    public String getexpire() {
        return dateToString(expire);
    }

    public void updateprice(int price) {
        this.price = price;
    }

    public int getprice() {
        return price;
    }

    public void updatediscount(int discount) {
        if (discount >= 100 || discount < 0) {
            JOptionPane.showMessageDialog(null, "The discount cannot be 100 or over or less than 0");
        } else {
            this.discount = discount;
        }
    }

    public int getdiscount() {
        return discount;
    }
}
