
package yasmeen.softwareproject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class PostPanel extends javax.swing.JPanel {
    static class ImageLabelFactory {
        private ImageLabelFactory() {
            // Initialization code if needed
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
                          130,
                       130,
                        Image.SCALE_SMOOTH
                    );

                  
                    label.setIcon(new ImageIcon(scaledImage));
                }
            });

           
            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
         
            label.setText("Image load error: " + e.getMessage());
        }

        return label;
    }

}

  public static String divideText(JLabel label, String text) {
        FontMetrics fontMetrics = label.getFontMetrics(label.getFont());
        int labelWidth = 116;
        List<String> lines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        
        String[] words = text.split(" ");
        
        for (String word : words) {
         
            if (fontMetrics.stringWidth(currentLine + word) < labelWidth) {
                currentLine.append(word).append(" ");
            } else {
                
                lines.add(currentLine.toString().trim());
                currentLine = new StringBuilder(word + " ");
            }
        }
    
        if (!currentLine.isEmpty()) {
            lines.add(currentLine.toString().trim());
        }
        
      
      
        return "<html>"+String.join("<br>", lines)+"</html>";
    }
private final String path;
private static final String RatingThank ="Thanks for rating the post";

  
int id;
    public PostPanel(String name, String des, String path, int id) {
        this.path=path;
        initComponents();
      this.id=id;
      

jLabel2.setSize(20,20);
jLabel1.setText(name);

jLabel3.setText(divideText(jLabel3,des));


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
        r1.addActionListener(e -> {

            r1.setSelected(true);
             r2.setSelected(false);
              r3.setSelected(false);
               r4.setSelected(false);
                r5.setSelected(false);
                Application.getPosts().get(id).getRates().add(1);
                JOptionPane.showMessageDialog(null, RatingThank);


              });
          r2.addActionListener(e -> {

              r1.setSelected(true);
               r2.setSelected(true);
                r3.setSelected(false);
                 r4.setSelected(false);
                  r5.setSelected(false);
               Application.getPosts().get(id).getRates().add(2);
                  JOptionPane.showMessageDialog(null, RatingThank);

                });
            r3.addActionListener(e -> {

                r1.setSelected(true);
                 r2.setSelected(true);
                  r3.setSelected(true);
                   r4.setSelected(false);
                    r5.setSelected(false);
                 Application.getPosts().get(id).getRates().add(3);
                    JOptionPane.showMessageDialog(null, RatingThank);

                  });
              r4.addActionListener(e -> {

                  r1.setSelected(true);
                   r2.setSelected(true);
                    r3.setSelected(true);
                     r4.setSelected(true);
                      r5.setSelected(false);
                   Application.getPosts().get(id).getRates().add(4);
                      JOptionPane.showMessageDialog(null, RatingThank);

                    });
                r5.addActionListener(e -> {

                    r1.setSelected(true);
                     r2.setSelected(true);
                      r3.setSelected(true);
                       r4.setSelected(true);
                        r5.setSelected(true);
                     Application.getPosts().get(id).getRates().add(5);
                        JOptionPane.showMessageDialog(null, RatingThank);

                      });
        
    }


     private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLabel jLabel4 = new JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = ImageLabelFactory.createImageLabel1(path);

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name of product");

        jLabel4.setFont(new java.awt.Font("Stylus BT", Font.PLAIN, 24));  
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
    }



    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;


}
