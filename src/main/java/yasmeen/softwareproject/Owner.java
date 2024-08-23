
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

import javax.swing.event.ListSelectionEvent;


 
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
        // Ensure the button has a transparent background
        setOpaque(false);
        // Set the button's border to null to avoid any visible border
        setBorder(BorderFactory.createEmptyBorder());
        // Optionally, set the button's content area filled state to false
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Set the background color to be fully transparent
        g.setColor(new Color(0, 0, 0, 0));
        g.fillRect(0, 0, getWidth(), getHeight());
        // Paint the radio button's content
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Avoid painting the border
    }
}

public class Owner extends JFrame {
    public static class ImageButton extends JButton {
    private Image image;

    public ImageButton(String imagePath) {
        try {
            image = new ImageIcon(imagePath).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }


        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            // Scale the image to fit the button
            int imageWidth = getWidth();
            int imageHeight = getHeight();
            g.drawImage(image, 0, 0, imageWidth, imageHeight, this);
        }
    }

  
}
     public static JLabel createImageLabel1(String imagePath) {
        JLabel label = new JLabel();

        try {
            // Load the image
            BufferedImage image = ImageIO.read(new File(imagePath));
            if (image == null) {
                throw new IOException("Image could not be read from path: " + imagePath);
            }

            // Create an ImageIcon from the BufferedImage
            ImageIcon icon = new ImageIcon(image);

            // Add a ComponentListener to handle resizing
            label.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    // Scale the image to fit the label size
                    Image scaledImage = icon.getImage().getScaledInstance(
                         280,
                       220,
                        Image.SCALE_SMOOTH
                    );

                    // Update the ImageIcon with the scaled image
                    label.setIcon(new ImageIcon(scaledImage));
                }
            });

            // Initial setup to handle the case when the label is displayed
            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally set a default image or an error message
            label.setText("Image load error: " + e.getMessage());
        }

        return label;
    }

    /**
     * Creates new form Owner
     */
    public Owner() {
      
        
        initComponents();
        jRadioButton1.setSelected(true);
//        jPanel8=new Application.ListDisplayPanel(m);
jTextArea2.setEditable(false);
if(Application.publicuser.messages.isEmpty()){
 jTextArea2.setText("There are no messages Received");
}else{
 jTextArea2.setText("");
 for(int i=0;i<Application.publicuser.messages.size();i++){
   jTextArea2.append(Application.publicuser.messages.get(i)+"\n");
 }
}
 ArrayList<String> items=new ArrayList<>();
       for(int i=0;i<Application.suppliers.size();i++){
          items.add(Application.suppliers.get(i).getname());
       }
    
Application.populateAndSetupList(jlist1, items);
if(!Application.suppliers.isEmpty()){
      jlist1.setEnabled(true);
    }  
 ArrayList<String> items2=new ArrayList<>();
       for(int i=0;i<Application.sales.size();i++){
          items2.add(Application.sales.get(i).getname()+"                  "+Application.sales.get(i).status+"                  "+Application.sales.get(i).getprofit());
       }
    
Application.populateAndSetupList(jlist3, items2);
if(!Application.sales.isEmpty()){
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
        JLabel jLabel4 = createImageLabel1("C:\\Users\\nd\\Desktop\\248\\New folder\\p19.png");
        JLabel jLabel6 = new JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        JButton jButton6 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p16.png");
        JPanel jPanel5 = new JPanel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel10 = createImageLabel1("C:\\Users\\nd\\Desktop\\248\\New folder\\p19.png");
        JButton jButton2 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p16.png");
        JPanel jPanel1 = new JPanel();
        JLabel jLabel13 = new JLabel();
        JScrollPane jScrollPane5 = new JScrollPane();
        jlist3 = new javax.swing.JList<>();
        JLabel jLabel16 = new JLabel();
        JLabel jLabel17 = new JLabel();
        JLabel jLabel18 = new JLabel();
        jRadioButton1 = new TransparentRadioButton("Complete");
        jRadioButton2 = new TransparentRadioButton("Pending");
        jRadioButton3 = new TransparentRadioButton("Cash");
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
        JButton jButton5 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p16.png");
        JPanel jPanel6 = new ghk(Color.white, Color.white);
        JLabel jLabel7 = new JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        JLabel jLabel9 = new JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        JLabel jLabel14 = createImageLabel1("C:\\Users\\nd\\Desktop\\248\\New folder\\p19.png");
        JLabel jLabel15 = new JLabel();
        JButton jButton3 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p16.png");
        JPanel jPanel3 = new JPanel();
        JButton jButton7 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p1.png");
        JButton jButton8 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p4.png");
        JButton jButton9 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p5.png");
        JButton jButton10 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p2.png");
        JButton jButton11 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p6.png");
        JButton jButton12 = new ImageButton("C:\\Users\\nd\\Desktop\\248\\New folder\\p3.png");
        JLabel jLabel19 = new JLabel();
        JLabel jLabel20 = new JLabel();
        JLabel jLabel21 = new JLabel();
        JLabel jLabel22 = new JLabel();
        JLabel jLabel23 = new JLabel();
        JLabel jLabel24 = new JLabel();
        JLabel jLabel25 = createImageLabel1("C:\\Users\\nd\\Desktop\\248\\New folder\\p19.png");
        JButton jButton4 = new ImageButton("C:\\\\Users\\\\nd\\\\Desktop\\\\248\\\\New folder\\\\p7.png");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel13.setBackground(new java.awt.Color(227, 240, 231));

        jLabel2.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jLabel2.setText("Welcome Back Yasmeen");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 20)); // NOI18N
        jLabel1.setText("Change the Phone Number");

        jLabel3.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 20)); // NOI18N
        jLabel3.setText("Change the Name ");

        jLabel5.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 20)); // NOI18N
        jLabel5.setText("Change the Age");

        jTextField1.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jTextField2.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N
        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jTextField3.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 20)); // NOI18N
        jLabel6.setText("Confirm the password");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        jButton6.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Confirm");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited();
            }
        });
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

        jLabel8.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N
        jLabel8.setText("Change the Status of items ");

        jButton2.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Confirm");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited();
            }
        });
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 18)); // NOI18N
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

        jRadioButton1.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 18)); // NOI18N
        jRadioButton1.setText("Complete");
        jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);

        jRadioButton2.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 18)); // NOI18N
        jRadioButton2.setText("Pending");
        jRadioButton2.addActionListener(this::jRadioButton2ActionPerformed);

        jRadioButton3.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 18)); // NOI18N
        jRadioButton3.setText("Cash");
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

        jLabel12.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 18)); // NOI18N
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

        jlist1.addListSelectionListener(this::jlist1ValueChanged);
        jScrollPane3.setViewportView(jlist1);

        jButton5.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Confirm");
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

        jTabbedPane11.addTab("Suppliers", jPanel2);

        jLabel7.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N
        jLabel7.setText("Enter the old Password");

        jPasswordField2.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N
        jLabel9.setText("Enter the new Password");

        jPasswordField3.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24)); // NOI18N
        jLabel15.setText("change password");

        jButton3.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Confirm");
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

        jButton7.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add Product");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited();
            }
        });
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Update Product");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited();
            }
        });
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Monitor sales and profits");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited();
            }
        });
        jButton9.addActionListener(this::jButton9ActionPerformed);

        jButton10.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Remove Product");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited();
            }
        });
        jButton10.addActionListener(this::jButton10ActionPerformed);

        jButton11.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Implement discount");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited();
            }
        });
        jButton11.addActionListener(this::jButton11ActionPerformed);

        jButton12.setFont(new java.awt.Font("Stylus BT", Font.BOLD, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("best-selling product");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited();
            }
        });
        jButton12.addActionListener(this::jButton12ActionPerformed);

        jLabel19.setText("best-selling product");

        jLabel20.setText("Remove Product");

        jLabel21.setText("Add Product");

        jLabel22.setText("Monitor sales and profits");

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Application.ownerpage.setVisible(false);
             Application.ownerpage=new Owner();
        Application.loginpage.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
         Application.status="Pending";
         jRadioButton3.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton2.setSelected(true);
         
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2MouseExited() {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered() {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jlist1ValueChanged(ListSelectionEvent evt) {//GEN-FIRST:event_jlist1ValueChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jlist1ValueChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Application.status="Complete";
        jRadioButton3.setSelected(false);
jRadioButton2.setSelected(false);
jRadioButton1.setSelected(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here
jRadioButton2.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton3.setSelected(true);
         Application.status="Cash";
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Application.sales.isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "There are no Orders happened");
        }else{
            Application.sales.get(Application.order).updatestatus(Application.status);
             ArrayList<String> items2=new ArrayList<>();
       for(int i=0;i<Application.sales.size();i++){
          items2.add(Application.sales.get(i).getname()+"   "+Application.sales.get(i).status+"   "+Application.sales.get(i).getprofit());
       }
   
Application.populateAndSetupList(jlist3, items2);
if(!Application.sales.isEmpty()){
      jlist3.setEnabled(true);
    }  

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6MouseEntered() {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited() {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          if(!Application.isNumber(jTextField3.getText())||jTextField3.getText().length()>=3){
            JOptionPane.showMessageDialog(rootPane, "Enter a valid age");}
//                else if(jTextField2.getText().length()!=10||Application.isNumber(jTextField2.getText())){
//                     JOptionPane.showMessageDialog(rootPane, "Enter a valid Phone Number");}
        else {
            Application.updateinformation(jTextField1.getText(), Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField2.getText()), Integer.parseInt(jPasswordField1.getText()));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseEntered() {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
//        jButton3.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 30));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited() {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
      //  jButton3.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 24));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String name,price,quantity,date,discount;
        boolean flag=true;
        name=JOptionPane.showInputDialog("What is the name of the new product ?");
        for(int i=0;i<Application.products.size();i++){
            if(name.equals(Application.products.get(i).getname())){
                flag=false;
                JOptionPane.showMessageDialog(rootPane, "The Popduct is exist , If you want more of it please request it from a Supplier");
                break;

            }
        }
        if(flag){
            price=JOptionPane.showInputDialog("What is the price of the new product ?");
            if(Application.isNumber(price)){
                quantity=JOptionPane.showInputDialog("What is the quantity of the new product ?");
                if(Application.isNumber(quantity)){
                    date=JOptionPane.showInputDialog("What is the Expire Date of the new product ? \nexample : 1/1/2024");
                    if(Application.isValidFutureDate(date)){
                                String h=JOptionPane.showInputDialog("What is the descripton of this new product ?");
                        discount=JOptionPane.showInputDialog("How much is the discount of the new product ?");
                        if(discount.isEmpty()){
                    
                            Application.addproduct(name, Integer.parseInt(price), Integer.parseInt(quantity), date, 0,h);
                            //                     JOptionPane.showMessageDialog(rootPane, "The product "+name+" is added with discount 0");
                        }else{
                            if(Application.isNumber(discount)){
                                int dis=Integer.parseInt(discount);
                                if(dis<0||dis>=100){
                                    JOptionPane.showMessageDialog(rootPane, "The Discount is not correct");
                                }else{
                                    Application.addproduct(name, Integer.parseInt(price), Integer.parseInt(quantity), date, Integer.parseInt(discount),h);
                                    //                          JOptionPane.showMessageDialog(rootPane, "The product "+name+" is added with discount "+Integer.parseInt(discount));
                                }
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Enter a valid Expire Date");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Enter a valid Quantity");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Enter a valid Price");
            }

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseEntered() {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
      //  jButton8.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 30));
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited() {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
      //  jButton6.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 24));
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String index=JOptionPane.showInputDialog(Application.getallproducts());
        if(Application.isNumber(index)){
            int x=Integer.parseInt(index);
            if(x<0||x>Application.products.size()){
                JOptionPane.showMessageDialog(rootPane, "Enter a valid value");
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
            JOptionPane.showMessageDialog(rootPane, "Enter a valid value");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9MouseEntered() {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
      //  jButton7.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 30));
    }

    private void jButton9MouseExited() {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
       // jButton7.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 24));
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,Application.getsalesmessage());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10MouseEntered() {//GEN-FIRST:event_jButton10MouseEntered
        // TODO add your handling code here:
//        jButton8.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 30));
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited() {//GEN-FIRST:event_jButton10MouseExited
        // TODO add your handling code here:
     //   jButton8.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 24));
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String index=JOptionPane.showInputDialog(Application.getallproducts());
        if(Application.isNumber(index)){
            int x=Integer.parseInt(index);
            if(x<0||x>Application.products.size()){
                JOptionPane.showMessageDialog(rootPane, "Enter a valid value");
            }else{
                Application.removeproduct(Application.products.get(x-1).getname());
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Enter a valid value");
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11MouseEntered() {//GEN-FIRST:event_jButton11MouseEntered
        // TODO add your handling code here:
       // jButton9.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 30));
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited() {//GEN-FIRST:event_jButton11MouseExited
        // TODO add your handling code here:
      //  jButton9.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 24));
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String index=JOptionPane.showInputDialog(Application.getallproducts());
        if(Application.isNumber(index)){
            int x=Integer.parseInt(index);
            if(x<0||x>Application.products.size()){
                JOptionPane.showMessageDialog(rootPane, "Enter a valid value");
            }else{
                String discount=JOptionPane.showInputDialog("How much is the new Discount for the Product ?");
                if(discount.isEmpty()){
                    Application.implementdiscount(0, Application.products.get(x-1));
                    //                     JOptionPane.showMessageDialog(rootPane, "The product "+name+" is added with discount 0");
                }else{
                    if(Application.isNumber(discount)){
                        int dis=Integer.parseInt(discount);
                        if(dis<0||dis>=100){
                            JOptionPane.showMessageDialog(rootPane, "The Discount is not correct");
                        }else{
                            Application.implementdiscount(dis, Application.products.get(x-1));
                            //                          JOptionPane.showMessageDialog(rootPane, "The product "+name+" is added with discount "+Integer.parseInt(discount));
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "The Discount value is not valid");
                    }
                }

            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Enter a valid value");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12MouseEntered() {//GEN-FIRST:event_jButton12MouseEntered
        // TODO add your handling code here:
//        jButton10.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 30));
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited() {//GEN-FIRST:event_jButton12MouseExited
        // TODO add your handling code here:
      //  jButton10.setFont(new Font(jButton1.getFont().getFontName(), jButton1.getFont().getStyle(), 24));
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
       try{ JOptionPane.showMessageDialog(rootPane, "The Best Selling profit came from the Product : "+ Objects.requireNonNull(Objects.requireNonNull(Application.getmaxprofit())).getname().toUpperCase()+" with Profit : "+Application.maxindex);}
       catch (Exception e){
           JOptionPane.showMessageDialog(rootPane, "There is no sales happened in this store");
       }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            if(Application.suppliers.isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "There are no suppliers to send messages");
       }else{
           for(int i=0;i<Application.suppliers.size();i++){
           if(Application.suppliers.get(i).getname().equals(Application.suppliername)){
               String h="From "+Application.publicuser.getname()+" : "+jTextArea1.getText();
              Application.suppliers.get(i).messages.add(h);
                Application.sendEmail("s12112895@stu.najah.edu",  Application.suppliers.get(i).getemail(), h, "nhdo kelh sbgl qynb");
             
              JOptionPane.showMessageDialog(rootPane, "The message is sent to the supplier "+Application.suppliername);
              jTextArea1.setText("");
             break;
           }
       } 
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
   if(jPasswordField2.getText().equals(Application.publicuser.getpassword()+"")){
         SecureRandom random = new SecureRandom();
        int verificationCode = 10000 + random.nextInt(90000);
                Application.sendEmail("s12112895@stu.najah.edu", Application.publicuser.getemail(), "Your code is "+verificationCode +"\n"+"Please don't share this code with anyone", "nhdo kelh sbgl qynb");
                 String b=JOptionPane.showInputDialog("We have sent a verification Code to your email\nPlease write it here");
                 if(Application.isNumber(b)){
                  if(Integer.parseInt(b)==verificationCode){
                      Application.updatepassword(Integer.parseInt(jPasswordField3.getText()));
                       }else{
                 JOptionPane.showMessageDialog(null, "Wrong verificatio code");
                 }
}
   }else{
       JOptionPane.showMessageDialog(null, "Please Enter valid old password");
   }
    }


    public javax.swing.JLabel jLabel2;
    public javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JList<String> jlist1;
    private javax.swing.JList<String> jlist3;
    // End of variables declaration//GEN-END:variables
}
