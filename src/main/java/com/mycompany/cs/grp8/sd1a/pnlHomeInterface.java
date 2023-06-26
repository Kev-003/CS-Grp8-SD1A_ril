package com.mycompany.cs.grp8.sd1a;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;

public class pnlHomeInterface extends AbstractBorder {

    private Color color;
    private int thickness = 4;
    private int radii = 8;
    private Insets insets = null;
    private BasicStroke stroke = null;
    private int strokePad;
    private int pointerPad = 4;
    private boolean left = true;
    RenderingHints hints;
    private Container parentContainer;

    public pnlHomeInterface(Color color, Container parentContainer) {
        this(color, 4, 20, 7, parentContainer);
    }

    public void setColor(Color color) {
        this.color = color;
        parentContainer.repaint();
    }

    public pnlHomeInterface(Color color, int thickness, int radii, int pointerSize, Container parentContainer) {
        this.thickness = thickness;
        this.radii = radii;
        this.color = color;
        this.parentContainer = parentContainer;

        stroke = new BasicStroke(thickness);
        strokePad = thickness;

        hints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int pad = radii + strokePad;
        int bottomPad = pad + pointerSize + strokePad;
        insets = new Insets(pad, pad, bottomPad, pad);
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

        // Create a rectangle to add from the bubble shape for certain corners
        Rectangle rect1 = new Rectangle(width - radii, 0, radii, radii);
        Rectangle rect2 = new Rectangle(0, height - radii, radii, radii);
        Rectangle rect3 = new Rectangle(width - radii, height - radii, radii, radii);

        // Create an area with the bubble shape
        Area area = new Area(bubble);

        // Create separate Graphics2D objects for each rectangle
        Graphics2D g2Rect1 = (Graphics2D) g.create();
        Graphics2D g2Rect2 = (Graphics2D) g.create();
        Graphics2D g2Rect3 = (Graphics2D) g.create();

        // Apply rendering hints to the separate Graphics2D objects
        g2Rect1.setRenderingHints(hints);
        g2Rect2.setRenderingHints(hints);
        g2Rect3.setRenderingHints(hints);

        // Fill the rectangles with the background color using the separate Graphics2D objects
        g2Rect1.setColor(color);
        g2Rect1.fill(rect1);

        g2Rect2.setColor(color);
        g2Rect2.fill(rect2);

        g2Rect3.setColor(color);
        g2Rect3.fill(rect3);

        // Subtract the rectangle from the area to remove the upper right corner
        area.add(new Area(rect1));
        area.add(new Area(rect2));
        area.add(new Area(rect3));

        // Fill the shape with the background color
        g2.setColor(color);
        g2.fill(area);

        // Draw the border
        g2.setColor(color);
        g2.setStroke(stroke);
        g2.draw(area);
    }
}
