/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yasmeen.softwareproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class orders {
private String productname;
private int quantity;
private int profit;
String status;
public orders(String productname,int quantity,int profit,String status){
 this.productname=new String(productname);
 this.profit=profit;
 this.quantity=quantity;
 this.status=new String(status);
}
public int getprofit(){
    return profit;
}
public String getname(){
    return productname;
}
public void updatestatus(String status){
    JOptionPane.showMessageDialog(null, "The New Status of the order is : "+status);
    this.status=new String(status);
}
}
