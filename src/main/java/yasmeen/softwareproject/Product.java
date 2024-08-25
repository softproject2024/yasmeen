
package yasmeen.softwareproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Product {

    public static Date stringToDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {

            return null;
        }
    }

    public static String dateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    private int price;
    private final String name;
    public String getname(){
        return name;
    }
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
