
package yasmeen.softwareproject;

import java.awt.*;

import java.io.File;
import java.security.SecureRandom;
import javax.swing.*;

import yasmeen.softwareproject.Owner.ImageButton;

import static yasmeen.softwareproject.Application.invalidvalue;
import static yasmeen.softwareproject.Owner.createImageLabel1;

class Jpanelcolored extends JPanel{
    Color c1;
     Color   c2;
    public Jpanelcolored(Color s1, Color s2){
        c1=s1;
        c2=s2;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        Color color1 = c1;
        Color color2 =c2;
        GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

}

public class Admin1 extends javax.swing.JFrame {
String path ="C:\\Users\\nd\\Desktop\\248\\New folder\\";

String typee="Stylus BT";
String p19="p19.png";
    public static class ImageButto extends JLabel {
        private transient Image image;

        public ImageButto(String imagepath) {
            try {
                image = new ImageIcon(imagepath).getImage();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, invalidvalue);
            }



        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {

                int imageWidth = getWidth();
                int imageHeight = getHeight();
                g.drawImage(image, 0, 0, imageWidth, imageHeight, this);
            }
        }


    }

    public Admin1() {
        initComponents();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width / 2;
        int centerY = screenSize.height / 2;
        this.setLocation(centerX - this.getWidth() / 2, centerY - this.getHeight() / 2);
        setSize(new Dimension(this.getWidth()-50,this.getHeight()-20));

    }
    String enter="Enter a valid value";
    private void initComponents() {

        JPanel jPanel13 = new JPanel();
        jLabel2 = new javax.swing.JLabel();
        javax.swing.JTabbedPane jTabbedPane11 = new javax.swing.JTabbedPane();
        JPanel jPanel3 = new JPanel();
        javax.swing.JButton jButton2 = new ImageButton(path +"p10.png");
        JLabel jLabel7 = createImageLabel1(path +p19);
        JPanel jPanel4 = new JPanel();
        javax.swing.JButton jButton10 = new ImageButton(path +"p9.png");
        javax.swing.JButton jButton11 = new ImageButton(path +"p11.png");
        JLabel jLabel9 = createImageLabel1(path +p19);
        JPanel jPanel24 = new JPanel();
        javax.swing.JButton jButton7 = new ImageButton(path +"p14.png");
        JLabel jLabel25 = createImageLabel1(path +p19);
        javax.swing.JButton jButton8 = new ImageButton(path +"p13.png");
        javax.swing.JButton jButton9 = new ImageButton(path +"p17.png");
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new ImageButto("C:\\Users\\Hp\\Desktop\\nn.png");
        JLabel jLabel3 = new JLabel();
        jTextField1 = new javax.swing.JTextField();
        JLabel jLabel4 = new JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        String p16="p16.png";
        javax.swing.JButton jButton3 = new ImageButton(path +p16);
        JLabel jLabel11 = createImageLabel1(path +p19);
        JPanel jPanel6 = new Jpanelcolored(Color.white, Color.white);
        JLabel jLabel13 = new JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        JLabel jLabel21 = new JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        JLabel jLabel14 = createImageLabel1(path +p19);
        JLabel jLabel15 = new JLabel();
        javax.swing.JButton jButton5 = new ImageButton(path +p16);
        JPanel jPanel7 = new JPanel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel22 = new JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        JLabel jLabel23 = createImageLabel1(path +p19);
        JLabel jLabel24 = new JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        javax.swing.JButton jButton6 = new ImageButton(path +p16);
        javax.swing.JButton jButton14 = new ImageButton(path +"p7.png");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel13.setBackground(new java.awt.Color(227, 240, 231));

        jLabel2.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Back Yasmeen");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane11.addTab("User Management ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton10.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Add Product");

        jButton10.addActionListener(this::jButton10ActionPerformed);

        jButton11.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Update Product");

        jButton11.addActionListener(this::jButton11ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane11.addTab("Content Management", jPanel4);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add Product");

        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Update Product");

        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Monitor sales and profits");

        jButton9.addActionListener(this::jButton9ActionPerformed);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel24Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
        );
        jPanel24Layout.setVerticalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))))
        );

        jTabbedPane11.addTab("Monitoring and Reporting", jPanel24);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("The Name of the product");

        jLabel4.setText("The discription of the product");

        jButton1.setBackground(new java.awt.Color(227, 240, 231));
        jButton1.setText("path of the picture");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton3.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton3.setText("akm");
        jButton3.addActionListener(evt -> jButton3ActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jTextField3)
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(164, 164, 164)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(203, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
        );

        jTabbedPane11.addTab("Add Post", jPanel1);

        jLabel13.setFont(new java.awt.Font(typee, Font.PLAIN, 24));
        jLabel13.setText("Enter the old Password");

        jPasswordField2.setFont(new java.awt.Font(typee, Font.PLAIN, 24));

        jLabel21.setFont(new java.awt.Font(typee, Font.PLAIN, 24));
        jLabel21.setText("Enter the new Password");

        jPasswordField3.setFont(new java.awt.Font(typee, Font.PLAIN, 24));

        jLabel15.setFont(new java.awt.Font(typee, Font.PLAIN, 24));
        jLabel15.setText("change password");

        jButton5.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Confirm");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel15)
                                .addContainerGap(285, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))))
        );

        jTabbedPane11.addTab("Change Password", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font(typee, Font.PLAIN, 20));
        jLabel5.setText("Change the Phone Number");

        jLabel6.setFont(new java.awt.Font(typee, Font.PLAIN, 20));
        jLabel6.setText("Change the Name ");

        jLabel22.setFont(new java.awt.Font(typee, Font.PLAIN, 20));
        jLabel22.setText("Change the Age");

        jTextField7.setFont(new java.awt.Font(typee, Font.PLAIN, 24));


        jTextField8.setFont(new java.awt.Font(typee, Font.PLAIN, 24));


        jTextField9.setFont(new java.awt.Font(typee, Font.PLAIN, 24));

        jLabel24.setFont(new java.awt.Font(typee, Font.PLAIN, 20));
        jLabel24.setText("Confirm the password");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));

        jButton6.setFont(new java.awt.Font(typee, Font.BOLD, 24));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Confirm");

        jButton6.addActionListener(this::jButton6ActionPerformed);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel24)
                                        .addComponent(jTextField9)
                                        .addComponent(jTextField7)
                                        .addComponent(jTextField8)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel24))
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );

        jTabbedPane11.addTab("Account Management ", jPanel7);

        jButton14.addActionListener(this::jButton14ActionPerformed);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(jTabbedPane11)
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton3ActionPerformed() {

        Application.addpost(jTextField3.getText(), jTextField2.getText(), jTextField1.getText());
        JOptionPane.showMessageDialog(null, "The post is added successfuly");
        jTextField3.setText("");
        jTextField2.setText("");
        jTextField1.setText("");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        jTextField3.setText(getFilepath());
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {

        JOptionPane.showMessageDialog(rootPane,Application.getallproducts());
    }


    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {

        String name=JOptionPane.showInputDialog(rootPane, "What si the name of the file ?");
        Application.generatereport(Application.getsalesmessage(), name);
    }


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

        JOptionPane.showMessageDialog(null, Application.getsalesmessage());
    }



    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {

        StringBuilder h= new StringBuilder("There is no posts");
        for(int i=0;i<Application.posts.size();i++){
            if(i==0){
                h = new StringBuilder("#. post rate\n1. " + Application.posts.get(i).getrate() + "\n");
            } else{
                h.append((i + 1)).append(". ").append(Application.posts.get(i).getrate()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, h.toString());
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {

        String index=JOptionPane.showInputDialog(Application.getallproducts());
        if(Application.isNumber(index)){
            int x=Integer.parseInt(index);
            if(x<0||x>Application.products.size()){
                JOptionPane.showMessageDialog(rootPane, enter);
            }else{
                String str1=JOptionPane.showInputDialog("What is the new Price of the product ?");
                if(Application.isNumber(str1)){
                    String str2=JOptionPane.showInputDialog("What is the new Expire Date of the product ?");
                    if(Application.isValidFutureDate(str2)){
                        Application.updateproduct(x-1, Integer.parseInt(str1), str2);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Enter a valid Expire Date");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Enter a valid Price");
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, enter);
        }
    }



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        StringBuilder h= new StringBuilder("There is no information");
        for(int i=0;i<Application.Owners.size();i++){
            if(i==0){
                h = new StringBuilder("Owners :\n");
            }
            h.append(Application.Owners.get(i).getname()).append("\n");
        }
        for(int i=0;i<Application.suppliers.size();i++){
            if(i==0){
                h.append("Suppliers :\n");
            }
            h.append(Application.suppliers.get(i).getname());
        }

        JOptionPane.showMessageDialog(null, h.toString());
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {

        Application.adminpage.setVisible(false);
        Application.adminpage=new Admin1();
        Application.loginpage.setVisible(true);
    }




    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        if (!Application.isNumber(jTextField9.getText()) || jTextField9.getText().length() >= 3) {
            JOptionPane.showMessageDialog(rootPane, "Enter a valid age");
        } else {
            Application.updateinformation(jTextField7.getText(), Integer.parseInt(jTextField9.getText()), Integer.parseInt(jTextField8.getText()), Integer.parseInt(jPasswordField1.getText()));
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jPasswordField2.getText().equals(Application.publicuser.getpassword() + "")) {
            SecureRandom random = new SecureRandom();
            int verificationCode = 10000 + random.nextInt(90000);
            Application.sendEmail("s12112895@stu.najah.edu", Application.publicuser.getemail(), "Your code is " + verificationCode + "\n" + "Please don't share this code with anyone", "nhdo kelh sbgl qynb");
            String b = JOptionPane.showInputDialog("We have sent a verification Code to your email\nPlease write it here");
            if (Application.isNumber(b)) {
                if (Integer.parseInt(b) == verificationCode) {
                    Application.updatepassword(Integer.parseInt(jPasswordField3.getText()));
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong verificatio code");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter valid old password");
        }
    }

    public static String getFilepath() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);


        frame.dispose();

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        } else {
            return null;
        }
    }

    public javax.swing.JLabel jLabel2;
    public javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;

}
