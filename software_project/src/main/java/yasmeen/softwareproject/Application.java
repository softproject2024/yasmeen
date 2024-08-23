/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yasmeen.softwareproject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.security.SecureRandom;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class Application {




    Product carrot=new Product("tomato", 12,1000, "1/12/2024",0,"dunat is vey","C:\\\\Users\\\\nd\\\\Desktop\\\\248\\\\New folder\\\\p19.png");
    Product cucumber=new Product("cucumber", 4,999, "30/12/2024",0,"cheescake is very cool","C:\\\\Users\\\\nd\\\\Desktop\\\\248\\\\New folder\\\\p19.png");
 public static String type;
 public static int maxindex;
  public static String type2;
  public static String suppliername;
   public static String ownername;
  public static int order;
   public static String status;
 public static Account publicuser;
 public static ArrayList<Admin>Admins;
 public static ArrayList<Owneraccount>Owners;
 public static ArrayList<Suppliers>suppliers;
 public static ArrayList<User>users;
 public static ArrayList<Product>products;
 public static ArrayList<orders>sales;
 public static ArrayList<post>posts;
  public static logup loguppage;
  public static Login loginpage;
  public static Owner ownerpage;
  public static Admin1 adminpage;
   public static userpage userspage;

  public static Suppliersframe supplierspage;

 public Application(){

     type="Owner";
     type2="Owner";
     status="Complete";
 
     posts=new ArrayList<post>();
     publicuser=new Admin("",0,"",0,0);
     products=new ArrayList<>();
     products.add(carrot);
     
     products.add(cucumber);
     Admins=new ArrayList<>();
     Owners=new ArrayList<>();

     Owners.add(new Owneraccount("Yasmeen",12,"a2@g.c",1231231231,0));
     Owners.get(0).messages.add("hi");
     suppliers=new ArrayList<>();
//     suppliers.add(new Suppliers("yahya" +0, type, 0, 0));
      suppliers.add(new Suppliers("Yaqoot", 0, "a1@g.c", 0, 12121212));


     users=new ArrayList<>();
     users.add(new User("Hitler",1,"1",2,12 ));
     Admins.add(new Admin("any",1,"ad1@g.c",2112121212,12121212));
     Owners.add(new Owneraccount("nk",1,"ow1@g.c",2112121212,12121212));
    suppliers.add(new Suppliers("any",1,"su1@g.c",2112121212,12121212));

     users.add(new User("ause",1,"us1@g.c",2112121212,12121212));
     sales=new ArrayList<>();
     sales.add(new orders(products.get(1).getname(), 12, 12, status));
      sales.add(new orders(products.get(1).getname(), 14, 14, status));
       sales.add(new orders(products.get(1).getname(), 13, 13, status));
     loguppage=new logup();
     loginpage=new Login();
     ownerpage=new Owner();
     adminpage=new Admin1();
     supplierspage=new Suppliersframe();
     posts.add(new post("C:\\\\Users\\\\nd\\\\Desktop\\\\248\\\\New folder\\\\p19.png","1","1",0 ));

    userspage=new userpage();
 }
public static String getallproducts(){
    String h="There is no products in the store";
    if(!products.isEmpty()){
        h="#. Product Name   Product price   Product discount\n";
        for(int i=0;i<products.size();i++){
            h+=(i+1)+". "+products.get(i).getname()+"   "+products.get(i).getprice()+"   "+products.get(i).getdiscount()+"\n";
        }
    }

    return h;
}
 public static void  addproduct(String name,int price,int quantity,String expire,int discount,String des){
if(!isValidFutureDate(expire)){
    JOptionPane.showMessageDialog(null, "invalid expire date");

    return;
}
if(price<0||quantity<0){
    JOptionPane.showMessageDialog(null, "invalid  value");

    return;
}
  for(int i=0;i<products.size();i++){

      
      
      
      
      if(name.equals(products.get(i).getname())){
          int x=quantity+products.get(i).getquantity();
          products.get(i).setquantity(x);

          JOptionPane.showMessageDialog(null, "The quantity "+quantity+" is added to the store\n new quantity of the product : "+products.get(i).getname()+" is : "+x);
          return;
      }
  }
  String pa=adminpage.getFilePath();
  products.add(new Product(name,price,quantity,expire,discount,des,pa));
  JOptionPane.showMessageDialog(null,"The Product "+name+" is added as a new product to the store" );
 }
 public static void removeproduct(String name){

    for(int i=0;i<products.size();i++){

      if(name.equals(products.get(i).getname())){

          products.remove(i);
          JOptionPane.showMessageDialog(null, "The product "+name+" is removed ");

          return;
      }
  }
 JOptionPane.showMessageDialog(null, "The product "+name+" is not exist in the store");


 }
 public static void updateproduct(int i,int price,String expire){

   products.get(i).updateprice(price);
             products.get(i).updateexpire(expire);
          JOptionPane.showMessageDialog(null, "The information are updated");


 }
 public static void sendfeedback(String msg,Account a){
     if(a.gettype().equals("Owner")){
         for(int i=0;i<Owners.size();i++){
             if(a.getemail().equals(Owners.get(i).getemail())){
                 Owners.get(i).messages.add(msg);
             }
         }
     }else{
         for(int i=0;i<suppliers.size();i++){
             if(a.getemail().equals(suppliers.get(i).getemail())){
                 suppliers.get(i).messages.add(msg);
             }
         }
     }
 }
 public static void rate_post(int r,post m){
     for(int i=0;i<posts.size();i++){
         if(m.id==posts.get(i).id){
             posts.get(i).rates.add(r);
         }
     }
 }
 public  static void addpost(String path,String des,String prd){
     posts.add(new post(path,prd,des,0));
 }
 public static void implementdiscount(int discount,Product p){
     if(discount<0||discount>=100){
          JOptionPane.showMessageDialog(null, "The discount value is not correct");
     }
     for(int i=0;i<products.size();i++){
       if(p==products.get(i)){
            JOptionPane.showMessageDialog(null, "The new discount for the product "+p.getname()+" is : "+discount);
           products.get(i).updatediscount(discount);
       }
     }
 }
 public static Product getmaxprofit(){

  if(sales.isEmpty()){
     // JOptionPane.showMessageDialog(null, "There is no sales happend in the store");
      return null;
  }

  String productname="";
  maxindex=0;
    for(int i=0;i<sales.size();i++){

      if(maxindex<sales.get(i).getprofit()){

        maxindex=sales.get(i).getprofit();

        productname=sales.get(i).getname();
      }
  }

      for(int i=0;i<products.size();i++){

      if(productname.equals(products.get(i).getname())){
       return products.get(i);

      }
  }
   return null;
 }
 public static String getsalesmessage(){
      String h="There is no sales happend in the store";
   if(sales.isEmpty()){
     // JOptionPane.showMessageDialog(null, "There is no sales happend in the store");
      return h;
  } else{
      h="#. produc name   sale profit   sale status\n";
      for(int i=0;i<sales.size();i++){
      h+=(i+1)+". "+sales.get(i).getname()+"            "+sales.get(i).getprofit()+"              "+sales.get(i).status+"\n";
  }
   }
   return h;
 }
 public static boolean login(String email, String pass){
     // TODO add your handling code here:

     if (isValidEmail(email)) {
         boolean isValidUser = true;

         if (Application.type.equals("Owner")) {
             for (int i = 0; i < Application.Owners.size(); i++) {

                 if (email.equals(Application.Owners.get(i).getemail())) {

                     if (pass.equals(Application.Owners.get(i).getpassword()+"")) {
 Application.publicuser=Application.Owners.get(i);
 isValidUser=true;return true;

                     } else {

                         JOptionPane.showMessageDialog(null, "Please enter a valid password");
                         isValidUser = false;
                         break;
                     }
                 }
             }
         } else if (Application.type.equals("Admin")) {
             for (int i = 0; i < Application.Admins.size(); i++) {
                 JOptionPane.showMessageDialog(null,Application.Admins
                         .get(i).getemail());
                 if (email.equals(Application.Admins.get(i).getemail())) {
                     if (pass.equals(Application.Admins.get(i).getpassword()+"")) {

                     
                     
                         Application.publicuser=Application.Admins.get(i);
                         isValidUser=true;return true;
                     } else {
                         JOptionPane.showMessageDialog(null, "Please enter a valid password");
                         isValidUser = false;
                         break;
                     }
                 }
             }
         } else if (Application.type.equals("Supplier")) {
             for (int i = 0; i < Application.suppliers.size(); i++) {
                 if (email.equals(Application.suppliers.get(i).getemail())) {
                     if (pass.equals(Application.suppliers.get(i).getpassword()+"")) {


                         Application.publicuser=Application.suppliers.get(i);
                     return true;
                     } else {
                         JOptionPane.showMessageDialog(null, "Please enter a valid password");
                         isValidUser = false;
                         break;
                     }
                 }
             }
         } else {

             for (int i = 0; i < Application.users.size(); i++) {
                 JOptionPane.showMessageDialog(null,Application.users.get(i).getemail());
                 if (email.equals(Application.users.get(i).getemail())) {


publicuser.type=new String("User");


                     return true;



                 }
             }
         }

         if (!isValidUser) {
             JOptionPane.showMessageDialog(null, "Email not found in our records");
         }
     } else {
         JOptionPane.showMessageDialog(null, "Please enter a valid email");
     }


     return false;
 }
 public static void addmessagetouser(String message,Account m){
 m.messages().add(message);
 }
public static void updateinformation(String name,int age,int phone,int password){
if(publicuser.getpassword()==password){
   for(int i=0;i<Owners.size();i++){
        if(publicuser.getemail().equals(Owners.get(i).getemail())){
           Owners.get(i).setname(name);
           Owners.get(i).setage(age);
           Owners.get(i).setphone(phone);
           publicuser.setpassword(password);
           publicuser.setage(age);
           publicuser.setname(name);
           publicuser.setphone(phone);
        }
    }
    for(int i=0;i<Admins.size();i++){
        if(publicuser.getemail().equals(Admins.get(i).getemail())){
           Admins.get(i).setname(name);
           Admins.get(i).setage(age);
           Admins.get(i).setphone(phone);
            publicuser.setpassword(password);
            publicuser.setage(age);
            publicuser.setname(name);
            publicuser.setphone(phone);
        }
    }
    for(int i=0;i<suppliers.size();i++){
        if(publicuser.getemail().equals(suppliers.get(i).getemail())){
          suppliers.get(i).setname(name);
           suppliers.get(i).setage(age);
           suppliers.get(i).setphone(phone);
            publicuser.setpassword(password);
            publicuser.setage(age);
            publicuser.setname(name);
            publicuser.setphone(phone);
        }
    }
    for(int i=0;i<users.size();i++){
        if(publicuser.getemail().equals(users.get(i).getemail())){
        users.get(i).setname(name);
           users.get(i).setage(age);
           users.get(i).setphone(phone);
            publicuser.setpassword(password);
            publicuser.setage(age);
            publicuser.setname(name);
            publicuser.setphone(phone);
            
            




        }
    }

  JOptionPane.showMessageDialog(null, "The information are updated");
}else{
 JOptionPane.showMessageDialog(null, "Incorrect password");

}
}
public static void addnewstore(String storename,String storecity){
if(publicuser.gettype().equals("Owner")){
    for(int i=0;i<Owners.size();i++){
     if(  publicuser.name.equals(Owners.get(i).getname())){
         Owners.get(i).addstore(storename, storename);
         JOptionPane.showMessageDialog(null, "The store is added to the Owner "+publicuser.name);
     }
    }
} else{
    JOptionPane.showMessageDialog(null, "You are not an Owner");
}
}

public static void purchase(String prodname,int qua){
     if(qua<0){
         JOptionPane.showMessageDialog(null,"invalid value");
     }
     for(int i=0;i<products.size();i++){
         if(products.get(i).getname().equals(prodname)){
             if(products.get(i).getquantity()<qua){
                 JOptionPane.showMessageDialog(null,"invalid value");
             }else{
     
                  int x=products.get(i).getquantity();          
                 products.get(i).setquantity(x-qua);
                 sales.add(new orders(products.get(i).getname(), qua, (x*qua), "Pending"));
      
             }
         }
     }
}
    public static List<Product> findProductsByDescription(ArrayList<Product> products, String searchString) {
        List<Product> matchingProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.discription.toLowerCase().contains(searchString.toLowerCase())) {
                matchingProducts.add(product);
            }
        }

        return matchingProducts;
       
    }
    public static List<Product> findProductsByName(ArrayList<Product> products, String searchString) {
        List<Product> matchingProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getname().toLowerCase().contains(searchString.toLowerCase())) {
                matchingProducts.add(product);
            }
        }

        return matchingProducts;
    }
public static void updatepassword(int newpassword){
publicuser.setpassword(newpassword);
if(type.equals("Owner")){
    for(int i=0;i<Owners.size();i++){
        if(publicuser.getemail().equals(Owners.get(i).getemail())){
            Owners.get(i).setpassword(newpassword);
        }
    }
}else if(type.equals("Admin")){
    for(int i=0;i<Admins.size();i++){
        if(publicuser.getemail().equals(Admins.get(i).getemail())){
            Admins.get(i).setpassword(newpassword);
        }
    }
}
else if(type.equals("Supplier")){
    for(int i=0;i<suppliers.size();i++){
        if(publicuser.getemail().equals(suppliers.get(i).getemail())){
            suppliers.get(i).setpassword(newpassword);
        }
    }
}else if(type.equals("User")){
    for(int i=0;i<users.size();i++){
        if(publicuser.getemail().equals(users.get(i).getemail())){
            users.get(i).setpassword(newpassword);
        }
    }
}
}
public void Purchase(String n,int q){
     if(q<=0){
         JOptionPane.showMessageDialog(null,"invalid value");
         return;
     }
     for(int i=0;i<products.size();i++){
         if(products.get(i).getname().equals(n)){
             if(q>products.get(i).getquantity()){
                 JOptionPane.showMessageDialog(null,"invalid value");
                 return;
             }else{
                products.get(i).setquantity(products.get(i).getquantity()-q);
                int y=q*products.get(i).getprice();
                sales.add(new orders(products.get(i).getname(),q,y,"Pending"));
                 return;
             }
         }
     }
 }
 public static void logup(String email,String name,int age,int phone,int password){



     if(!isfoundmail(email)){
    if(isValidEmail(email)){
        if(Application.type2.equals("Owner")){
        Owners.add(new Owneraccount(name, age, email, phone, password));
         JOptionPane.showMessageDialog(null,"Welcome to our store Owner "+name);
           loginpage.removecontents();
    }
    else if(Application.type2.equals("Admin")){
        Admins.add(new Admin(name, age, email, phone, password));


         JOptionPane.showMessageDialog(null,"Welcome to our store Admin "+name);
          loginpage.removecontents();
    }
    else if(Application.type2.equals("Supplier")){
        suppliers.add(new Suppliers(name, age, email, phone, password));

         JOptionPane.showMessageDialog(null,"Welcome to our store Supplier "+name);
          loginpage.removecontents();
    }else if(Application.type2.equals("User")){
      users.add(new User(name, age, email, phone, password));

       JOptionPane.showMessageDialog(null,"Welcome to our store User "+name);
        loginpage.removecontents();
    }else{
        
         JOptionPane.showMessageDialog(null,"Invalid type");
     
    }

    }

     }else{
         JOptionPane.showMessageDialog(null, "Someone has used the email");
     }

 }

 public String infos(){
     String msg="";
     for(int i=0;i<Owners.size();i++){
         if(i==0)msg="Owners : ";
         msg+=(i+1)+". "+Owners.get(i).getname()+"  ";

     }
     for(int i=0;i<suppliers.size();i++){
         if(i==0)msg="\nSuppliers : ";
         msg+=(i+1)+". "+suppliers.get(i).getname()+"  ";

     }
     return  msg;
 }

 public static boolean isValidEmail(String email) {
     String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

   public static boolean isValidFutureDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        dateFormat.setLenient(false);

        try {
            // Parse the date string
            Date date = dateFormat.parse(dateStr);

            // Get the current date
            Date currentDate = new Date();

            // Check if the date is in the future
            return date.after(currentDate);
        } catch (java.text.ParseException e) {
            return false;
        }
    }
    public static boolean generatereport(String msg, String filename) {
        File file = new File(filename);
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(file);
            fileWriter.write(msg);
            return true;
        } catch (IOException e) {
          return false;

        } finally {
            // Close the FileWriter to release system resources
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  public static void sendEmail(String fromEmail, String toEmail, String messageContent, String password) {
        String host = "smtp.gmail.com";
        final String username = fromEmail;


        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("Your Subject Here");
            message.setText(messageContent);
            Transport.send(message);
          
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.matches("\\d+");
    }
    public static boolean isfoundproduct(String name){
  for(int i=0;i<products.size();i++){
      if(name.equals(products.get(i))){
          return true;
      }
  }
    return false;
}
public static boolean isfoundmail(String email){
    for(int i=0;i<Owners.size();i++){
        if(email.equals(Owners.get(i).getemail())){
            return true;
        }
    }
    for(int i=0;i<Admins.size();i++){
        if(email.equals(Admins.get(i).getemail())){
            return true;
        }
    }
    for(int i=0;i<suppliers.size();i++){
        if(email.equals(suppliers.get(i).getemail())){
            return true;
        }
    }
    for(int i=0;i<users.size();i++){
        if(email.equals(users.get(i).getemail())){
            return true;
        }
    }
    return false;
}
   public static void populateAndSetupList(JList<String> jList, ArrayList<String> items) {
       jList.removeAll();
   if(items.isEmpty()){
     DefaultListModel<String> listModel = new DefaultListModel<>();
     listModel.add(0, "There is no Data");
     jList.setEnabled(false);
     jList.setModel(listModel);
   }else{
          jList.setEnabled(false);
            DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String item : items) {
            listModel.addElement(item);
        }
        jList.setModel(listModel);

        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    int index = jList.locationToIndex(e.getPoint());
                    userspage.index1=index;
                   
                    if (index >= 0) {
                        String selectedItem = listModel.getElementAt(index);
                        suppliername=selectedItem;
                        ownername=selectedItem;
                        int y=order;
                        order=index;
                        if(y!=order){
                            
                            JOptionPane.showMessageDialog(null, "You clicked: " + selectedItem);
                        }
                    }
                }
            }
        });
   }
    }

}
