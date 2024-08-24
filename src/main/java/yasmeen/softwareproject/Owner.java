
package yasmeen.softwareproject;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Graphics;

import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;




 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Objects;
import javax.imageio.ImageIO;

 

  
 



class TransparentRadioButton extends JRadioButton {

    public TransparentRadioButton(String text) {
        super(text);

        setOpaque(false);

        setBorder(BorderFactory.createEmptyBorder());

        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(new Color(0, 0, 0, 0));
        g.fillRect(0, 0, getWidth(), getHeight());

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
// This method is intentionally left empty because the default border painting
        // is not needed for this component.
    }
}

public class Owner extends JFrame {
    public static class ImageButton extends JButton {
    private transient Image image;

    public ImageButton(String imagePath) {
        try {
            image = new ImageIcon(imagePath).getImage();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, VALIDATOR);
        }


        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
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
     public static JLabel createImageLabel1(String imagePath) {
        JLabel label = new JLabel();

        try {

            BufferedImage image = ImageIO.read(new File(imagePath));
            if (image == null) {
                throw new IOException("Image could not be read from path: " + imagePath);
            }


            ImageIcon icon = new ImageIcon(image);


            label.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {

                    Image scaledImage = icon.getImage().getScaledInstance(
                         280,
                       220,
                        Image.SCALE_SMOOTH
                    );


                    label.setIcon(new ImageIcon(scaledImage));
                }
            });


            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(null, VALIDATOR);
        }

        return label;
    }

    private static final String PASS ="nhdo kelh sbgl qynb";
    private static final String PATH ="C:\\Users\\nd\\Desktop\\248\\New folder\\";
    private static final String P19 ="p19.png";
    private static final String P16 ="p16.png";
    private static final String STYLE ="Stylus BT";
    private static final String VALIDATOR ="Enter a valid value";

    private static final String COMPLETE ="Complete";


    private static final String PENDING ="Pending";
    private static final String CASH ="Cash";

    public Owner() {

        
        initComponents();
        jRadioButton1.setSelected(true);
jTextArea2.setEditable(false);
if(Application.getPublicuser().messages.isEmpty()){
 jTextArea2.setText("There are no messages Received");
}else{
 jTextArea2.setText("");
 for(int i=0;i<Application.getPublicuser().messages.size();i++){
   jTextArea2.append(Application.getPublicuser().messages.get(i)+"\n");
 }
}
 ArrayList<String> items=new ArrayList<>();
       for(int i=0;i<Application.getSuppliers().size();i++){
          items.add(Application.getSuppliers().get(i).getname());
       }
    
Application.populateAndSetupList(jlist1, items);
if(!Application.getSuppliers().isEmpty()){
      jlist1.setEnabled(true);
    }  
 ArrayList<String> items2=new ArrayList<>();
       for(int i=0;i<Application.getSales().size();i++){
          items2.add(Application.getSales().get(i).getname()+"                  "+Application.getSales().get(i).status+"                  "+Application.getSales().get(i).getprofit());
       }
    
Application.populateAndSetupList(jlist3, items2);
if(!Application.getSales().isEmpty()){
      jlist3.setEnabled(true);
    }  

  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width / 2;
        int centerY = screenSize.height / 2;
        this.setLocation(centerX - this.getWidth() / 2, centerY - this.getHeight() / 2);
       

    }
    

    private void initComponents() {

        JPanel jPanel13 = new JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTabbedPane jTabbedPane11 = new JTabbedPane();
        JPanel jPanel4 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel5 = new JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
       
        JLabel jLabel4 = createImageLabel1(PATH + P19);

        JLabel jLabel6 = new JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        JButton jButton6 = new ImageButton(PATH + P16);
        JPanel jPanel5 = new JPanel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel10 = createImageLabel1(PATH + P19);
        JButton jButton2 = new ImageButton(PATH + P16);
        JPanel jPanel1 = new JPanel();
        JLabel jLabel13 = new JLabel();
        JScrollPane jScrollPane5 = new JScrollPane();
        jlist3 = new javax.swing.JList<>();
        JLabel jLabel16 = new JLabel();
        JLabel jLabel17 = new JLabel();
        JLabel jLabel18 = new JLabel();
        jRadioButton1 = new TransparentRadioButton(COMPLETE);
        jRadioButton2 = new TransparentRadioButton(PENDING);
        jRadioButton3 = new TransparentRadioButton(CASH);
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
        JButton jButton5 = new ImageButton(PATH + P16);
        JPanel jPanel6 = new Jpanelcolored(Color.white, Color.white);
        JLabel jLabel7 = new JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        JLabel jLabel9 = new JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        JLabel jLabel14 = createImageLabel1(PATH + P19);
        JLabel jLabel15 = new JLabel();
        JButton jButton3 = new ImageButton(PATH + P16);
        JPanel jPanel3 = new JPanel();
        JButton jButton7 = new ImageButton(PATH +"p1.png");
        JButton jButton8 = new ImageButton(PATH +"p4.png");
        JButton jButton9 = new ImageButton(PATH +"p5.png");
        JButton jButton10 = new ImageButton(PATH +"p2.png");
        JButton jButton11 = new ImageButton(PATH +"p6.png");
        JButton jButton12 = new ImageButton(PATH +"p3.png");
        JLabel jLabel19 = new JLabel();
        JLabel jLabel20 = new JLabel();
        JLabel jLabel21 = new JLabel();
        JLabel jLabel22 = new JLabel();
        JLabel jLabel23 = new JLabel();
        JLabel jLabel24 = new JLabel();
        JLabel jLabel25 = createImageLabel1(PATH + P16);
        JButton jButton4 = new ImageButton(PATH +"p7.png");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel13.setBackground(new java.awt.Color(227, 240, 231));

        jLabel2.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
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
                .addContainerGap(58, Short.MAX_VALUE))
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

        jTabbedPane11.addTab("Account Management ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font(STYLE, Font.PLAIN, 24));
        jLabel8.setText("Change the Status of items ");

        jButton2.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));


        jButton2.addActionListener(this::jButton2ActionPerformed);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font(STYLE, Font.PLAIN, 18));
        jLabel13.setText("Items that have been sold");

        jScrollPane5.setViewportView(jlist3);

        jLabel16.setText("Name");

        jLabel17.setText("Status");

        jLabel18.setText("quantity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel18)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jRadioButton1.setFont(new java.awt.Font(STYLE, Font.PLAIN, 18));
        jRadioButton1.setText(COMPLETE);
        jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);

        jRadioButton2.setFont(new java.awt.Font(STYLE, Font.PLAIN, 18));
        jRadioButton2.setText(PENDING);
        jRadioButton2.addActionListener(this::jRadioButton2ActionPerformed);

        jRadioButton3.setFont(new java.awt.Font(STYLE, Font.PLAIN, 18));
        jRadioButton3.setText(CASH);
        jRadioButton3.addActionListener(this::jRadioButton3ActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel8))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jRadioButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane11.addTab("Order Management ", jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
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
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
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

        jTabbedPane11.addTab("getSuppliers()", jPanel2);

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

        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel15)
                .addContainerGap(283, Short.MAX_VALUE))
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

        jTabbedPane11.addTab("Change Password", jPanel6);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add Product");

        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Update Product");

        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Monitor getSales() and profits");

        jButton9.addActionListener(this::jButton9ActionPerformed);

        jButton10.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Remove Product");

        jButton10.addActionListener(this::jButton10ActionPerformed);

        jButton11.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Implement discount");

        jButton11.addActionListener(this::jButton11ActionPerformed);

        jButton12.setFont(new java.awt.Font(STYLE, Font.BOLD, 24));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("best-selling product");

        jButton12.addActionListener(this::jButton12ActionPerformed);

        jLabel19.setText("best-selling product");

        jLabel20.setText("Remove Product");

        jLabel21.setText("Add Product");

        jLabel22.setText("Monitor getSales() and profits");

        jLabel23.setText("Implement discount");

        jLabel24.setText("Update Product");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel19)))
                .addGap(32, 32, 32)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel23))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane11.addTab("Product Management", jPanel3);

        jButton4.addActionListener(this::jButton4ActionPerformed);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jTabbedPane11)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 374, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {

        //JOptionPane.showMessageDialog(rootPane,Application.getSales().message());
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
         
        Application.getOwnerpage().setVisible(false);
             Application.setOwnerpage(new Owner());
        Application.getLoginpage().setVisible(true);
        
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         
         Application.setStatus(PENDING);
         jRadioButton3.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton2.setSelected(true);
         
    }



  
  
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
         
        Application.setStatus(COMPLETE);
        jRadioButton3.setSelected(false);
jRadioButton2.setSelected(false);
jRadioButton1.setSelected(true);
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
         
jRadioButton2.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton3.setSelected(true);
         Application.setStatus(CASH);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        if (Application.getSales().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "There are no Orders happened");
        } else {
            Application.getSales().get(Application.getOrder()).updatestatus(Application.getStatus());
            ArrayList<String> items2 = new ArrayList<>();
            for (int i = 0; i < Application.getSales().size(); i++) {
                items2.add(Application.getSales().get(i).getname() + "   " + Application.getSales().get(i).status + "   " + Application.getSales().get(i).getprofit());
            }

            Application.populateAndSetupList(jlist3, items2);
            if (!Application.getSales().isEmpty()) {
                jlist3.setEnabled(true);
            }

        }

    }



    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
         
          if(!Application.isNumber(jTextField3.getText())||jTextField3.getText().length()>=3){
            JOptionPane.showMessageDialog(rootPane, "Enter a valid age");}

        else {
            Application.updateinformation(jTextField1.getText(), Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField2.getText()), Integer.parseInt(getPasswordAsString(jPasswordField1)));
        }
    }

    public static String getPasswordAsString(JPasswordField passwordField) {
        char[] passwordChars = passwordField.getPassword();
        String passwordString = new String(passwordChars);
        java.util.Arrays.fill(passwordChars, '\0');
        return passwordString;
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        String name = getProductName();
        if (isProductExisting(name)) {
            showProductExistsMessage();
        } else {
            handleNewProduct();
        }
    }

    private String getProductName() {
        return JOptionPane.showInputDialog("What is the name of the new product ?");
    }

    private boolean isProductExisting(String name) {
        for (int i = 0; i < Application.getProducts().size(); i++) {
            if (name.equals(Application.getProducts().get(i).getname())) {
                return true;
            }
        }
        return false;
    }

    private void showProductExistsMessage() {
        JOptionPane.showMessageDialog(rootPane, "The Product is exist, If you want more of it please request it from a Supplier");
    }

    private void handleNewProduct() {
        String name=getInput("What is the name of the new product ?");
        String price = getInput("What is the price of the new product ?");
        if (Application.isNumber(price)) {
            String quantity = getInput("What is the quantity of the new product ?");
            if (Application.isNumber(quantity)) {
                String date = getInput("What is the Expire Date of the new product ? \nexample: 1/1/2024");
                if (Application.isValidFutureDate(date)) {
                    String description = getInput("What is the description of this new product ?");
                    String discount = getInput("How much is the discount of the new product ?");
                    processDiscountAndAddProduct(name,price, quantity, date, description, discount);
                } else {
                    showInvalidExpireDateMessage();
                }
            } else {
                showInvalidQuantityMessage();
            }
        } else {
            showInvalidPriceMessage();
        }
    }

    private String getInput(String message) {
        return JOptionPane.showInputDialog(message);
    }

    private void processDiscountAndAddProduct(String name,String price, String quantity, String date, String description, String discount) {
        if (discount.isEmpty()) {
            Application.addproduct(name, Integer.parseInt(price), Integer.parseInt(quantity), date, 0, description);
        } else {
            if (Application.isNumber(discount)) {
                int dis = Integer.parseInt(discount);
                if (dis < 0 || dis >= 100) {
                    showInvalidDiscountMessage();
                } else {
                    Application.addproduct(name, Integer.parseInt(price), Integer.parseInt(quantity), date, dis, description);
                }
            }
        }
    }

    private void showInvalidExpireDateMessage() {
        JOptionPane.showMessageDialog(rootPane, "Enter a valid Expire Date");
    }

    private void showInvalidQuantityMessage() {
        JOptionPane.showMessageDialog(rootPane, "Enter a valid Quantity");
    }

    private void showInvalidPriceMessage() {
        JOptionPane.showMessageDialog(rootPane, "Enter a valid Price");
    }

    private void showInvalidDiscountMessage() {
        JOptionPane.showMessageDialog(rootPane, "The Discount is not correct");
    }



    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
         
        String index=JOptionPane.showInputDialog(Application.getProducts());
        if(Application.isNumber(index)){
            int x=Integer.parseInt(index);
            if(x<0||x>Application.getProducts().size()){
                JOptionPane.showMessageDialog(rootPane, VALIDATOR);
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
            JOptionPane.showMessageDialog(rootPane, VALIDATOR);
        }

    }






    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
         
        String index=JOptionPane.showInputDialog(Application.getProducts());
        if(Application.isNumber(index)){
            int x=Integer.parseInt(index);
            if(x<0||x>Application.getProducts().size()){
                JOptionPane.showMessageDialog(rootPane, VALIDATOR);
            }else{
                Application.removeproduct(Application.getProducts().get(x-1).getname());
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, VALIDATOR);
        }

    }



    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        int productIndex = getProductIndex();
        if (productIndex >= 0) {
            handleDiscount(productIndex);
        } else {
            showInvalidIndexMessage();
        }
    }

    private int getProductIndex() {
        String indexInput = JOptionPane.showInputDialog(Application.getProducts());
        if (Application.isNumber(indexInput)) {
            int index = Integer.parseInt(indexInput);
            if (index >= 0 && index <= Application.getProducts().size()) {
                return index;
            }
        }
        return -1; // Indicates an invalid index
    }

    private void handleDiscount(int productIndex) {
        String discountInput = JOptionPane.showInputDialog("How much is the new Discount for the Product ?");
        if (discountInput.isEmpty()) {
            Application.implementdiscount(0, Application.getProducts().get(productIndex - 1));
        } else {
            processDiscount(discountInput, productIndex);
        }
    }

    private void processDiscount(String discountInput, int productIndex) {
        if (Application.isNumber(discountInput)) {
            int discount = Integer.parseInt(discountInput);
            if (discount >= 0 && discount < 100) {
                Application.implementdiscount(discount, Application.getProducts().get(productIndex - 1));
            } else {
                showInvalidDiscountMessage();
            }
        } else {
            showInvalidDiscountValueMessage();
        }
    }

    private void showInvalidIndexMessage() {
        JOptionPane.showMessageDialog(rootPane, VALIDATOR);
    }

   

    private void showInvalidDiscountValueMessage() {
        JOptionPane.showMessageDialog(rootPane, "The Discount value is not valid");
    }



    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
         
       try{ JOptionPane.showMessageDialog(rootPane, "The Best Selling profit came from the Product : "+ Objects.requireNonNull(Objects.requireNonNull(Application.getmaxprofit())).getname().toUpperCase()+" with Profit : "+Application.getMaxindex());}
       catch (Exception e){
           JOptionPane.showMessageDialog(rootPane, "There is no getSales() happened in this store");
       }

    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
         
            if(Application.getSuppliers().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "There are no getSuppliers() to send messages");
       }else{
           for(int i=0;i<Application.getSuppliers().size();i++){
           if(Application.getSuppliers().get(i).getname().equals(Application.getSuppliername())){
               String h="From "+Application.getPublicuser().getname()+" : "+jTextArea1.getText();
              Application.getSuppliers().get(i).messages.add(h);
                Application.sendEmail("s12112895@stu.najah.edu",  Application.getSuppliers().get(i).getemail(), h, PASS);
             
              JOptionPane.showMessageDialog(rootPane, "The message is sent to the supplier "+Application.getSuppliername());
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
                Application.sendEmail("s12112895@stu.najah.edu", Application.getPublicuser().getemail(), "Your code is "+verificationCode +"\n"+"Please don't share this code with anyone", PASS);
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


    private javax.swing.JLabel jLabel2;

    public JLabel getjLabel2() {
        return jLabel2;
    }

    private  javax.swing.JPasswordField jPasswordField1;

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;

    public JTextArea getjTextArea2() {
        return jTextArea2;
    }

    private javax.swing.JTextField jTextField1;

    public JTextField getjTextField1() {
        return jTextField1;
    }
    public JTextField getjTextField2() {
        return jTextField2;
    }
    public JTextField getjTextField3() {
        return jTextField3;
    }
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JList<String> jlist1;
    private javax.swing.JList<String> jlist3;
   
}
