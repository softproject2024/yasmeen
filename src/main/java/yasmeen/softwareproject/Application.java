
package yasmeen.softwareproject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public static void someMethod() {
        Application.adminpage = new Admin1();
        loguppage=new logup();
        loginpage=new Login();
        ownerpage=new Owner();
        userspage=new UserPage();
        supplierspage=new Suppliersframe();
    }

    String path ="C:\\Users\\nd\\Desktop\\248\\New folder\\p19.png";


    Product carrot=new Product("tomato", 12,1000, "1/12/2024",0,"dunat is vey",path);
    Product cucumber=new Product("cucumber", 4,999, "30/12/2024",0,"cheescake is very cool",path);
 public static String type;
 public static int maxindex;
 public static String invalidvalue ="invalid value";
  public static String type2;
  public static String suppliername;
   public static String ownername;
  public static int order;
   public static String status;
  
 public static Account publicuser;
 public static List<Admin> admins;
 public static List<Owneraccount> storeowners;
 public static List<Suppliers>suppliers;
 public static List<User>users;
 public static List<Product>products;
 public static List<orders>sales;
 public static List<post>posts;
  public static logup loguppage;
  public static Login loginpage;
  public static Owner ownerpage;
  public static Admin1 adminpage;
   public static UserPage userspage;

  public static Suppliersframe supplierspage;
    public static final String OWNER_MSG ="Owner";
    public static final String ADMIN_MSG="Admin";
    public static final String SUPPLIER_MSG="Supplier";
    public static final String USER_MSG="User";
    public static final String ENTER_MSG="Please enter a valid password";
    

 public Application(){

publicuser=new Account("",1,"",1,"",1);
     status="Complete";

     posts= new ArrayList<>();

     products=new ArrayList<>();
     products.add(carrot);
     
     products.add(cucumber);
     admins =new ArrayList<>();
     storeowners =new ArrayList<>();

     storeowners.add(new Owneraccount("Yasmeen",12,"a2@g.c",1231231231,0));
     storeowners.getFirst().messages.add("hi");
     suppliers=new ArrayList<>();

      suppliers.add(new Suppliers("Yaqoot", 0, "a1@g.c", 0, 12121212));


     users=new ArrayList<>();
     users.add(new User("Hitler",1,"1",2,12 ));
     admins.add(new Admin("any",1,"ad1@g.c",2112121212,12121212));
     storeowners.add(new Owneraccount("nk",1,"ow1@g.c",2112121212,12121212));
    suppliers.add(new Suppliers("any",1,"su1@g.c",2112121212,12121212));

     users.add(new User("ause",1,"us1@g.c",2112121212,12121212));
     sales=new ArrayList<>();
     sales.add(new orders(products.get(1).getname(), 12, status));
      sales.add(new orders(products.get(1).getname(), 14, status));
       sales.add(new orders(products.get(1).getname(), 13, status));




     posts.add(new post(path,"1","1",0 ));
     someMethod();

 }

public static String getallproducts(){
    StringBuilder h= new StringBuilder("There is no products in the store");
    if(!products.isEmpty()){
        h = new StringBuilder("#. Product Name   Product price   Product discount\n");
        for(int i=0;i<products.size();i++){
            h.append((i + 1)).append(". ").append(products.get(i).getname()).append("   ").append(products.get(i).getprice()).append("   ").append(products.get(i).getdiscount()).append("\n");
        }
    }

    return h.toString();
}
 public static void  addproduct(String name,int price,int quantity,String expire,int discount,String des){
if(!isValidFutureDate(expire)){
    JOptionPane.showMessageDialog(null, "invalid expire date");

    return;
}
if(price<0||quantity<0){
    JOptionPane.showMessageDialog(null, invalidvalue);

    return;
}
     for (Product product : products) {


         if (name.equals(product.getname())) {
             int x = quantity + product.getquantity();
             product.setquantity(x);

             JOptionPane.showMessageDialog(null, "The quantity " + quantity + " is added to the store\n new quantity of the product : " + product.getname() + " is : " + x);
             return;
         }
     }
  String pa= Admin1.getFilepath();
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
     if(a.gettype().equals(OWNER_MSG)){
         for (Owneraccount owner : storeowners) {
             if (a.getemail().equals(owner.getemail())) {
                 owner.messages.add(msg);
             }
         }
     }else{
         for (Suppliers supplier : suppliers) {
             if (a.getemail().equals(supplier.getemail())) {
                 supplier.messages.add(msg);
             }
         }
     }
 }
 public static void ratePost(int r, post m){
     for (yasmeen.softwareproject.post post : posts) {
         if (m.id == post.id) {
             post.rates.add(r);
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
     for (Product product : products) {
         if (p == product) {
             JOptionPane.showMessageDialog(null, "The new discount for the product " + p.getname() + " is : " + discount);
             product.updatediscount(discount);
         }
     }
 }
 public static Product getmaxprofit(){

  if(sales.isEmpty()){
      return null;
  }

  String productname="";
  maxindex=0;
     for (orders sale : sales) {

         if (maxindex < sale.getprofit()) {

             maxindex = sale.getprofit();

             productname = sale.getname();
         }
     }

     for (Product product : products) {

         if (productname.equals(product.getname())) {
             return product;

         }
     }
   return null;
 }
 public static String getsalesmessage(){
      StringBuilder h= new StringBuilder("There is no sales happend in the store");
   if(sales.isEmpty()){
     
      return h.toString();
  } else{
      h = new StringBuilder("#. produc name   sale profit   sale status\n");
      for(int i=0;i<sales.size();i++){
      h.append((i + 1)).append(". ").append(sales.get(i).getname()).append("            ").append(sales.get(i).getprofit()).append("              ").append(sales.get(i).status).append("\n");
  }
   }
   return h.toString();
 }
 public static boolean login(String email, String pass){
      

     if (isValidEmail(email)) {
         boolean isValidUser = true;

         
         switch (Application.type) {
             case OWNER_MSG -> {
                 for (int i = 0; i < Application.storeowners.size(); i++) {

                     if (email.equals(Application.storeowners.get(i).getemail())) {

                         if (pass.equals(Application.storeowners.get(i).getpassword() + "")) {
                             Application.publicuser = Application.storeowners.get(i);
                             return true;

                         } else {

                             JOptionPane.showMessageDialog(null, ENTER_MSG);
                             isValidUser = false;
                             break;
                         }
                     }
                 }
             }
             case ADMIN_MSG -> {
                 for (int i = 0; i < Application.admins.size(); i++) {
                     JOptionPane.showMessageDialog(null, Application.admins
                             .get(i).getemail());
                     if (email.equals(Application.admins.get(i).getemail())) {
                         if (pass.equals(Application.admins.get(i).getpassword() + "")) {


                             Application.publicuser = Application.admins.get(i);
                             return true;
                         } else {
                             JOptionPane.showMessageDialog(null, ENTER_MSG);
                             isValidUser = false;
                             break;
                         }
                     }
                 }
             }
             case SUPPLIER_MSG -> {
                 for (int i = 0; i < Application.suppliers.size(); i++) {
                     if (email.equals(Application.suppliers.get(i).getemail())) {
                         if (pass.equals(Application.suppliers.get(i).getpassword() + "")) {


                             Application.publicuser = Application.suppliers.get(i);
                             return true;
                         } else {
                             JOptionPane.showMessageDialog(null, ENTER_MSG);
                             isValidUser = false;
                             break;
                         }
                     }
                 }
             }
             default -> {

                 for (int i = 0; i < Application.users.size(); i++) {
                     JOptionPane.showMessageDialog(null, Application.users.get(i).getemail());
                     if (email.equals(Application.users.get(i).getemail())) {


                         publicuser.type = USER_MSG;


                         return true;


                     }
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

    public static void updateinformation(String name,int age,int phone,int password){
if(publicuser.getpassword()==password){
    for (Owneraccount owner : storeowners) {
        if (isowner(owner.getemail())) {
            owner.setname(name);
            owner.setage(age);
            owner.setphone(phone);
            publicuser.setpassword(password);
            publicuser.setage(age);
            publicuser.setname(name);
            publicuser.setphone(phone);
        }
    }
    for (Admin admin : admins) {
        if (isadmin(admin.getemail())) {
            admin.setname(name);
            admin.setage(age);
            admin.setphone(phone);
            publicuser.setpassword(password);
            publicuser.setage(age);
            publicuser.setname(name);
            publicuser.setphone(phone);
        }
    }
    for (Suppliers supplier : suppliers) {
        if (issuppleir(supplier.getemail())) {
            supplier.setname(name);
            supplier.setage(age);
            supplier.setphone(phone);
            publicuser.setpassword(password);
            publicuser.setage(age);
            publicuser.setname(name);
            publicuser.setphone(phone);
        }
    }
    for (User user : users) {
        if (publicuser.getemail().equals(user.getemail())) {
            user.setname(name);
            user.setage(age);
            user.setphone(phone);
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

    private static boolean issuppleir(String getemail) {
        return publicuser.getemail().equals(getemail);
    }

    private static boolean isadmin(String getemail) {
       return publicuser.getemail().equals(getemail);
    }

    private static boolean isowner(String getemail) {
      return  publicuser.getemail().equals(getemail);
    }

    public static void purchase(String prodname,int qua){
     if(qua<0){
         JOptionPane.showMessageDialog(null, invalidvalue);
     }
    for (Product product : products) {
        if (product.getname().equals(prodname)) {
            if (product.getquantity() < qua) {
                JOptionPane.showMessageDialog(null, invalidvalue);
            } else {

                int x = product.getquantity();
                product.setquantity(x - qua);
                sales.add(new orders(product.getname(), (x * qua), "Pending"));

            }
        }
    }
}
    public static List<Product> findProductsByDescription(List<Product> products, String searchString) {
        List<Product> matchingProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.discription.toLowerCase().contains(searchString.toLowerCase())) {
                matchingProducts.add(product);
            }
        }

        return matchingProducts;
       
    }
    public static List<Product> findProductsByName(List<Product> products, String searchString) {
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
    switch (type) {
        case OWNER_MSG -> {
            for (Owneraccount owner : storeowners) {
                if (publicuser.getemail().equals(owner.getemail())) {
                    owner.setpassword(newpassword);
                }
            }
        }
        case ADMIN_MSG -> {
            for (Admin admin : admins) {
                if (publicuser.getemail().equals(admin.getemail())) {
                    admin.setpassword(newpassword);
                }
            }
        }
        case SUPPLIER_MSG -> {
            for (Suppliers supplier : suppliers) {
                if (publicuser.getemail().equals(supplier.getemail())) {
                    supplier.setpassword(newpassword);
                }
            }
        }
        case USER_MSG -> {
            for (User user : users) {
                if (publicuser.getemail().equals(user.getemail())) {
                    user.setpassword(newpassword);
                }
            }
        }
    }
}

    public static void logup(String email,String name,int age,int phone,int password){



     if(!isfoundmail(email)){
    if(isValidEmail(email)){
        switch (Application.type2) {
            case OWNER_MSG -> {
                storeowners.add(new Owneraccount(name, age, email, phone, password));
                JOptionPane.showMessageDialog(null, "Welcome to our store Owner " + name);
                loginpage.removecontents();
            }
            case ADMIN_MSG -> {
                admins.add(new Admin(name, age, email, phone, password));


                JOptionPane.showMessageDialog(null, "Welcome to our store Admin " + name);
                loginpage.removecontents();
            }
            case SUPPLIER_MSG -> {
                suppliers.add(new Suppliers(name, age, email, phone, password));

                JOptionPane.showMessageDialog(null, "Welcome to our store Supplier " + name);
                loginpage.removecontents();
            }
            case USER_MSG -> {
                users.add(new User(name, age, email, phone, password));

                JOptionPane.showMessageDialog(null, "Welcome to our store User " + name);
                loginpage.removecontents();
            }
            default -> JOptionPane.showMessageDialog(null, "Invalid type");
        }

    }

     }else{
         JOptionPane.showMessageDialog(null, "Someone has used the email");
     }

 }



 public static boolean isValidEmail(String email) {
     String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

   public static boolean isValidFutureDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        dateFormat.setLenient(false);

        try {

            Date date = dateFormat.parse(dateStr);

            Date currentDate = new Date();


            return date.after(currentDate);
        } catch (java.text.ParseException e) {
            return false;
        }
    }
    public static boolean generatereport(String msg, String filename) {
        File file = new File(filename);

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(msg);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static void sendEmail(String fromEmail, String toEmail, String messageContent) {
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
                return new PasswordAuthentication(username, "nhdo kelh sbgl qynb");
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
            JOptionPane.showMessageDialog(null, invalidvalue);
        }
    }
    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.matches("\\d+");
    }

    public static boolean isfoundmail(String email){
        for (Owneraccount owner : storeowners) {
            if (email.equals(owner.getemail())) {
                return true;
            }
        }
        for (Admin admin : admins) {
            if (email.equals(admin.getemail())) {
                return true;
            }
        }
        for (Suppliers supplier : suppliers) {
            if (email.equals(supplier.getemail())) {
                return true;
            }
        }
        for (User user : users) {
            if (email.equals(user.getemail())) {
                return true;
            }
        }
    return false;
}
   public static void populateAndSetupList(JList<String> jList, List<String> items) {
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
                    UserPage.setIndex1(index);
                   
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
