
package yasmeen.softwareproject;

import javax.swing.JOptionPane;


public class Orders {
private final String productname;
    private final int profit;
String status;
public Orders(String productname, int profit, String status){
 this.productname= productname;
 this.profit=profit;
    this.status= status;
}
public int getprofit(){
    return profit;
}
public String getname(){
    return productname;
}
public void updatestatus(String status){
    JOptionPane.showMessageDialog(null, "The New Status of the order is : "+status);
    this.status= status;
}

}
