/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package yasmeen.softwareproject;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class ImageLabelFactory1 {
    public static JLabel createImageLabel1(String imagePath) {
        JLabel label = new JLabel();

        try {
            // Load the image
            BufferedImage image = ImageIO.read(new File(imagePath));
           

            // Create an ImageIcon from the BufferedImage
            ImageIcon icon = new ImageIcon(image);

            // Add a ComponentListener to handle resizing
            label.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    // Scale the image to fit the label size
                    Image scaledImage = icon.getImage().getScaledInstance(
                       180,
                       180,
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

}
/**
 *
 * @author Hp
 */
public class card extends javax.swing.JPanel {
 private final String path;

 private final int quant;
 private final String name;
 private final int price;
 
    /**
     * Creates new form card
     */
    public card(int price,int quantity,String name,String path) {
        this.path=path;
        this.price=price;
        this.name=name;
        quant=quantity;
        initComponents();
        jLabel2.setSize(20,20);
        jLabel3.setText(quantity+"");
        jLabel4.setText(price+"");
       jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
     jPanel1.add(new JLabel(name));
   
        jLabel4.setVerticalAlignment(JLabel.TOP);
jLabel4.setHorizontalAlignment(JLabel.LEFT);
  jLabel3.setVerticalAlignment(JLabel.TOP);
jLabel3.setHorizontalAlignment(JLabel.RIGHT);
    }

    private void initComponents() {

        jLabel2 = ImageLabelFactory1.createImageLabel1(path);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked();
            }
        });

        jPanel1.setBackground(new java.awt.Color(227, 240, 231));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked() {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String h=JOptionPane.showInputDialog("How much quantity do you want to buy ?");
        if(!Application.isNumber(h)){
           JOptionPane.showMessageDialog(null, "invalid value");
        }else{
           int x=Integer.parseInt(h);
           if(x>quant){
                 JOptionPane.showMessageDialog(null, "invalid value");
     
           }else{
                      JOptionPane.showMessageDialog(null, "Your fee for this product is "+(price*x));
          Application.purchase(name, x);
           Application.userspage.jPanel21.removeAll();
             for(int i=0;i<Application.products.size();i++){
           Application.userspage.jPanel21.add(new card(Application.products.get(i).getprice(),Application.products.get(i).getquantity(),Application.products.get(i).getname(),Application.products.get(i).getpath()));
     
     
       }
            Application.userspage.jPanel29.removeAll();
             Application.userspage.jPanel29.revalidate();  
                 Application.userspage.jPanel29.repaint();
                  Application.userspage.jPanel21.revalidate();  
                 Application.userspage.jPanel21.repaint();
           }
        }
       
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
