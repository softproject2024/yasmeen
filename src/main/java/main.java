
import java.util.ArrayList;
import yasmeen.softwareproject.Application;
import yasmeen.softwareproject.userpage;

public class main {
  
    public static void main(String[] args) {
        new Application();
      Application.Owners=new ArrayList<>();
         Application.Admins=new ArrayList<>();
          Application.posts=new ArrayList<>();
           Application.suppliers=new ArrayList<>();
            Application.users=new ArrayList<>();
             Application.products=new ArrayList<>();
              Application.sales=new ArrayList<>();
           
Application.loginpage.setVisible(true);
       
    }
}
