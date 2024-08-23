package yasmeen.softwareproject;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class StarRadioButton extends JRadioButton {
    
    private final StarIcon starIcon;
    private final StarIcon selectedStarIcon;

    public StarRadioButton(String text, int size) {
        super(text);

        // Create star icons for both the normal and selected states
        starIcon = new StarIcon(size, getForeground());
        selectedStarIcon = new StarIcon(size, Color.YELLOW); // Customize color for the selected state

        // Set the icons
        setIcon(starIcon);
        setSelectedIcon(selectedStarIcon);

        // Optional: Remove the border and focus painting
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }

    // Custom StarIcon class within the StarRadioButton class
    private static class StarIcon implements Icon {
        private final int size;
        private final Color color;

        public StarIcon(int size, Color color) {
            this.size = size;
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Draw a star shape
            GeneralPath star = new GeneralPath();
            double outerRadius = size / 2.0;
            double innerRadius = outerRadius / 2.5;
            double centerX = x + outerRadius;
            double centerY = y + outerRadius;

            for (int i = 0; i < 10; i++) {
                double angle = Math.PI / 5.0 * i;
                double radius = (i % 2 == 0) ? outerRadius : innerRadius;
                double xPos = centerX + Math.cos(angle) * radius;
                double yPos = centerY + Math.sin(angle) * radius;

                if (i == 0) {
                    star.moveTo(xPos, yPos);
                } else {
                    star.lineTo(xPos, yPos);
                }
            }
            star.closePath();

            g2.setColor(color);
            g2.fill(star);

            g2.dispose();
        }

        @Override
        public int getIconWidth() {
            return size;
        }

        @Override
        public int getIconHeight() {
            return size;
        }
    }
}
