
package yasmeen.softwareproject;

import yasmeen.softwareproject.Owner.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import java.util.ArrayList;

import static yasmeen.softwareproject.Owner.createImageLabel1;
import static yasmeen.softwareproject.Owner.getPasswordAsString;


public class Suppliersframe extends javax.swing.JFrame {
    private static final String any ="nhdo kelh sbgl qynb";
    private static final String P19 ="p19.png";
    private static final String P16 ="p16.png";
    private static final String CONFIRM ="Confirm";
   private static final String STYLE ="Stylus BT";
    private static final String PATH ="C:\\Users\\nd\\Desktop\\248\\New folder\\";

    public Suppliersframe() {
        initComponents();
        setSize(718, 470);
       ArrayList<String> items=new ArrayList<>();
       for(int i = 0; i<Application. getStoreowners().size(); i++){
          items.add(Application. getStoreowners().get(i).getname());
       }
    
Application.populateAndSetupList(jlist1, items);
if(!Application. getStoreowners().isEmpty()){
      jlist1.setEnabled(true);
    }
  
        
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width / 2;
        int centerY = screenSize.height / 2;
        this.setLocation(centerX - this.getWidth() / 2, centerY - this.getHeight() / 2);
         
       
    }


       private void initComponents() {

        JPanel jPanel1 = new JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTabbedPane jTabbedPane1 = new JTabbedPane();
        JPanel jPanel4 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel5 = new JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        JLabel jLabel4 = createImageLabel1(PATH+P19);
        JLabel jLabel6 = new JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        JButton jButton6 = new ImageButton(PATH+P16);
        JPanel jPanel6 = new Jpanelcolored(Color.white, Color.white);
        JLabel jLabel7 = new JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        JLabel jLabel9 = new JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        JLabel jLabel14 = createImageLabel1(PATH+P19);
        JLabel jLabel15 = new JLabel();
        JButton jButton3 = new ImageButton(PATH+P16);
        JPanel jPanel2 = new JPanel();
        JPanel jPanel7 = new JPanel();
        JScrollPane jScrollPane2 = new JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        JPanel jPanel8 = new JPanel();
        JLabel jLabel12 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JScrollPane jScrollPane3 = new JScrollPane();
        jlist1 = new javax.swing.JList<>();
        JButton jButton5 = new ImageButton(PATH+P16);

        JButton jButton14 = new ImageButton(PATH+"p7.png");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 240, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        jLabel2.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));  
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Back Yasmeen");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font(STYLE, Font.PLAIN, 20));  
        jLabel1.setText("Change the Phone Number");

        jLabel3.setFont(new java.awt.Font(STYLE, Font.PLAIN, 20));  
        jLabel3.setText("Change the Name ");

        jLabel5.setFont(new java.awt.Font(STYLE, Font.PLAIN, 20));  
        jLabel5.setText("Change the Age");

        jTextField1.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  


        jTextField2.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  


        jTextField3.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  

        jLabel6.setFont(new java.awt.Font(STYLE, Font.PLAIN, 20));  
        jLabel6.setText("Confirm the password");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));  

        jButton6.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));  
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText(CONFIRM);

        jButton6.addActionListener(this::jButton6ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Account Management ", jPanel4);

        jLabel7.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  
        jLabel7.setText("Enter the old Password");

        jPasswordField2.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  

        jLabel9.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  
        jLabel9.setText("Enter the new Password");

        jPasswordField3.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  

        jLabel15.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));  
        jLabel15.setText("change password");

        jButton3.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));  
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(CONFIRM);
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel15)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        jTabbedPane1.addTab("Change Password", jPanel6);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font(STYLE, Font.PLAIN, 18));  
        jLabel12.setText("Choose a Supplier");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel12)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Enter the message here");
        jScrollPane1.setViewportView(jTextArea1);


        jScrollPane3.setViewportView(jlist1);

        jButton5.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));  
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText(CONFIRM);
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Suppliers", jPanel2);

        jButton14.addActionListener(this::jButton14ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
         
        Application.getSupplierspage().setVisible(false);
        Application.setSupplierspage(new Suppliersframe());
        Application.getLoginpage().setVisible(true);

    }


   
   
   
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
         
        if(!Application.isNumber(jTextField3.getText())||jTextField3.getText().length()>=3){
            JOptionPane.showMessageDialog(rootPane, "Enter a valid age");}

        else {
            Application.updateinformation(jTextField1.getText(), Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField2.getText()), Integer.parseInt(getPasswordAsString(jPasswordField1)));
        }
    }



    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
         
        if(Application. getStoreowners().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "There are no owners to send messages");
        }else{
            for(int i = 0; i<Application. getStoreowners().size(); i++){
                if(Application. getStoreowners().get(i).getname().equals(Application.getSuppliername())){
                    String h="From "+Application.getPublicuser().getname()+" : "+jTextArea1.getText();
                              Application.sendEmail("s12112895@stu.najah.edu", Application. getStoreowners().get(UserPage.getIndex1()).getemail(), h, any);
                    
                    Application. getStoreowners().get(i).messages.add(h);
                    JOptionPane.showMessageDialog(rootPane, "The message is sent to the owner "+Application.getOwnername());
                    jTextArea1.setText("");
                    break;
                }
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
         
          if(getPasswordAsString(jPasswordField2).equals(Application.getPublicuser().getpassword()+"")){
         SecureRandom random = new SecureRandom();
        int verificationCode = 10000 + random.nextInt(90000);
                Application.sendEmail("s12112895@stu.najah.edu", Application.getPublicuser().getemail(), "Your code is "+verificationCode +"\n"+"Please don't share this code with anyone", any);
                 String b=JOptionPane.showInputDialog("We have sent a verification Code to your email\nPlease write it here");
                 if(Application.isNumber(b)){
                  if(Integer.parseInt(b)==verificationCode){
                      Application.updatepassword(Integer.parseInt(getPasswordAsString(jPasswordField3)));
                       }else{
                 JOptionPane.showMessageDialog(null, "Wrong verificatio code");
                 }
}
   }else{
       JOptionPane.showMessageDialog(null, "Please Enter valid old password");
   }
    }

    private  javax.swing.JLabel jLabel2;

    public JLabel getjLabel2() {
        return jLabel2;
    }

    private javax.swing.JPasswordField jPasswordField1;

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextArea jTextArea1;
    private  javax.swing.JTextArea jTextArea2;

    public JTextArea getjTextArea2() {
        return jTextArea2;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }
    public JTextField getjTextField2() {
        return jTextField2;
    }
    public JTextField getjTextField3() {
        return jTextField3;
    }
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JList<String> jlist1;
    
}
