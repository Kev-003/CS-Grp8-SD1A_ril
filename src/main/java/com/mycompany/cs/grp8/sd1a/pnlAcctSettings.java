package com.mycompany.cs.grp8.sd1a;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

public class pnlAcctSettings extends AbstractBorder {
    
    private Color color;
    private int thickness = 4;
    private int radii = 8;
    private BasicStroke stroke = null;
    private int strokePad;
    RenderingHints hints;
    private Container parentContainer;

    public pnlAcctSettings(Color color, Container parentContainer) {
        this(color, 4, 20, 7, parentContainer);
    }

    public void setColor(Color color) {
        this.color = color;
        parentContainer.repaint();
    }

    public pnlAcctSettings(Color color, int thickness, int radii, int pointerSize, Container parentContainer) {
        this.thickness = thickness;
        this.radii = radii;
        this.color = color;
        this.parentContainer = parentContainer;

        stroke = new BasicStroke(thickness);
        strokePad = thickness;

        hints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = 0;
        insets.top = 0;
        insets.right = 0;
        insets.bottom = 0;
        return insets;
    }

    @Override
    public void paintBorder(
            Component c,
            Graphics g,
            int x, int y,
            int width, int height) {

        Graphics2D g2 = (Graphics2D) g;

        int bottomLineY = height - thickness;

        RoundRectangle2D.Double bubble = new RoundRectangle2D.Double(
                0 + strokePad,
                0 + strokePad,
                width - thickness - strokePad,
                bottomLineY,
                radii,
                radii);

        g2.setRenderingHints(hints);

        // Create an area with the bubble shape
        Area area = new Area(bubble);

        // Fill the shape with the background color
        g2.setColor(color);
        g2.fill(area);

        // Draw the border
        g2.setColor(color);
        g2.setStroke(stroke);
        g2.draw(area);
    }
}
