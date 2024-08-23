/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package yasmeen.softwareproject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hp
 */

public class post_panel extends javax.swing.JPanel {
    static class ImageLabelFactory {

    /**
     * Creates a JLabel with a scaled image to fit the label size.
     *
     * @param imagePath The path of the image file.
     * @return A JLabel containing the scaled image.
     */
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
                          130,
                       130,
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
public static int rate=1;
  public static String divideText(JLabel label, String text) {
        FontMetrics fontMetrics = label.getFontMetrics(label.getFont());
        int labelWidth = 116;
        List<String> lines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        
        String[] words = text.split(" ");
        
        for (String word : words) {
         
            // Check if adding this word would exceed the label's width
            if (fontMetrics.stringWidth(currentLine + word) < labelWidth) {
                currentLine.append(word).append(" ");
            } else {
                // If the current line is too wide, add it to the list and start a new line
                lines.add(currentLine.toString().trim());
                currentLine = new StringBuilder(word + " ");
            }
        }
        // Add the last line if it's not empty
        if (currentLine.length() > 0) {
            lines.add(currentLine.toString().trim());
        }
        
        // Join the lines with HTML line breaks
        return "<html>"+String.join("<br>", lines)+"</html>";
    }
private String path,des;




    /**
     * Creates new form post_panel
     */
int id;
    public post_panel(String name,String des,String path,int id) {
        this.path=path;
        this.des=des;
        initComponents();
      this.id=id;
      

jLabel2.setSize(20,20);
jLabel1.setText(name);

jLabel3.setText(divideText(jLabel3,des));

//jLabel2=new ImageLabel(path);
        JRadioButton r1=new StarRadioButton("", 20);
        JRadioButton r2=new StarRadioButton("", 20);
        JRadioButton r3=new StarRadioButton("", 20);
        JRadioButton r4=new StarRadioButton("", 20);
        JRadioButton r5=new StarRadioButton("", 20);
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(r1);
        r1.setSelected(true);
        jPanel1.add(r2);
        jPanel1.add(r3);
        jPanel1.add(r4);
        jPanel1.add(r5);
        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=1;
                r1.setSelected(true);
                 r2.setSelected(false);
                  r3.setSelected(false);
                   r4.setSelected(false);
                    r5.setSelected(false);
                    Application.posts.get(id).getRates().add(rate);
                    JOptionPane.showMessageDialog(null, "Thanks for rating the post");
                    
                  
                  }
        });
          r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=2;
                r1.setSelected(true);
                 r2.setSelected(true);
                  r3.setSelected(false);
                   r4.setSelected(false);
                    r5.setSelected(false);
                 Application.posts.get(id).getRates().add(rate);
                    JOptionPane.showMessageDialog(null, "Thanks for rating the post");
                    
                  }
        });
            r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=3;
                r1.setSelected(true);
                 r2.setSelected(true);
                  r3.setSelected(true);
                   r4.setSelected(false);
                    r5.setSelected(false);
                 Application.posts.get(id).getRates().add(rate);
                    JOptionPane.showMessageDialog(null, "Thanks for rating the post");
                    
                  }
        });
              r4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=4;
                r1.setSelected(true);
                 r2.setSelected(true);
                  r3.setSelected(true);
                   r4.setSelected(true);
                    r5.setSelected(false);
                 Application.posts.get(id).getRates().add(rate);
                    JOptionPane.showMessageDialog(null, "Thanks for rating the post");
                    
                  }
        });
                r5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=5;
                r1.setSelected(true);
                 r2.setSelected(true);
                  r3.setSelected(true);
                   r4.setSelected(true);
                    r5.setSelected(true);
                 Application.posts.get(id).getRates().add(rate);
                    JOptionPane.showMessageDialog(null, "Thanks for rating the post");
                    
                  }
        });
        
    }
    public post_panel()
    {
         initComponents(); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new ImageLabelFactory().createImageLabel1(path);

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name of product");

        jLabel4.setFont(new java.awt.Font("Stylus BT", 0, 24)); // NOI18N
        jLabel4.setText("review");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
