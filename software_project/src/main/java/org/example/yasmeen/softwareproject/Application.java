/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.yasmeen.softwareproject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class Application {




    Product carrot=new Product("carrot", 12,10, "1/12/2024",0);
    Product cucumber=new Product("cucumber", 4,10, "30/12/2024",0);
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
//  public static logup loguppage;
//  public static login loginpage;
//  public static Owner ownerpage;
//  public static Admin1  adminpage;
//
//  public static Suppliersframe supplierspage;

 public Application(){

     type="Owner";
     type2="Owner";
     status="Complete";
     publicuser=new Admin("",0,"",0,0);
     products=new ArrayList<>();
     products.add(carrot);
     products.add(cucumber);
     Admins=new ArrayList<>();
     Owners=new ArrayList<>();
     Owners.add(new Owneraccount("12",12,"a2@g.c",1231231231,1231231231));
     Owners.get(0).messages.add("hi");
     suppliers=new ArrayList<>();
     suppliers.add(new Suppliers("1221", 0, type, 0, 0));
      suppliers.add(new Suppliers("yasmeen", 0, "a1@g.c", 0, 12121212));


     users=new ArrayList<>();
     sales=new ArrayList<>();
     sales.add(new orders(products.get(1).getname(), 12, 12, status));
      sales.add(new orders(products.get(1).getname(), 14, 14, status));
       sales.add(new orders(products.get(1).getname(), 13, 13, status));
//     loguppage=new logup();
//     loginpage=new login();
//     ownerpage=new Owner();
//     adminpage=new Admin1();
//     supplierspage=new Suppliersframe();


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
 public static void  addproduct(String name,int price,int quantity,String expire,int discount){

  for(int i=0;i<products.size();i++){
      if(name.equals(products.get(i))){
          int x=quantity+products.get(i).getquantity();
          products.get(i).setquantity(x);
          JOptionPane.showMessageDialog(null, "The quantity "+quantity+" is added to the store\n new quantity of the product : "+products.get(i).getname()+" is : "+x);
          return;
      }
  }
  products.add(new Product(name,price,quantity,expire,discount));
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
      h="Sale id   produc name   sale profit   sale status\n";
      for(int i=0;i<sales.size();i++){
      h+=(i+1)+". "+sales.get(i).getname()+"   "+sales.get(i).getprofit()+"   "+sales.get(i).status+"\n";
  }
   }
   return h;
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
        }
    }
    for(int i=0;i<Admins.size();i++){
        if(publicuser.getemail().equals(Admins.get(i).getemail())){
           Admins.get(i).setname(name);
           Admins.get(i).setage(age);
           Admins.get(i).setphone(phone);
        }
    }
    for(int i=0;i<suppliers.size();i++){
        if(publicuser.getemail().equals(suppliers.get(i).getemail())){
          suppliers.get(i).setname(name);
           suppliers.get(i).setage(age);
           suppliers.get(i).setphone(phone);
        }
    }
    for(int i=0;i<users.size();i++){
        if(publicuser.getemail().equals(users.get(i).getemail())){
        users.get(i).setname(name);
           users.get(i).setage(age);
           users.get(i).setphone(phone);
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
public static void updatepassword(int newpassword){
  SecureRandom random = new SecureRandom();
        int verificationCode = 10000 + random.nextInt(90000);
        sendEmail("softwareproject22@gmail.com",publicuser.getemail(),"The verification code is : "+verificationCode+"\nPlease don't share it","123");
        String verification=JOptionPane.showInternalInputDialog(null, "What is the verificationCode ?");
        try{
            int code=Integer.parseInt(verification);
            if(code==verificationCode){
               publicuser.setpassword(newpassword);
            }else{
                 JOptionPane.showMessageDialog(null,"The verification Code is incorrecr");
            }


        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"The verification Code is incorrecr");

}
}

 public static void logup(String email,String name,int age,int phone,int password){

//       SecureRandom random = new SecureRandom();
//        int verificationCode = 10000 + random.nextInt(90000);
//        sendEmail("softwareproject22@gmail.com",email,"The verification code is : "+verificationCode+"\nPlease don't share it","123");
//        String verification=JOptionPane.showInternalInputDialog(null, "What is the verificationCode ?");
//        try{
//            int code=Integer.parseInt(verification);
//            if(code==verificationCode){
//                 if(Application.type2.equals("Owner")){
//        Owners.add(new Owneraccount(name, age, email, phone, password));
//    }
//    else if(Application.type2.equals("Admin")){
//        Admins.add(new Admin(name, age, email, phone, password));
//    }
//    else if(Application.type2.equals("Supplier")){
//        suppliers.add(new Suppliers(name, age, email, phone, password));
//    }else{
//      users.add(new User(name, age, email, phone, password));
//    }
//    JOptionPane.showMessageDialog(null,"Welcome to our store "+name);
//            }else{
//                 JOptionPane.showMessageDialog(null,"The verification Code is incorrecr");
//            }
//
//
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null,"The verification Code is incorrecr");
//
//}
//


     if(!isfoundmail(email)){
    if(isValidEmail(email)){
        if(Application.type2.equals("Owner")){
        Owners.add(new Owneraccount(name, age, email, phone, password));
         JOptionPane.showMessageDialog(null,"Welcome to our store Owner "+name);
//           loginpage.removecontents();
    }
    else if(Application.type2.equals("Admin")){
        Admins.add(new Admin(name, age, email, phone, password));


         JOptionPane.showMessageDialog(null,"Welcome to our store Admin "+name);
//          loginpage.removecontents();
    }
    else if(Application.type2.equals("Supplier")){
        suppliers.add(new Suppliers(name, age, email, phone, password));

         JOptionPane.showMessageDialog(null,"Welcome to our store Supplier "+name);
//          loginpage.removecontents();
    }else{
      users.add(new User(name, age, email, phone, password));

       JOptionPane.showMessageDialog(null,"Welcome to our store User "+name);
//        loginpage.removecontents();
    }

    }

     }else{
         JOptionPane.showMessageDialog(null, "Someone has used the email");
     }

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
            System.out.println("Email sent successfully!");
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
