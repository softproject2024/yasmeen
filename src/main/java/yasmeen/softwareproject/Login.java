
package yasmeen.softwareproject;

import java.awt.*;


import javax.swing.*;

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

        javax.swing.JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = Owner.createImageLabel1("C:\\\\Users\\\\nd\\\\Desktop\\\\248\\\\New folder\\\\p19.png");
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        JCheckBox jCheckBox1 = new JCheckBox();
       JButton jButton1 = new JButton();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        jTextField3 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setForeground(new Color(255, 255, 255));

        jLabel2.setForeground(new Color(205, 160, 167));
        jLabel2.setText("Welcome !");

        jLabel3.setForeground(new Color(204, 204, 204));
        jLabel3.setText("E-mail");

        jTextField1.setText("Type your name");



        jLabel4.setForeground(new Color(204, 204, 204));
        jLabel4.setText("Password");

        jLabel5.setForeground(new Color(204, 204, 204));
        jLabel5.setText("Your type");

        jCheckBox1.setBackground(new Color(255, 255, 255));
        jCheckBox1.setForeground(new Color(204, 204, 204));
        jCheckBox1.setText("Remember me");

        jButton1.setBackground(new Color(205, 160, 167));
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(e -> jButton1ActionPerformed());

        jLabel7.setForeground(new Color(204, 204, 204));
        jLabel7.setText("___________________________________________");

        jLabel8.setText("Dont have account?");

        jLabel9.setForeground(new Color(205, 160, 167));
        jLabel9.setText("Log up");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked();
            }
        });

        jLabel14.setText("Sign in to continue");

        jTextField3.setText("your type");



        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPasswordField1)
                                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(65, 65, 65))
                                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel7, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))))))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }


    public void jLabel9MouseClicked() {
         
       Application.getLoginpage().setVisible(false);
       Application.getLoguppage().setVisible(true);
    }

    public void jButton1ActionPerformed() {
         
        Application.setAdminpage(new Admin1());
        Application.setUserspage(new UserPage());
        Application.setOwnerpage(new Owner());
        Application.setSupplierspage((new Suppliersframe()));
      Application.setType( jTextField3.getText());
            
        if (isValidEmail(jTextField1.getText())) {
    boolean isValidUser = false;

            String welcome = "Welcome back ";
            String nomessage = "There is no messages to this account";
            String invalidpass = "Please enter a valid password";
            if (jTextField3.getText().equals("Owner")) {
        
        for (int i = 0; i < Application.getStoreowners().size(); i++) {
            if (jTextField1.getText().equals(Application.getStoreowners().get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.getStoreowners().get(i).getpassword()+"")) {

                    Application.getOwnerpage().setVisible(true);
                    Application.setPublicuser(Application.getStoreowners().get(i));
                    Application.getOwnerpage().getjLabel2().setText(welcome + Application.getStoreowners().get(i).getname());
                    Application.getOwnerpage().getjTextField1().setText(Application.getStoreowners().get(i).getname());
                     Application.getOwnerpage().getjTextField2().setText(Application.getStoreowners().get(i).getphone()+"");
                      Application.getOwnerpage().getjTextField3().setText(Application.getStoreowners().get(i).getage()+"");
                      Application.getOwnerpage().getjPasswordField1().setText("");
                    Application.getLoginpage().setVisible(false);
                    jTextField1.setText("");
                    jPasswordField1.setText("");

                       StringBuilder h= new StringBuilder(nomessage);
            for(int ip=0;ip<Application.getPublicuser().messages.size();ip++){
                if(ip==0) h = new StringBuilder();
                h.append(Application.getPublicuser().messages.get(ip)).append("\n");
                    }


         Application.getOwnerpage().getjTextArea2().setText(h.toString());
         Application.getOwnerpage().getjTextArea2().setEditable(false);
                    isValidUser = true;

                } else {

                    JOptionPane.showMessageDialog(null, invalidpass);
                    break;
                }
            }
        }
    } else if (jTextField3.getText().equals("Admin")) {
        for (int i = 0; i < Application.getAdmins().size(); i++) {
            if (jTextField1.getText().equals(Application.getAdmins().get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.getAdmins().get(i).getpassword()+"")) {
                    Application.getAdminpage().getl2().setText(welcome + Application.getAdmins().get(i).getname());
                    Application.getAdminpage().setVisible(true);
                    Application.getLoginpage().setVisible(false);
                         Application.getAdminpage().getjTextField7().setText(Application.getAdmins().get(i).getname());
                    Application.getAdminpage().getjTextField9().setText(Application.getAdmins().get(i).getage()+"");
                            Application.getAdminpage().getjTextField8().setText(Application.getAdmins().get(i).getphone()+"");
                    jTextField1.setText("");
                    jPasswordField1.setText("");
                    Application.setPublicuser(Application.getAdmins().get(i));
                    isValidUser = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, invalidpass);
                    break;
                }
            }
        }
    }
    else if (jTextField3.getText().equals("Supplier")) {
        for (int i = 0; i < Application.getSuppliers().size(); i++) {
            if (jTextField1.getText().equals(Application.getSuppliers().get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.getSuppliers().get(i).getpassword()+"")) {
                    
                    Application.getSupplierspage().setVisible(true);
                    Application.getLoginpage().setVisible(false);
                    jTextField1.setText("");
                    Application.setPublicuser(Application.getSuppliers().get(i));
                    jPasswordField1.setText("");
                   Application.getSupplierspage().getjTextField1().setText(Application.getSuppliers().get(i).getname());
                     Application.getSupplierspage().getjTextField2().setText(Application.getSuppliers().get(i).getphone()+"");
                      Application.getSupplierspage().getjTextField3().setText(Application.getSuppliers().get(i).getage()+"");
                      Application.getSupplierspage().getjPasswordField1().setText("");
                    Application.getSupplierspage().getjLabel2().setText(welcome + Application.getSuppliers().get(i).getname());
                       StringBuilder h= new StringBuilder(nomessage);
            for(int ip=0;ip<Application.getPublicuser().messages.size();ip++){
                if(ip==0) h = new StringBuilder();
                h.append(Application.getPublicuser().messages.get(ip)).append("\n");
                    }
               
         Application.getSupplierspage().getjTextArea2().setText(h.toString());
         Application.getSupplierspage().getjTextArea2().setEditable(false);
                    isValidUser = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, invalidpass);
                    break;
                }
            }
        }
    } else if(jTextField3.getText().equals("User")) {
             Application.setUserspage(new UserPage());
        for (int i = 0; i < Application.getUsers().size(); i++) {
            if (jTextField1.getText().equals(Application.getUsers().get(i).getemail())) {
                if (getPasswordAsString(jPasswordField1).equals(Application.getUsers().get(i).getpassword()+"")) {
                        Application.getUserspage().setVisible(true);
                    Application.getLoginpage().setVisible(false);
                    jTextField1.setText("");
                    Application.setPublicuser(Application.getUsers().get(i));
                    jPasswordField1.setText("");
                   Application.getUserspage().getjTextField2().setText(Application.getUsers().get(i).getname());
                     Application.getUserspage().getjTextField3().setText(Application.getUsers().get(i).getphone()+"");
                      Application.getUserspage().getjTextField4().setText(Application.getUsers().get(i).getage()+"");
                      UserPage.getjPasswordField1().setText("");
                    UserPage.getl3().setText(welcome + Application.getUsers().get(i).getname());
                       StringBuilder h= new StringBuilder(nomessage);
            for(int ip=0;ip<Application.getPublicuser().messages.size();ip++){
                if(ip==0) h = new StringBuilder();
                h.append(Application.getPublicuser().messages.get(ip)).append("\n");
                    }
               
         UserPage.getjTextArea2().setText(h.toString());
         UserPage.getjTextArea2().setEditable(false);
                    isValidUser = true;
                } else {
                    JOptionPane.showMessageDialog(null, invalidpass);
                }
                break;
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



    private javax.swing.JPasswordField jPasswordField1;
    private JTextField jTextField1;
    private JTextField jTextField3;

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    void removecontents() {
        jTextField1.setText("");
          jPasswordField1.setText("");
            jTextField3.setText("");
         }
}
