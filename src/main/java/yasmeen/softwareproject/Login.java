
package yasmeen.softwareproject;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JOptionPane;
import static yasmeen.softwareproject.Application.isValidEmail;
import static yasmeen.softwareproject.Owner.getPasswordAsString;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        
        setSize(new Dimension(this.getWidth(), 351));
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width / 2;
        int centerY = screenSize.height / 2;
        this.setLocation(centerX - this.getWidth() / 2, centerY - this.getHeight() / 2);
        
    }
    

    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = Owner.createImageLabel1("C:\\\\Users\\\\nd\\\\Desktop\\\\248\\\\New folder\\\\p19.png");
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        javax.swing.JCheckBox jCheckBox1 = new javax.swing.JCheckBox();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(205, 160, 167));
        jLabel2.setText("Welcome !");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("E-mail");

        jTextField1.setText("Type your name");



        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Your type");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Remember me");

        jButton1.setBackground(new java.awt.Color(205, 160, 167));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("___________________________________________");

        jLabel8.setText("Dont have account?");

        jLabel9.setForeground(new java.awt.Color(205, 160, 167));
        jLabel9.setText("Log up");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked();
            }
        });

        jLabel14.setText("Sign in to continue");

        jTextField3.setText("your type");

        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPasswordField1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }


    private void jLabel9MouseClicked() {
         
       Application.loginpage.setVisible(false);
       Application.loguppage.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
         
        Application.adminpage=new Admin1();
        Application.userspage=new UserPage();
        Application.ownerpage=new Owner();
        Application.supplierspage=new Suppliersframe();
      Application.type= jTextField3.getText();
            
        if (isValidEmail(jTextField1.getText())) {
    boolean isValidUser = false;
    
    if (jTextField3.getText().equals("Owner")) {
        
        for (int i = 0; i < Application.storeowners.size(); i++) {
            if (jTextField1.getText().equals(Application.storeowners.get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.storeowners.get(i).getpassword()+"")) {

                    Application.ownerpage.setVisible(true);
                    Application.publicuser=Application.storeowners.get(i);
                    Application.ownerpage.jLabel2.setText("Welcome back " + Application.storeowners.get(i).getname());
                    Application.ownerpage.jTextField1.setText(Application.storeowners.get(i).getname());
                     Application.ownerpage.jTextField2.setText(Application.storeowners.get(i).getphone()+"");
                      Application.ownerpage.jTextField3.setText(Application.storeowners.get(i).getage()+"");
                      Application.ownerpage.jPasswordField1.setText("");
                    Application.loginpage.setVisible(false);
                    jTextField1.setText("");
                    jPasswordField1.setText("");

                       StringBuilder h= new StringBuilder("There is no messages to this account");
            for(int ip=0;ip<Application.publicuser.messages.size();ip++){
                if(ip==0) h = new StringBuilder();
                h.append(Application.publicuser.messages.get(ip)).append("\n");
                    }


         Application.ownerpage.jTextArea2.setText(h.toString());
         Application.ownerpage.jTextArea2.setEditable(false);
                    isValidUser = true;
                    break;
                } else {

                    JOptionPane.showMessageDialog(null, "Please enter a valid password");
                    break;
                }
            }
        }
    } else if (jTextField3.getText().equals("Admin")) {
        for (int i = 0; i < Application.admins.size(); i++) {
            if (jTextField1.getText().equals(Application.admins.get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.admins.get(i).getpassword()+"")) {
                    Application.adminpage.getl2().setText("Welcome back " + Application.admins.get(i).getname());
                    Application.adminpage.setVisible(true);
                    Application.loginpage.setVisible(false);
                         Application.adminpage.jTextField7.setText(Application.admins.get(i).getname());
                    Application.adminpage.jTextField9.setText(Application.admins.get(i).getage()+"");
                            Application.adminpage.jTextField8.setText(Application.admins.get(i).getphone()+"");
                    jTextField1.setText("");
                    jPasswordField1.setText("");
                    Application.publicuser=Application.admins.get(i);
                    isValidUser = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid password");
                    break;
                }
            }
        }
    }
    else if (jTextField3.getText().equals("Supplier")) {
        for (int i = 0; i < Application.suppliers.size(); i++) {
            if (jTextField1.getText().equals(Application.suppliers.get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.suppliers.get(i).getpassword()+"")) {
                    
                    Application.supplierspage.setVisible(true);
                    Application.loginpage.setVisible(false);
                    jTextField1.setText("");
                    Application.publicuser=Application.suppliers.get(i);
                    jPasswordField1.setText("");
                   Application.supplierspage.jTextField1.setText(Application.suppliers.get(i).getname());
                     Application.supplierspage.jTextField2.setText(Application.suppliers.get(i).getphone()+"");
                      Application.supplierspage.jTextField3.setText(Application.suppliers.get(i).getage()+"");
                      Application.supplierspage.jPasswordField1.setText("");
                    Application.supplierspage.jLabel2.setText("Welcome back " + Application.suppliers.get(i).getname());
                       StringBuilder h= new StringBuilder("There is no messages to this account");
            for(int ip=0;ip<Application.publicuser.messages.size();ip++){
                if(ip==0) h = new StringBuilder();
                h.append(Application.publicuser.messages.get(ip)).append("\n");
                    }
               
         Application.supplierspage.jTextArea2.setText(h.toString());
         Application.supplierspage.jTextArea2.setEditable(false);
                    isValidUser = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid password");
                    break;
                }
            }
        }
    } else if(jTextField3.getText().equals("User")) {
             Application.userspage=new UserPage();
        for (int i = 0; i < Application.users.size(); i++) {
            if (jTextField1.getText().equals(Application.users.get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.users.get(i).getpassword()+"")) {
                        Application.userspage.setVisible(true);
                    Application.loginpage.setVisible(false);
                    jTextField1.setText("");
                    Application.publicuser=Application.users.get(i);
                    jPasswordField1.setText("");
                   Application.userspage.jTextField2.setText(Application.users.get(i).getname());
                     Application.userspage.jTextField3.setText(Application.users.get(i).getphone()+"");
                      Application.userspage.jTextField4.setText(Application.users.get(i).getage()+"");
                      Application.userspage.jPasswordField1.setText("");
                    Application.userspage.jLabel3.setText("Welcome back " + Application.users.get(i).getname());
                       StringBuilder h= new StringBuilder("There is no messages to this account");
            for(int ip=0;ip<Application.publicuser.messages.size();ip++){
                if(ip==0) h = new StringBuilder();
                h.append(Application.publicuser.messages.get(ip)).append("\n");
                    }
               
         Application.userspage.jTextArea2.setText(h.toString());
         Application.userspage.jTextArea2.setEditable(false);
                    isValidUser = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid password");
                    break;
                }
            }
        }
    }else{
        
         JOptionPane.showMessageDialog(null,"Invalid type");
     
    }
    
    if (!isValidUser) {
        JOptionPane.showMessageDialog(null, "Email not found in our records");
    }
} else {
    JOptionPane.showMessageDialog(null, "Please enter a valid email");
}
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
         
    }

    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;


    void removecontents() {
        jTextField1.setText("");
          jPasswordField1.setText("");
            jTextField3.setText("");
         }
}
