
package yasmeen.softwareproject;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;



public class Card extends javax.swing.JPanel {

        public static JLabel createImageLabel1(String imagePath) {
            JLabel label = new JLabel();

            try {

                BufferedImage image = ImageIO.read(new File(imagePath));


                ImageIcon icon = new ImageIcon(image);


                label.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentResized(ComponentEvent e) {

                        Image scaledImage = icon.getImage().getScaledInstance(
                                180,
                                180,
                                Image.SCALE_SMOOTH
                        );


                        label.setIcon(new ImageIcon(scaledImage));
                    }
                });


                label.setIcon(icon);
            } catch (IOException e) {


                label.setText("Image load error: ");
            }

            return label;
        }


 private final String path;

 private final int quant;
 private final String name;
 private final int price;
 

    public Card(int price, int quantity, String name, String path) {
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

        jLabel4.setVerticalAlignment(SwingConstants.TOP);
jLabel4.setHorizontalAlignment(SwingConstants.LEFT);
  jLabel3.setVerticalAlignment(SwingConstants.TOP);
jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
    }

    private void initComponents() {

        jLabel2 = createImageLabel1(path);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
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
    }

    private void jLabel2MouseClicked() {
         
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
           UserPage.getjPanel21().removeAll();
             for(int i=0;i<Application.getProducts().size();i++){
           UserPage. getjPanel21().add(new Card(Application.getProducts().get(i).getprice(),Application.getProducts().get(i).getquantity(),Application.getProducts().get(i).getname(),Application.getProducts().get(i).getpath()));
     
     
       }
            UserPage. getjPanel29().removeAll();
             UserPage. getjPanel29().revalidate();
                 UserPage. getjPanel29().repaint();
                  UserPage. getjPanel21().revalidate();
                 UserPage. getjPanel21().repaint();
           }
        }
       
    }



    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;

}
